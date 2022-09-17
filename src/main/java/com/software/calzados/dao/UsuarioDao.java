package com.software.calzados.dao;

import com.software.calzados.models.Usuario;

import java.util.List;

public interface UsuarioDao {
    public List<Usuario> getUsuarios();
    public Usuario getUsuario();
    public Usuario updateUsuario();
    public void deleteUsuario(int id);
    public void newUsuario(Usuario usuario);
    public boolean login(Usuario usuario);

}
