package com.software.calzados.controllers;

import com.software.calzados.dao.LineaDao;
import com.software.calzados.models.Linea;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@Transactional
public class LineaController {
    @Autowired
    private LineaDao lineaDao;

    @RequestMapping(value = "api/linea")
    public List<Linea> getLineas(){
       return lineaDao.getLineas();
    }

    @RequestMapping(value = "api/linea",method = RequestMethod.POST)
    public void newLinea(@RequestBody Linea linea){
        lineaDao.newLinea(linea);
    }
}
