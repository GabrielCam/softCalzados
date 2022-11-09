package com.software.calzados.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.List;

@Entity(name = "jornadalaboral")
@Table(name = "jornadalaboral")
public class JornadaLaboral {
    @Id
    @Getter @Setter @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Getter @Setter @Column(name = "inicial")
    private LocalDateTime inicial;

    @Getter @Setter @Column(name = "final")
    private LocalDateTime finall;

    @Getter @Setter @Column(name = "totalPrimera")
    private int totalPrimera;

    @Getter @Setter @Column(name = "totalSegunda")
    private int totalSegunda;

    @ManyToMany(fetch = FetchType.LAZY)
    @JoinColumn(name = "id",nullable = true,insertable=false, updatable=false)
    @JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
    private List<Turno> turno;

}
