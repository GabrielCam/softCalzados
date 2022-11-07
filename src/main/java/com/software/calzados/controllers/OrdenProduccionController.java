package com.software.calzados.controllers;

import com.software.calzados.dao.OrdenProduccionDao;
import com.software.calzados.models.OrdenProduccion;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "api")
public class OrdenProduccionController {
    @Autowired
    private OrdenProduccionDao ordenProduccionDao;

    @PostMapping(value = "/ordenproduccion")
    public ResponseEntity<OrdenProduccion> newOrdenProduccion(@RequestBody OrdenProduccion ordenProduccion) {
        try {
            OrdenProduccion ordenProduccion1 = ordenProduccionDao.newOrdenProduccion(ordenProduccion);
            return new ResponseEntity<>(ordenProduccion1, HttpStatus.CREATED);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping(value = "/ordenproduccion")
    public ResponseEntity<List<OrdenProduccion>> getOrdenProduccion() {
        try {
            List<OrdenProduccion> ordenProduccions = ordenProduccionDao.getOrdenProduccion();
            if (ordenProduccions.isEmpty()) {
                return new ResponseEntity<>(HttpStatus.NO_CONTENT);
            } else {
                return new ResponseEntity<>(ordenProduccions, HttpStatus.OK);
            }
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
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
