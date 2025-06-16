package com.github.ms_reserva.infrastructure.rest.dto;

import io.swagger.v3.oas.annotations.media.Schema;

@Schema(description = "Dados de resposta de uma reserva")
public record ReservaResponseDTO(
        @Schema(description = "ID único da reserva", example = "1")
        Long id,
        
        @Schema(description = "Data e hora da reserva", example = "2025-06-20T14:30:00")
        String dataHora,
        
        @Schema(description = "ID da sala reservada", example = "1")
        Long salaId,
        
        @Schema(description = "ID do usuário que fez a reserva", example = "1")
        Long usuarioId) {
}
