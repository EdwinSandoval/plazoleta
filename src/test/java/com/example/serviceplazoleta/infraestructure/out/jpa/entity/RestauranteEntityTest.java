package com.example.serviceplazoleta.infraestructure.out.jpa.entity;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

class RestauranteEntityTest {
    @Test
    public void testGetterAndSetterMethods() {
        // Crear una instancia de RestauranteEntity
        RestauranteEntity restauranteEntity = new RestauranteEntity();

        // Establecer valores en los campos
        Long idRestaurante = 1L;
        restauranteEntity.setIdRestaurante(idRestaurante);
        String nombre = "Nombre del restaurante";
        restauranteEntity.setNombre(nombre);
        String direccion = "Dirección del restaurante";
        restauranteEntity.setDireccion(direccion);
        String telefono = "123456789";
        restauranteEntity.setTelefono(telefono);
        String urlLogo = "URL del logo";
        restauranteEntity.setUrlLogo(urlLogo);
        String nit = "123456789";
        restauranteEntity.setNit(nit);
        Long idPropietario = 1L;
        restauranteEntity.setIdPropietario(idPropietario);
        List<PedidoEntity> pedidos = new ArrayList<>();
        // Agregar pedidos a la lista de pedidos
        PedidoEntity pedido1 = new PedidoEntity();
        pedidos.add(pedido1);
        PedidoEntity pedido2 = new PedidoEntity();
        pedidos.add(pedido2);
        restauranteEntity.setPedido(pedidos);
        List<PlatoEntity> platos = new ArrayList<>();
        // Agregar platos a la lista de platos
        PlatoEntity plato1 = new PlatoEntity();
        platos.add(plato1);
        PlatoEntity plato2 = new PlatoEntity();
        platos.add(plato2);
        restauranteEntity.setPlatos(platos);

        // Verificar los valores utilizando los métodos getter
        Assertions.assertEquals(idRestaurante, restauranteEntity.getIdRestaurante());
        Assertions.assertEquals(nombre, restauranteEntity.getNombre());
        Assertions.assertEquals(direccion, restauranteEntity.getDireccion());
        Assertions.assertEquals(telefono, restauranteEntity.getTelefono());
        Assertions.assertEquals(urlLogo, restauranteEntity.getUrlLogo());
        Assertions.assertEquals(nit, restauranteEntity.getNit());
        Assertions.assertEquals(idPropietario, restauranteEntity.getIdPropietario());
        Assertions.assertEquals(pedidos, restauranteEntity.getPedido());
        Assertions.assertEquals(platos, restauranteEntity.getPlatos());
    }
}