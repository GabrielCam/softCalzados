package com.software.calzados.dao;

import com.software.calzados.models.Linea;

import java.util.List;

public interface LineaDao {
    public List<Linea> getLineas();

    public Linea newLinea(Linea linea);

    public List<Linea> getLibres();
}
