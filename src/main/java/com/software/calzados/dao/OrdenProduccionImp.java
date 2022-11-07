package com.software.calzados.dao;

import com.software.calzados.models.OrdenProduccion;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Repository
@Transactional
public class OrdenProduccionImp implements OrdenProduccionDao {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public OrdenProduccion newOrdenProduccion(OrdenProduccion ordenProduccion) {
        return entityManager.merge(ordenProduccion);
    }

    @Override
    public List<OrdenProduccion> getOrdenProduccion() {
        String query = "SELECT o FROM OrdenProduccion o";
        return entityManager.createQuery(query).getResultList();
    }

//    @Override
//    public List<OrdenProduccion> getOrdenProduccionLibre() {
//       TypedQuery<OrdenProduccion> query = entityManager.createQuery("SELECT o FROM OrdenProduccion o WHERE estado != 'INICIADA'",OrdenProduccion.class);
//        return query.getResultList();
//    }
}
