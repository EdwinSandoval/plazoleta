package com.example.serviceplazoleta.domain.api;

import com.example.serviceplazoleta.domain.model.RestauranteModel;

import java.util.List;

public interface IRestauranteServicePort {

    RestauranteModel guardarRestaurante(RestauranteModel restauranteModel);

    List<RestauranteModel> listarRestaurantes();

    RestauranteModel obtenerRestauranteId(Long idRest);
}
