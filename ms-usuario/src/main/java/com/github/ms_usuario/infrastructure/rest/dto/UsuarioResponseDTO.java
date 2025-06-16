package com.github.ms_usuario.infrastructure.rest.dto;

import com.github.ms_usuario.domain.model.value.Endereco;
import io.swagger.v3.oas.annotations.media.Schema;

import java.time.LocalDate;

@Schema(description = "Dados de resposta de um usuário")
public record UsuarioResponseDTO(
        @Schema(description = "ID único do usuário", example = "1")
        Long id,
        
        @Schema(description = "Nome completo do usuário", example = "João Silva")
        String nome,
        
        @Schema(description = "Email do usuário", example = "joao.silva@email.com")
        String email,
        
        @Schema(description = "CPF do usuário", example = "12345678901")
        String cpf,
        
        @Schema(description = "Data de nascimento do usuário", example = "1990-05-15")
        LocalDate dataNascimento,
        
        @Schema(description = "Endereço do usuário")
        Endereco endereco) {
}
