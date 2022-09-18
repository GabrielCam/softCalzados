package com.software.calzados.dao;


import com.software.calzados.models.Color;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@Transactional
public interface ColorDao {
    public void newColor(Color color);
}
