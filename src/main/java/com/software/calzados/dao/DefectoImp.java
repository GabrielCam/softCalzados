package com.software.calzados.dao;


import com.software.calzados.models.Defecto;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Repository
@Transactional
public class DefectoImp implements DefectoDao {
    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public Defecto newDefecto(Defecto defecto) {
        return entityManager.merge(defecto);
    }

    @Override
    public Defecto getDefectoById(int id) {
        return entityManager.find(Defecto.class, id);
    }
}
