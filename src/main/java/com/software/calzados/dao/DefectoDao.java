package com.software.calzados.dao;

import com.software.calzados.models.Defecto;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@Transactional
public interface DefectoDao {
    public void newDefecto(Defecto defecto);

    }

