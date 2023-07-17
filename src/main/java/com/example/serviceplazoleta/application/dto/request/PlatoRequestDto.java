package com.example.serviceplazoleta.application.dto.request;

import com.example.serviceplazoleta.application.dto.response.CategoriaResponseDto;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class PlatoRequestDto {

    private String nombre;

    private String descripcion;

    private int precio;

    private String urlImagen;

    private boolean activo;

    private PlatoCategoriaRequestdto categoria;

    private PlatoRestauranteRequestDto restaurant;


}
