package com.software.calzados.controllers;
import com.software.calzados.dao.UsuarioDao;
import com.software.calzados.models.Usuario;
import de.mkammerer.argon2.Argon2;
import de.mkammerer.argon2.Argon2Factory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class UserController {
    @Autowired
    private UsuarioDao usuarioDao;

    @RequestMapping(value = "api/usuarios")
    public List<Usuario> getUsuarios(){
        return usuarioDao.getUsuarios();
    }

    @RequestMapping(value = "api/usuarios",method = RequestMethod.POST)
    public void newUsuarios(@RequestBody Usuario usuario){
        Argon2 argon2 = Argon2Factory.create(Argon2Factory.Argon2Types.ARGON2id);
        String hash = argon2.hash(1,1024,1,usuario.getPassword());
        usuario.setPassword(hash);

        usuarioDao.newUsuario(usuario);
    }
    @RequestMapping(value = "api/usuarios/{id}", method = RequestMethod.DELETE)
    public void deleteUsuario(@PathVariable int id){
        usuarioDao.deleteUsuario(id);

    }
   /*
    @RequestMapping(value = "usuarios/{id}")
    public Usuario getUsuario(@PathVariable Long id){
        Usuario usuario = new Usuario();
        usuario.setNombre("gabriel");
        usuario.setApellido("Camaño");
        usuario.setEmail("correo@gmail.com");
        usuario.setId(id);
        usuario.setPassword("12345");
        usuario.setTelefono("1342342332");
        return usuario;
    }
    @RequestMapping(value = "usuarios/{id}")
    public Usuario updateUsuario(@PathVariable Long id){
        Usuario usuario = new Usuario();
        usuario.setNombre("gabriel");
        usuario.setApellido("Camaño");
        usuario.setEmail("correo@gmail.com");
        usuario.setId(id);
        usuario.setPassword("12345");
        usuario.setTelefono("1342342332");
        return usuario;
    }

    */
}
