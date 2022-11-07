package com.software.calzados.dao;

import com.software.calzados.models.Modelo;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Repository
@Transactional
public class ModeloImp implements ModeloDao {
    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public Modelo newModelo(Modelo modelo) {
        return entityManager.merge(modelo);
    }

    @Override
    public List<Modelo> getModelos() {
        String query = "SELECT m FROM modelo m";
        return entityManager.createQuery(query).getResultList();
    }

    @Override
    public Modelo getModeloById(int id) {
        return entityManager.find(Modelo.class, id);
    }
}
