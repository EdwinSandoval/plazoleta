package com.example.serviceplazoleta.aws.Model;

import com.amazonaws.services.migrationhubrefactorspaces.model.ErrorResponse;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class AuthResponseWrapper {
    private AuthResponse authResponse;
    private ErrorResponse errorResponse;
}
