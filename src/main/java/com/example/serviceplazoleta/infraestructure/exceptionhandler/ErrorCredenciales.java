package com.example.serviceplazoleta.infraestructure.exceptionhandler;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ErrorCredenciales {
    private String message;

    public ErrorCredenciales(String message) {
        this.message = message;
    }
}
