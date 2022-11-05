package com.software.calzados.dao;

import com.software.calzados.models.Linea;

import java.util.List;

public interface LineaDao {
    public List<Linea> getLineas();

    public void newLinea(Linea linea);
}
