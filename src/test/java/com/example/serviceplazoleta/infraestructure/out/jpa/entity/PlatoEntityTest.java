package com.example.serviceplazoleta.infraestructure.out.jpa.entity;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

class PlatoEntityTest {
    @Test
    public void testConstructorAndGetters() {
        // Crear una lista de pedidoPlatos
        List<Pedido_PlatosEntity> pedidoPlatos = new ArrayList<>();
        // Agregar pedidoPlatos a la lista de pedidoPlatos
        Pedido_PlatosEntity pedidoPlato1 = new Pedido_PlatosEntity();
        pedidoPlatos.add(pedidoPlato1);
        Pedido_PlatosEntity pedidoPlato2 = new Pedido_PlatosEntity();
        pedidoPlatos.add(pedidoPlato2);

        // Crear una instancia de PlatoEntity utilizando el constructor
        PlatoEntity platoEntity = new PlatoEntity(
                1L, // id
                "Nombre del plato", // nombre
                "Descripción del plato", // descripcion
                100, // precio
                "URL de la imagen", // urlImagen
                true, // activo
                new CategoriaEntity(), // categoria
                new RestauranteEntity(), // restaurant
                pedidoPlatos // pedidoPlatos
        );

        // Verificar los valores utilizando los métodos getter
        Assertions.assertEquals(1L, platoEntity.getId());
        Assertions.assertEquals("Nombre del plato", platoEntity.getNombre());
        Assertions.assertEquals("Descripción del plato", platoEntity.getDescripcion());
        Assertions.assertEquals(100, platoEntity.getPrecio());
        Assertions.assertEquals("URL de la imagen", platoEntity.getUrlImagen());
        Assertions.assertTrue(platoEntity.getActivo());
        Assertions.assertNotNull(platoEntity.getCategoria());
        Assertions.assertNotNull(platoEntity.getRestaurant());
        Assertions.assertEquals(pedidoPlatos, platoEntity.getPedidoPlatos());
    }

    @Test
    public void testSetterMethods() {
        // Crear una instancia de PlatoEntity
        PlatoEntity platoEntity = new PlatoEntity();

        // Establecer valores en los campos utilizando los métodos setter
        platoEntity.setId(1L);
        platoEntity.setNombre("Nombre del plato");
        platoEntity.setDescripcion("Descripción del plato");
        platoEntity.setPrecio(100);
        platoEntity.setUrlImagen("URL de la imagen");
        platoEntity.setActivo(true);
        platoEntity.setCategoria(new CategoriaEntity());
        platoEntity.setRestaurant(new RestauranteEntity());
        List<Pedido_PlatosEntity> pedidoPlatos = new ArrayList<>();
        // Agregar pedidoPlatos a la lista de pedidoPlatos
        Pedido_PlatosEntity pedidoPlato1 = new Pedido_PlatosEntity();
        pedidoPlatos.add(pedidoPlato1);
        Pedido_PlatosEntity pedidoPlato2 = new Pedido_PlatosEntity();
        pedidoPlatos.add(pedidoPlato2);
        platoEntity.setPedidoPlatos(pedidoPlatos);

        // Verificar los valores utilizando los métodos getter
        Assertions.assertEquals(1L, platoEntity.getId());
        Assertions.assertEquals("Nombre del plato", platoEntity.getNombre());
        Assertions.assertEquals("Descripción del plato", platoEntity.getDescripcion());
        Assertions.assertEquals(100, platoEntity.getPrecio());
        Assertions.assertEquals("URL de la imagen", platoEntity.getUrlImagen());
        Assertions.assertTrue(platoEntity.getActivo());
        Assertions.assertNotNull(platoEntity.getCategoria());
        Assertions.assertNotNull(platoEntity.getRestaurant());
        Assertions.assertEquals(pedidoPlatos, platoEntity.getPedidoPlatos());
    }
}