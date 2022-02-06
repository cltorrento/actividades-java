package com.actividades.java.controllers;

import com.actividades.java.models.Usuario;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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






}
