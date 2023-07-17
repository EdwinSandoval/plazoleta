package com.example.serviceplazoleta.infraestructure.out.jpa.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "pedido")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class PedidoEntity {
    @Id
    @Column(name = "idPedido")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    Long idCliente;

    @Column(nullable = false)
    private Date fecha;

    @Column(nullable = false)
    private String estado;

    @Column(nullable = false)
    private Long idChef;

    @ManyToOne
    @JoinColumn(name = "idRestaurante" ,nullable = false)
    private RestauranteEntity restaurant;

    @OneToMany(mappedBy = "pedido")
    private List<Pedido_PlatosEntity> pedidoPlatos;

}
