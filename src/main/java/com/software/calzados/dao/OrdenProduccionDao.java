package com.software.calzados.dao;

import com.software.calzados.models.OrdenProduccion;

import java.util.List;

public interface OrdenProduccionDao {
    public void newOrdenProduccion(OrdenProduccion ordenProduccion);

    public List<OrdenProduccion> getOrdenProduccionLibre();
}
