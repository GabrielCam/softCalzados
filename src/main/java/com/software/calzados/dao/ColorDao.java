package com.software.calzados.dao;


import com.software.calzados.models.Color;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
@Transactional
public interface ColorDao {
    public Color newColor(Color color);

    public List<Color> getColores();


    public Color getColorById(int id);

}
