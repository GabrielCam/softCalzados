package com.software.calzados.dao;

import com.software.calzados.models.Usuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AuthController {

    @Autowired
    UsuarioDao usuarioDao;

    @RequestMapping(value = "api/login",method = RequestMethod.POST)
    public String login(@RequestBody Usuario usuario){
        if (usuarioDao.login(usuario)){
            return "OK";
        }else{
            return "FAIL";
        }
    }
}
