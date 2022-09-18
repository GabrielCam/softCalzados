package com.software.calzados.dao;

import com.software.calzados.models.Color;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Repository
@Transactional
public class ColorImp implements ColorDao{
    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public void newColor(Color color){entityManager.merge(color);}
}


