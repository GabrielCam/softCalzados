package com.software.calzados.dao;

import com.software.calzados.models.Modelo;

import java.util.List;

public interface ModeloDao {
    public Modelo newModelo(Modelo modelo);

    public List<Modelo> getModelos();

    public Modelo getModeloById(int id);
}
