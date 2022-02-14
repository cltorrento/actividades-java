package com.actividades.java.controllers;

import com.actividades.java.models.Usuario;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class UsuarioController {

    @RequestMapping(value = "usuario/{id}")
    public Usuario getUsuario(@PathVariable String id){
        Usuario usuario = new Usuario();
        usuario.setId(1L);
        usuario.setNombre("Carlos");
        usuario.setApellidos("Torrento");
        usuario.setEmail("cl@gmail.com");
        usuario.setTelefono("12345");
        usuario.setPassword("del1al5");

        return usuario;
    }

    @RequestMapping(value = "usuarios")
    public List<Usuario> getUsuarios(){

        List<Usuario> usuarios = new ArrayList<>();

        Usuario usuario = new Usuario();
        usuario.setId(1L);
        usuario.setNombre("Carlos");
        usuario.setApellidos("Torrento");
        usuario.setEmail("cl@gmail.com");
        usuario.setTelefono("12345");
        usuario.setPassword("del1al5");

        Usuario usuario1 = new Usuario();
        usuario1.setId(1L);
        usuario1.setNombre("Luis");
        usuario1.setApellidos("Torrento");
        usuario1.setEmail("cl@gmail.com");
        usuario1.setTelefono("12345");
        usuario1.setPassword("del1al5");

        Usuario usuario2 = new Usuario();
        usuario2.setId(1L);
        usuario2.setNombre("Pepe");
        usuario2.setApellidos("Torrento");
        usuario2.setEmail("cl@gmail.com");
        usuario2.setTelefono("12345");
        usuario2.setPassword("del1al5");

        usuarios.add(usuario1);
        usuarios.add(usuario2);
        usuarios.add(usuario);

        return usuarios;
    }





}
