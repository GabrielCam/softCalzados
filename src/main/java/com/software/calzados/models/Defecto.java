package com.software.calzados.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;


import javax.persistence.*;

@Entity(name = "defecto")
public class Defecto {


    @Id
    @Getter @Setter @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Enumerated(EnumType.STRING)
    @Getter @Setter @Column(name = "tipoDefecto")
    private TipoDefecto tipoDefecto;

    @Getter @Setter @Column(name = "descripcion")
    private String descripcion;

    @ManyToOne(fetch = FetchType.LAZY,optional = false)
    @JoinColumn(name = "id",nullable = false,insertable=false, updatable=false)
    @OnDelete(action = OnDeleteAction.CASCADE)
    @JsonIgnore
    private Hermanado hermanado;
}
