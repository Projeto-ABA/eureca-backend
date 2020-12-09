package br.edu.ufcg.computacao.eureca.backend.core.holders;

import br.edu.ufcg.computacao.eureca.backend.constants.ConfigurationPropertyKeys;
import br.edu.ufcg.computacao.eureca.common.exceptions.EurecaException;
import br.edu.ufcg.computacao.eureca.common.util.PublicKeyUtil;
import br.edu.ufcg.computacao.eureca.as.api.http.request.PublicKey;

import java.security.interfaces.RSAPublicKey;

public class EurecaAsPublicKeyHolder {
    private RSAPublicKey asPublicKey;

    private static EurecaAsPublicKeyHolder instance;

    private EurecaAsPublicKeyHolder() {
    }

    public static synchronized EurecaAsPublicKeyHolder getInstance() {
        if (instance == null) {
            instance = new EurecaAsPublicKeyHolder();
        }
        return instance;
    }

    public RSAPublicKey getAsPublicKey() throws EurecaException {
        if (this.asPublicKey == null) {
            String asAddress = null;
            String asPort = null;
            asAddress = PropertiesHolder.getInstance().getProperty(ConfigurationPropertyKeys.AS_URL_KEY);
            asPort = PropertiesHolder.getInstance().getProperty(ConfigurationPropertyKeys.AS_PORT_KEY);
            this.asPublicKey = PublicKeyUtil.getPublicKey(asAddress, asPort, PublicKey.ENDPOINT);
        }
        return this.asPublicKey;
    }
}
