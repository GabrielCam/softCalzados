package com.software.calzados.dao;

import com.software.calzados.models.Modelo;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Repository
@Transactional
public class ModeloImp implements ModeloDao{
    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public void newModelo(Modelo modelo) {
        entityManager.merge(modelo);
    }
}
