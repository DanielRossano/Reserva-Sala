package com.github.ms_reserva.domain.model;

import com.github.ms_reserva.domain.model.value.DataHora;
import com.github.ms_reserva.domain.model.value.SalaId;
import com.github.ms_reserva.domain.model.value.UsuarioId;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Reserva {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Embedded
    private DataHora dataHora;

    @Embedded
    private SalaId salaId;

    @Embedded
    private UsuarioId usuarioId;

    public Reserva(DataHora dataHora, SalaId salaId, UsuarioId usuarioId) {
        this.dataHora = dataHora;
        this.salaId = salaId;
        this.usuarioId = usuarioId;
    }
    
    // Manual getter methods to ensure availability even if Lombok fails
    public Long getId() {
        return id;
    }
    
    public DataHora getDataHora() {
        return dataHora;
    }
    
    public SalaId getSalaId() {
        return salaId;
    }
    
    public UsuarioId getUsuarioId() {
        return usuarioId;
    }
}
