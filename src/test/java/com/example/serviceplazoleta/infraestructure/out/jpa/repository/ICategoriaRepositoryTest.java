package com.example.serviceplazoleta.infraestructure.out.jpa.repository;

import com.example.serviceplazoleta.infraestructure.out.jpa.entity.CategoriaEntity;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.ActiveProfiles;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

class ICategoriaRepositoryTest {
    private ICategoriaRepository categoriaRepository;

    @Mock
    private CategoriaEntity categoriaEntity;

    @BeforeEach
    public void setUp() {
        MockitoAnnotations.openMocks(this);
        categoriaRepository = Mockito.mock(ICategoriaRepository.class);
    }

    @Test
    public void testFindByIdCategoria() {
        when(categoriaRepository.findByIdCategoria(1L)).thenReturn(categoriaEntity);
        CategoriaEntity result = categoriaRepository.findByIdCategoria(1L);
        assertEquals(categoriaEntity, result);
    }

    public Optional<CategoriaEntity> convertToOptional(CategoriaEntity categoriaEntity) {
        return Optional.ofNullable(categoriaEntity);
    }

}