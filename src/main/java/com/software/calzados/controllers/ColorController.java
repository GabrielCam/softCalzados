package com.software.calzados.controllers;

import com.software.calzados.dao.ColorDao;
import com.software.calzados.models.Color;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(value = "api")
public class ColorController {
    @Autowired
    private ColorDao colorDao;

    @PostMapping(value = "/color")
    public ResponseEntity<Color> newColor(@RequestBody Color color) {
        try {
            Color color1 = colorDao.newColor(color);
            return new ResponseEntity<>(color1, HttpStatus.CREATED);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }

    }

    @GetMapping(value = "/color")
    public ResponseEntity<List<Color>> getColor() {
        try {
            List<Color> colores = colorDao.getColores();
            if (colores.isEmpty()) {
                return new ResponseEntity<>(HttpStatus.NO_CONTENT);
            } else {
                return new ResponseEntity<>(colores, HttpStatus.OK);
            }

        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping(value = "/color/{id}")
    public ResponseEntity<Color> getColorById(@PathVariable int id) {
        try {
            Optional<Color> color = Optional.ofNullable(colorDao.getColorById(id));
            if (color.isPresent()) {
                return new ResponseEntity<>(color.get(),HttpStatus.OK);
            } else {
                return new ResponseEntity<>( HttpStatus.NOT_FOUND);
            }

        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }


}
