package com.github.ms_usuario.infrastructure.rest.dto;

import com.github.ms_usuario.domain.model.value.Endereco;
import io.swagger.v3.oas.annotations.media.Schema;

import java.time.LocalDate;

@Schema(description = "Dados para criação de um novo usuário")
public record UsuarioRequestDTO(
        @Schema(description = "Nome completo do usuário", example = "João Silva")
        String nome,
        
        @Schema(description = "Email do usuário", example = "joao.silva@email.com")
        String email,
        
        @Schema(description = "CPF do usuário (apenas números)", example = "12345678901")
        String cpf,
        
        @Schema(description = "Data de nascimento do usuário", example = "1990-05-15")
        LocalDate dataNascimento,
        
        @Schema(description = "Endereço do usuário")
        Endereco endereco) {
}
