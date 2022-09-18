package com.software.calzados.models;

import lombok.Getter;
import lombok.Setter;


import javax.persistence.*;

@Entity
@Table(name ="color")


public class Color {

    @Id
    @Getter @Setter @GeneratedValue (strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int codigo;
    
    @Getter @Setter @Column(name = "descripcion")
    private String descripcion;

    public Color() {
    }
}

