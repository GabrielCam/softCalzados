package com.software.calzados.models;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity(name = "linea")
@Table(name = "linea")
public class Linea {
    @Column(name = "id")
    @Id @Getter @Setter @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int numeroLinea;

    @Enumerated(EnumType.STRING)
    @Getter @Setter @Column(name = "estadoLinea")
    private EstadoDeLinea estadoDeLinea;

    @OneToOne()
    @Getter @Setter @JoinColumn(name = "id")
    private OrdenProduccion ordenProduccion;
}
