package com.software.calzados.models;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity(name = "OrdenProduccion")
public class OrdenProduccion {


    @Id
    @Getter @Setter @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int numero;

    @Getter @Setter @Column(name = "inicio")
    private LocalDateTime inicio;

    @Getter @Setter @Column(name = "fin")
    private LocalDateTime fin;

    @Enumerated(EnumType.STRING)
    @Getter @Setter @Column(name = "estado")
    private Estado estado;

    @ManyToOne
    @Getter @Setter
    private Modelo modelo;


}
