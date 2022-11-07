package com.software.calzados.controllers;

import com.software.calzados.dao.ModeloDao;
import com.software.calzados.models.Modelo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(value = "api")
public class ModeloController {

    @Autowired
    private ModeloDao modeloDao;

    //crea un modelo
    @PostMapping(value = "/modelo")
    public ResponseEntity<Modelo> newModelo(@RequestBody Modelo modelo) {
        try {
            Modelo modelo1 = modeloDao.newModelo(modelo);
            return new ResponseEntity<>(modelo1, HttpStatus.CREATED);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    //lista todos los modelos
    @GetMapping(value = "/modelo")
    public ResponseEntity<List<Modelo>> getModelos() {
        try {
        List<Modelo>modelos = modeloDao.getModelos();
            if (modelos.isEmpty()){
                return new ResponseEntity<>(HttpStatus.NO_CONTENT);
            }else {
                return new ResponseEntity<>(modelos,HttpStatus.OK);
            }
        }catch (Exception e){
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    //trae un modelo especifico por ID
    @GetMapping(value = "/modelo/{id}")
    public ResponseEntity<Modelo> getModeloById(@PathVariable int id) {
        try {
        Optional<Modelo>modelo = Optional.ofNullable(modeloDao.getModeloById(id));
            if (modelo.isPresent()){
                return new ResponseEntity<>(modelo.get(),HttpStatus.OK);
            }else {
                return new ResponseEntity<>(HttpStatus.NO_CONTENT);
            }
        }catch (Exception e){
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

}
