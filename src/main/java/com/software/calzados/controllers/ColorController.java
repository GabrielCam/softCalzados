package com.software.calzados.controllers;

import com.software.calzados.dao.ColorDao;
import com.software.calzados.models.Color;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ColorController {
    @Autowired
    private ColorDao colorDao;
    @RequestMapping(value = "api/color")
    public void newColor(@RequestBody Color color){
       colorDao.newColor(color);

    }
}
