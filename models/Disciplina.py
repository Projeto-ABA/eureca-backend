# coding: utf-8
import sys
sys.path.append("./connection")
from Connection import Connection
from flask import jsonify

class Disciplina():

  def __init__(self):
    self.connection = Connection()


  # Calcula as taxas de sucesso por tipo de disciplinas. Onde é passado o tipo da disciplina
  ## e são retornados os números de matrículas totais e aprovadas, para que sejam calculadas
  ### as taxas de sucesso de cada uma dessas disciplinas. 
  def get_success_rates_by_subject_group(self, id_tipo_disciplina, args):

    base_query = 'SELECT "Disciplina".codigo, COUNT("DiscenteDisciplina".*) \
      FROM "DiscenteDisciplina" \
      INNER JOIN "DiscenteVinculo" \
        ON "DiscenteDisciplina".matricula = "DiscenteVinculo".matricula \
      INNER JOIN "Turma" \
        ON "DiscenteDisciplina".id_turma = "Turma".id \
      INNER JOIN "Disciplina" \
        ON "Turma".id_disciplina = "Disciplina".id \
      INNER JOIN "Curriculo" \
        ON "Disciplina".codigo = "Curriculo".codigo_disciplina \
      AND "DiscenteVinculo".id_curso = 5 \
      AND "Curriculo".id_tipo_disciplina = ' + str(id_tipo_disciplina)

    # caso seja passado apenas o filtro 'de'.
    if (len(args) == 1):
      periodo = args.get('de')

      matriculas_totais = base_query + 'AND "Turma".periodo=\'' + str(periodo) + '\' \
        GROUP BY "Disciplina".codigo'

      matriculas_aprovadas = base_query + 'AND "Turma".periodo=\'' + str(periodo) + '\' \
        AND "DiscenteDisciplina".id_situacao = 1 \
        GROUP BY "Disciplina".codigo'

    # caso sejam passados os filtros 'de' e 'ate'.
    elif (len(args) == 2):
      minimo = args.get('de')
      maximo = args.get('ate')

      if (minimo > maximo or minimo == maximo):
        return { "error": "Parameters or invalid request" }, 404

      matriculas_totais = base_query + 'AND "Turma".periodo BETWEEN \'' + str(minimo) + '\' AND \'' + str(maximo) + '\'\' \
        GROUP BY "Disciplina".codigo'

      matriculas_aprovadas = base_query + 'AND "Turma".periodo BETWEEN \'' + str(minimo) + '\' AND \'' + str(maximo) + '\'\' \
        AND "DiscenteDisciplina".id_situacao = 1 \
        GROUP BY "Disciplina".codigo'

    # caso não seja passado filtro algum.
    else:
      matriculas_totais = base_query + 'GROUP BY "Disciplina".codigo'

      matriculas_aprovadas = base_query + 'AND "DiscenteDisciplina".id_situacao = 1 \
        GROUP BY "Disciplina".codigo'

    total = self.connection.select(matriculas_totais)
    aprovadas = self.connection.select(matriculas_aprovadas)

    # calcula a taxa de sucesso para cada uma das disciplinas de um agrupamento.
    success_rates = []
    for i in range(len(total)):
      success_rate = aprovadas[i][1] / total[i][1]
      success_rates.append(round(success_rate, 2) * 100)

    success_rates.sort()

    return success_rates


  # Calcula a posição central do array de dados para o boxplot, no que depender se o tamanho
  ## do array é ímpar ou par.
  def get_mid(self, data):
    size = len(data)

    if (size > 1):
      if (size % 2 == 0):
        index = size // 2
        mid_1 = data[index]
        mid_2 = data[index - 1]
        result = (mid_1 + mid_2) / 2
      else:
        index = size // 2
        result = data[index]

    return result

  
  # Calcula os quantis para o boxplot: q1, q2 e q3.
  def get_values_boxplot(self, data):
    size = len(data)
    index = size // 2
    mid_1 = data[index]
    mid_2 = data[index - 1]

    if (size >= 5):
      if (size % 2 == 0):
        q1 = self.get_mid(data[:index-1])
        q2 = (mid_1 + mid_2) / 2
        q3 = self.get_mid(data[index+1:size])
      else:
        q1 = self.get_mid(data[:index])
        q2 = data[index]
        q3 = self.get_mid(data[index+1:size])
      
      return [q1, q2, q3]
    
    else:
      return [0, 0, 0]
  

  # Calcula os pontos fora dos limites superior e inferior do boxplot.
  def get_outliers(self, data, lim_inf, lim_sup):
    outliers = []
    for i in range(len(data)):
      if (data[i] < lim_inf or data[i] > lim_sup):
        outliers.append(data[i])
    
    return outliers


  # Processa a querie para cada um dos agrupamentos e retorna a resposta json com todas as
  ## informações para os boxplot's de cada um dos grupos de disciplinas.
  def get_success_rates_of_all_subjects_group(self, args):
    labels = ['Obrigatórias', 'Optativas gerais', 'Optativas específicas', 'Complementares',
      'Extracurriculares']
    success_rates = []
    for i in range(1, 4):
      success_rates.append(self.get_success_rates_by_subject_group(i, args))

    response = []
    for i in range(len(success_rates)):
      q1, q2, q3 = self.get_values_boxplot(success_rates[i])

      lim_inf = max(success_rates[i][0], q1 - (1.5 * (q3 - q1)))
      lim_sup = min(success_rates[i][len(success_rates[i]) - 1], q3 + (1.5 * (q3 - q1)))

      outliers = self.get_outliers(success_rates[i], lim_inf, lim_sup)
      
      response.append({
        "group": labels[i],
        "data": {
          "lim_inf": lim_inf,
          "lim_sup": lim_sup,
          "q1": q1,
          "q2": q2,
          "q3": q3,
          "outliers": outliers,
        }
      })

    return response
      