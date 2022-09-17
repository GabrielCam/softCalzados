package com.software.calzados.models;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
public class Modelo {
    @Id
    @Getter @Setter @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Getter @Setter @Column(name = "sku")
    private String sku;

    @Getter @Setter @Column(name = "denominacion")
    private String denominacion;

    @Getter @Setter @Column(name = "limiteSuperiorReproceso")
    private int limiteSuperiorReproceso;

    @Getter @Setter @Column(name = "limiteSuperiorObservados")
    private int limiteSuperiorObservados;

    @Getter @Setter @Column(name = "limiteInferiorReproceso")
    private int limiteInferiorReproceso;

    @Getter @Setter @Column(name = "limiteInferiorObservados")
    private int limiteInferiorObservados;
}
