package com.software.calzados.dao;

import com.software.calzados.models.OrdenProduccion;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import java.util.List;

@Repository
@Transactional
public class OrdenProduccionImp implements OrdenProduccionDao {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public void newOrdenProduccion(OrdenProduccion ordenProduccion) {
        entityManager.merge(ordenProduccion);
    }

//    @Override
//    public List<OrdenProduccion> getOrdenProduccionLibre() {
//       TypedQuery<OrdenProduccion> query = entityManager.createQuery("SELECT o FROM OrdenProduccion o WHERE estado != 'INICIADA'",OrdenProduccion.class);
//        return query.getResultList();
//    }
}
