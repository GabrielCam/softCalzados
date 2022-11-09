package com.software.calzados.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity(name = "hermanado")
@Table(name = "hermanado")
public class Hermanado {

    @Id
    @Getter @Setter @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Getter @Setter @Column(name = "hora")
    private LocalDateTime hora;

    @Enumerated(EnumType.STRING)
    @Getter @Setter @Column(name = "pie")
    private Pie pie;


    @ManyToOne(fetch = FetchType.LAZY,optional = false)
    @JoinColumn(name = "id",nullable = false,insertable=false, updatable=false)
    @OnDelete(action = OnDeleteAction.CASCADE)
    @JsonIgnore
    private JornadaLaboral jornadaLaboral;


}
