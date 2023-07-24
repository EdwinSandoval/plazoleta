package com.example.serviceplazoleta.infraestructure.input.rest;

import com.amazonaws.auth.AWSStaticCredentialsProvider;
import com.amazonaws.auth.BasicAWSCredentials;
import com.amazonaws.regions.Regions;
import com.amazonaws.services.cognitoidp.AWSCognitoIdentityProvider;
import com.amazonaws.services.cognitoidp.AWSCognitoIdentityProviderClientBuilder;
import com.amazonaws.services.cognitoidp.model.AuthenticationResultType;
import com.amazonaws.services.cognitoidp.model.InitiateAuthRequest;
import com.amazonaws.services.cognitoidp.model.InitiateAuthResult;
import com.amazonaws.services.cognitoidp.model.NotAuthorizedException;
import com.amazonaws.services.migrationhubrefactorspaces.model.ErrorResponse;
import com.example.serviceplazoleta.aws.Model.AuthResponse;
import com.example.serviceplazoleta.infraestructure.exceptionhandler.ErrorCredenciales;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/login")

//@RequiredArgsConstructor
public class AwsRestController {
    String clientId = "7fm0h2p3er8okhh0qrrkfs8dmn";
    String accessKey = "AKIA4LAUW75XSDG4KCBD";
    String secretKey = "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";
    @GetMapping("/login")
    public ResponseEntity<?> iniciarSesion(@RequestParam String username, @RequestParam String password) {

        BasicAWSCredentials awsCredentials = new BasicAWSCredentials(accessKey, secretKey);
        AWSCognitoIdentityProvider cognitoClient = AWSCognitoIdentityProviderClientBuilder.standard()
                .withCredentials(new AWSStaticCredentialsProvider(awsCredentials))
                .withRegion(Regions.US_EAST_1) // Cambia la región según la configuración de tu User Pool
                .build();

        InitiateAuthRequest authRequest = new InitiateAuthRequest();
        authRequest.setAuthFlow("USER_PASSWORD_AUTH");
        authRequest.setClientId(clientId); // Reemplaza por tu client ID
        authRequest.addAuthParametersEntry("USERNAME", username);
        authRequest.addAuthParametersEntry("PASSWORD", password);

        try {
            InitiateAuthResult authResult = cognitoClient.initiateAuth(authRequest);
            AuthenticationResultType authenticationResult = authResult.getAuthenticationResult();

            AuthResponse authResponse = new AuthResponse();
            authResponse.setAccessToken(authenticationResult.getAccessToken());
            authResponse.setIdToken(authenticationResult.getIdToken());
            // Devuelve los tokens como respuesta
            return ResponseEntity.ok(authResponse);

        } catch (NotAuthorizedException e) {
            // Maneja cualquier error que ocurra durante el proceso de inicio de sesión
            ErrorCredenciales errorResponse = new ErrorCredenciales(e.getErrorMessage());
            return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body(errorResponse);
        }
    }
}
