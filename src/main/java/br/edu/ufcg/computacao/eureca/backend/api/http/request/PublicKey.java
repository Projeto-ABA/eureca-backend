package br.edu.ufcg.computacao.eureca.backend.api.http.request;

import br.edu.ufcg.computacao.eureca.backend.constants.ApiDocumentation;
import br.edu.ufcg.computacao.eureca.backend.constants.Messages;
import br.edu.ufcg.computacao.eureca.backend.constants.SystemConstants;
import br.edu.ufcg.computacao.eureca.backend.core.ApplicationFacade;
import br.edu.ufcg.computacao.eureca.backend.api.http.response.PublicKeyResponse;
import br.edu.ufcg.computacao.eureca.common.exceptions.EurecaException;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.apache.log4j.Logger;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@CrossOrigin
@RestController
@RequestMapping(value = PublicKey.ENDPOINT)
@Api(description = ApiDocumentation.PublicKey.API)

public class PublicKey {
    public static final String ENDPOINT = SystemConstants.SERVICE_BASE_ENDPOINT + "publicKey";

    private final Logger LOGGER = Logger.getLogger(PublicKey.class);

    @ApiOperation(value = ApiDocumentation.PublicKey.GET_PUBLICKEY)
    @RequestMapping(method = RequestMethod.GET)
    public ResponseEntity<PublicKeyResponse> getPublicKey() throws EurecaException {

        try {
            LOGGER.info(br.edu.ufcg.computacao.eureca.common.constants.Messages.RECEIVING_GET_PUBLIC_KEY_REQUEST);
            String publicKeyValue = ApplicationFacade.getInstance().getPublicKey();
            return new ResponseEntity<>(new PublicKeyResponse(publicKeyValue), HttpStatus.OK);
        } catch (EurecaException e) {
            LOGGER.info(String.format(Messages.SOMETHING_WENT_WRONG, e.getMessage()), e);
            throw e;
        }
    }
}
