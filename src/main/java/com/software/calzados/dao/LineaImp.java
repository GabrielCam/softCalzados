package com.software.calzados.dao;

import com.software.calzados.models.Linea;
import com.software.calzados.models.OrdenProduccion;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import java.util.List;
@Repository
public class LineaImp implements LineaDao{

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public List<Linea> getLineas() {
        String query = "SELECT l FROM linea l";
        return entityManager.createQuery(query).getResultList();
    }

    @Override
    public void newLinea(Linea linea) {
        entityManager.merge(linea);
    }

    @Override
    public List<Linea> getLibres() {
        TypedQuery<Linea> query = entityManager.createQuery("SELECT l FROM linea l WHERE estadoDeLinea = 'DISPONIBLE'",Linea.class);
        return query.getResultList();
    }
}
