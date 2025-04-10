package com.reservasala.reserva_sala.controller;

import com.reservasala.reserva_sala.model.Usuario;
import com.reservasala.reserva_sala.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/usuarios")
public class UsuarioController {

    @Autowired
    private UsuarioService service;

    @GetMapping
    public List<Usuario> listar() {
        return service.listar();
    }

    @PostMapping("/salvar")
    public Usuario salvar(@RequestBody Usuario usuario) {
        return service.salvar(usuario);
    }
}
