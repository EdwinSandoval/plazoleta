package com.example.serviceplazoleta.application.handler.impl;

import com.example.serviceplazoleta.application.dto.request.RestauranteRequestDto;
import com.example.serviceplazoleta.application.dto.response.Restaurante.ObtenerRestauranteIdResponseDto;
import com.example.serviceplazoleta.application.dto.response.RestauranteResponseDto;
import com.example.serviceplazoleta.application.handler.IRestauranteHandler;
import com.example.serviceplazoleta.application.mapper.IRestauranteRequestMapper;
import com.example.serviceplazoleta.application.mapper.IRestauranteResponseMapper;
import com.example.serviceplazoleta.domain.api.IRestauranteServicePort;
import com.example.serviceplazoleta.domain.model.RestauranteModel;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@RequiredArgsConstructor//automaticamnete genera constructor a lo que hallamos definido como final
@Service//toma la clase como un bean y ya se puede inyectar
@Transactional
public class RestauranteHandler  implements IRestauranteHandler {

    private final IRestauranteServicePort restauranteServicePort;
    private final IRestauranteRequestMapper restauranteRequestMapper;
    private final IRestauranteResponseMapper restauranteResponseMapper;

    @Override
    public RestauranteResponseDto guardarRestaurante(RestauranteRequestDto restauranteRequestDto) {
        RestauranteModel restauranteModel = restauranteRequestMapper.toRestaurante(restauranteRequestDto);
        return restauranteResponseMapper.toResponse(restauranteServicePort.guardarRestaurante(restauranteModel));
    }

    @Override
    public List<RestauranteResponseDto> listarRestaurantes() {
        return restauranteResponseMapper.toResponseList(restauranteServicePort.listarRestaurantes());
    }

    @Override
    public ObtenerRestauranteIdResponseDto obtenerRestauranteId(Long idRest) {
        RestauranteModel restauranteModel=restauranteServicePort.obtenerRestauranteId(idRest);
        return restauranteResponseMapper.toResponseId(restauranteModel);
    }

}
