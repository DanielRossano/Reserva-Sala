package com.reservasala.reserva_sala.controller;

import com.reservasala.reserva_sala.model.Sala;
import com.reservasala.reserva_sala.service.SalaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/salas")
public class SalaController {

    @Autowired
    private SalaService service;

    @GetMapping
    public List<Sala> listar() {
        return service.listar();
    }

    @PostMapping("/salvar")
    public Sala salvar(@RequestBody Sala sala) {
        return service.salvar(sala);
    }
}
