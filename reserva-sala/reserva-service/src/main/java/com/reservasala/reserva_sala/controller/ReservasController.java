package com.reservasala.reserva_sala.controller;

import com.reservasala.reserva_sala.model.Reserva;
import com.reservasala.reserva_sala.model.Sala;
import com.reservasala.reserva_sala.model.Usuario;
import com.reservasala.reserva_sala.service.ReservaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.time.LocalDateTime;
import java.util.List;

@RestController
@RequestMapping("/reservas")
public class ReservasController {

    @Autowired
    private ReservaService reservaService;

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping
    public List<Reserva> listar() {
        return reservaService.listar();
    }

    @PostMapping("/salvar")
    public ResponseEntity<String> salvarReserva(@RequestParam Long salaId,
                                                @RequestParam Long usuarioId,
                                                @RequestParam String dataHora) {

        // Consome SalaService
        Sala sala = restTemplate.getForObject("http://sala-service:8084/salas/" + salaId, Sala.class);
        Usuario usuario = restTemplate.getForObject("http://usuario-service:8083/usuarios/" + usuarioId, Usuario.class);

        if (sala == null || usuario == null) {
            return ResponseEntity.badRequest().body("Sala ou Usuário não encontrado");
        }

        Reserva reserva = new Reserva();
        reserva.setDataHora(LocalDateTime.parse(dataHora));
        reserva.setSala(sala);
        reserva.setUsuario(usuario);

        reservaService.salvar(reserva);

        return ResponseEntity.ok("Reserva realizada com sucesso!");
    }
}
