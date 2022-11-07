package com.software.calzados.dao;

import com.software.calzados.models.Linea;
import com.software.calzados.models.OrdenProduccion;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
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
    public Linea newLinea(Linea linea) {
        return entityManager.merge(linea);
    }

    @Override
    public List<Linea> getLineas() {
        String query = "SELECT l FROM linea l";

        return entityManager.createQuery(query).getResultList();
    }

    @Override
    public List<Linea> getLibres() {
       return entityManager.createQuery("SELECT l FROM linea l where estadoDeLinea = 'DISPONIBLE'").getResultList();
    }
}
