package com.software.calzados.controllers;

import com.software.calzados.dao.DefectoDao;
import com.software.calzados.models.Defecto;
import com.software.calzados.models.TipoDefecto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DefectoController {
    @Autowired
    private DefectoDao defectoDao;

    @RequestMapping(value = "api/defecto")
    public void newDefecto(@RequestBody Defecto defecto) {
        defectoDao.newDefecto(defecto);
    }

   /* todo ...tipo POST

  todo     http://localhost:8080/api/defecto  en tipoDefecto va OBSERVADO o REPROCESO todos con mayuscula porque es un ENUM
    {
        "tipoDefecto":"OBSERVADO",
            "descripcion":"tu defecto aqui"
    }*/
}
