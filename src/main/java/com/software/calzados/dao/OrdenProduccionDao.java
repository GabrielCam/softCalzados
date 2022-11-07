package com.software.calzados.dao;

import com.software.calzados.models.OrdenProduccion;

import java.util.List;

public interface OrdenProduccionDao {
    public OrdenProduccion newOrdenProduccion(OrdenProduccion ordenProduccion);

   public List<OrdenProduccion> getOrdenProduccion();

//    public List<OrdenProduccion> getOrdenProduccionLibre();
}
