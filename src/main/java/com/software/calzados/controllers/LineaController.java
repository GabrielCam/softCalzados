package com.software.calzados.controllers;

import com.software.calzados.dao.LineaDao;
import com.software.calzados.models.Linea;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@Transactional
@RequestMapping(value = "api")
public class LineaController {
    @Autowired
    private LineaDao lineaDao;

    @PostMapping(value = "/linea")
    public ResponseEntity<Linea> newLinea(@RequestBody Linea linea) {
        try {
            Linea linea1 = lineaDao.newLinea(linea);
            return new ResponseEntity<>(linea1, HttpStatus.CREATED);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping(value = "/linea")
    public ResponseEntity<List<Linea>> getLineas() {
        try {
            List<Linea> lineas = lineaDao.getLineas();
            if (lineas.isEmpty()) {
                return new ResponseEntity<>(HttpStatus.NO_CONTENT);
            } else {
                return new ResponseEntity<>(lineas, HttpStatus.OK);
            }
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping(value = "/linea/libres")
    public ResponseEntity<List<Linea>> getLibres() {
        try {
            List<Linea> lineas = lineaDao.getLibres();
            if (lineas.isEmpty()) {
                return new ResponseEntity<>(HttpStatus.NO_CONTENT);
            } else {
                return new ResponseEntity<>(lineas, HttpStatus.OK);
            }
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
