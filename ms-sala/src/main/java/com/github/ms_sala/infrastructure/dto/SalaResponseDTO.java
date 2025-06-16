package com.github.ms_sala.infrastructure.dto;

import io.swagger.v3.oas.annotations.media.Schema;

@Schema(description = "Dados de resposta de uma sala")
public record SalaResponseDTO(
        @Schema(description = "ID único da sala", example = "1")
        Long id,
        
        @Schema(description = "Nome da sala", example = "Sala de Reunião A")
        String nome,
        
        @Schema(description = "Capacidade máxima de pessoas", example = "10")
        int capacidade) {
}
