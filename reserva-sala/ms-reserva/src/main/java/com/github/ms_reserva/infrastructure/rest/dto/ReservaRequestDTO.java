package com.github.ms_reserva.infrastructure.rest.dto;

import io.swagger.v3.oas.annotations.media.Schema;

@Schema(description = "Dados para criação de uma nova reserva")
public record ReservaRequestDTO(
        @Schema(description = "Data e hora da reserva (formato ISO)", example = "2025-06-20T14:30:00")
        String dataHora,
        
        @Schema(description = "ID da sala a ser reservada", example = "1")
        Long salaId,
        
        @Schema(description = "ID do usuário que está fazendo a reserva", example = "1")
        Long usuarioId) {
}
