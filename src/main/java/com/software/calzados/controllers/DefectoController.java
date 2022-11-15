package com.software.calzados.controllers;

import com.software.calzados.dao.DefectoDao;
import com.software.calzados.models.Defecto;
import com.software.calzados.models.TipoDefecto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping(value = "api")
public class DefectoController {
    @Autowired
    private DefectoDao defectoDao;

    @PostMapping(value = "/defecto")
    public ResponseEntity<Defecto> newDefecto(@RequestBody Defecto defecto) {
        try {
           Defecto defecto1 = defectoDao.newDefecto(defecto);
           return new ResponseEntity<>(defecto1,HttpStatus.CREATED);
        }catch (Exception e){
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
            // oleee !!
        }
    }

    @GetMapping(value = "/defecto/{id}")
    public ResponseEntity<Defecto> getDefectoById(@PathVariable int id) {
        try {
            Optional<Defecto> defecto = Optional.ofNullable(defectoDao.getDefectoById(id));
            if (defecto.isPresent()) {
                return new ResponseEntity<>(defecto.get(), HttpStatus.OK);
            } else {
                return new ResponseEntity<>(HttpStatus.NO_CONTENT);
            }
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

   /* todo ...tipo POST

  todo     http://localhost:8080/api/defecto  en tipoDefecto va OBSERVADO o REPROCESO todos con mayuscula porque es un ENUM
    {
        "tipoDefecto":"OBSERVADO",
            "descripcion":"tu defecto aqui"
    }*/
}
