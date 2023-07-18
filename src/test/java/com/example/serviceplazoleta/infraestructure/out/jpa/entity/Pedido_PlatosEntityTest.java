package com.example.serviceplazoleta.infraestructure.out.jpa.entity;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Pedido_PlatosEntityTest {
    @Test
    public void testGetterAndSetterMethods() {
        // Crear una instancia de Pedido_PlatosEntity
        Pedido_PlatosEntity pedidoPlatosEntity = new Pedido_PlatosEntity();

        // Establecer valores en los campos
        Long idPedidoPlatos = 1L;
        pedidoPlatosEntity.setIdPedidoPlatos(idPedidoPlatos);
        int cantidad = 2;
        pedidoPlatosEntity.setCantidad(cantidad);
        PlatoEntity platoEntity = new PlatoEntity();
        pedidoPlatosEntity.setPlatos(platoEntity);
        PedidoEntity pedidoEntity = new PedidoEntity();
        pedidoPlatosEntity.setPedido(pedidoEntity);

        // Verificar los valores utilizando los métodos getter
        Assertions.assertEquals(idPedidoPlatos, pedidoPlatosEntity.getIdPedidoPlatos());
        Assertions.assertEquals(cantidad, pedidoPlatosEntity.getCantidad());
        Assertions.assertEquals(platoEntity, pedidoPlatosEntity.getPlatos());
        Assertions.assertEquals(pedidoEntity, pedidoPlatosEntity.getPedido());
    }
}