package com.github.ms_sala.infrastructure.dto;

import io.swagger.v3.oas.annotations.media.Schema;

@Schema(description = "Dados para criação de uma nova sala")
public record SalaRequestDTO(
        @Schema(description = "Nome da sala", example = "Sala de Reunião A")
        String nome,
        
        @Schema(description = "Capacidade máxima de pessoas", example = "10")
        int capacidade) {
}
