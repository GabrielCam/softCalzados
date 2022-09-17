package com.software.calzados.controllers;

import com.software.calzados.dao.ModeloDao;
import com.software.calzados.models.Modelo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ModeloController {

    @Autowired
    private ModeloDao modeloDao;

    @RequestMapping(value = "api/modelo")
    public void newModelo(@RequestBody Modelo modelo){
        modeloDao.newModelo(modelo);
    }
}
