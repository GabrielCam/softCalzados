package com.software.calzados.controllers;

import com.software.calzados.dao.OrdenProduccionDao;
import com.software.calzados.models.OrdenProduccion;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OrdenProduccionController {
    @Autowired
    private OrdenProduccionDao ordenProduccionDao;

    @RequestMapping(value = "api/ordenproduccion")
    public void newOrdenProduccion(@RequestBody OrdenProduccion ordenProduccion){
        ordenProduccionDao.newOrdenProduccion(ordenProduccion);
    }
}
/* POST http://localhost:8080/api/ordenproduccion
* {
    "inicio":"2018-10-10T11:25",
    "fin":"2022-03-27T18:14:01.184",
    "estado":"PAUSADA",
    "modelo":{
        "id":4
    }
}
* */
