package com.software.calzados.models;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity(name = "defecto")
public class Defecto {

//    hola loco
    @Id
    @Getter @Setter @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @OneToMany


    @Enumerated(EnumType.STRING)
    @Getter @Setter @Column(name = "tipoDefecto")
    private TipoDefecto tipoDefecto;

    @Getter @Setter @Column(name = "descripcion")
    private String descripcion;
}
