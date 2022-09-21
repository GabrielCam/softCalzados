package com.software.calzados.dao;

import com.software.calzados.models.OrdenProduccion;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Repository
@Transactional
public class OrdenProduccionImp implements OrdenProduccionDao {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public void newOrdenProduccion(OrdenProduccion ordenProduccion) {
        entityManager.merge(ordenProduccion);
    }
}
