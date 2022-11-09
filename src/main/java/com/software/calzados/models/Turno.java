package com.software.calzados.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.List;

@Entity(name = "turno")
@Table(name = "turno")
public class Turno {
    @Id
    @Column(name = "id")
    @Getter @Setter @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Getter @Setter @Column(name = "horaInicio")
    private LocalDateTime horaInicio;

    @Getter @Setter @Column(name = "horaFin")
    private LocalDateTime horaFin;

    @Getter @Setter @Column(name = "descripcion")
    private String descripcion;

    @ManyToMany(fetch = FetchType.LAZY)
    @JoinColumn(name = "id",nullable = true,insertable=false, updatable=false)
    private List<JornadaLaboral> jornadaLaboral;
}
