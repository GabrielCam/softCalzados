package com.software.calzados.dao;

import com.software.calzados.models.Color;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Repository
@Transactional
public class ColorImp implements ColorDao {
    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public Color newColor(Color color) {
        return entityManager.merge(color);
    }

    @Override
    public List<Color> getColores() {
        return entityManager.createQuery("FROM color").getResultList();
    }

    @Override
    public Color getColorById(int id) {
        return entityManager.find(Color.class,id);
    }


}


