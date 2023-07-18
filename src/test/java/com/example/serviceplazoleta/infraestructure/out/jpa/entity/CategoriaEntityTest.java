package com.example.serviceplazoleta.infraestructure.out.jpa.entity;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

class CategoriaEntityTest {
    @Test
    public void testGetterAndSetterMethods() {
        // Crear una instancia de CategoriaEntity
        CategoriaEntity categoriaEntity = new CategoriaEntity();

        // Establecer valores en los campos
        Long idCategoria = 1L;
        categoriaEntity.setIdCategoria(idCategoria);
        String nombre = "Fritos";
        categoriaEntity.setNombre(nombre);
        String descripcion = "Rico en proteinas";
        categoriaEntity.setDescripcion(descripcion);
        List<PlatoEntity> platos = new ArrayList<>();
        // Agregar platos a la lista de platos
        PlatoEntity plato1 = new PlatoEntity();
        platos.add(plato1);
        PlatoEntity plato2 = new PlatoEntity();
        platos.add(plato2);
        categoriaEntity.setPlatos(platos);

        // Verificar los valores utilizando los métodos getter
        Assertions.assertEquals(idCategoria, categoriaEntity.getIdCategoria());
        Assertions.assertEquals(nombre, categoriaEntity.getNombre());
        Assertions.assertEquals(descripcion, categoriaEntity.getDescripcion());
        Assertions.assertEquals(platos, categoriaEntity.getPlatos());
    }
}