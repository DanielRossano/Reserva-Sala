package com.github.ms_usuario.domain.model.value;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.persistence.Embeddable;
import lombok.Getter;
import lombok.Setter;

@Getter
@Embeddable
@Setter
@Schema(description = "Endereço do usuário")
public class Endereco {
    @Schema(description = "Cidade", example = "São Paulo")
    private String cidade;
    
    @Schema(description = "Estado", example = "SP")
    private String estado;
    
    @Schema(description = "CEP", example = "01234-567")
    private String cep;
    
    @Schema(description = "Rua", example = "Rua das Flores, 123")
    private String rua;

    protected Endereco() {
    }

    public Endereco(String cidade, String estado, String cep, String rua) {
        this.cidade = cidade;
        this.estado = estado;
        this.cep = cep;
        this.rua = rua;
    }
    
    // Manual getter methods to ensure availability even if Lombok fails
    public String getCidade() {
        return cidade;
    }
    
    public String getEstado() {
        return estado;
    }
    
    public String getCep() {
        return cep;
    }
    
    public String getRua() {
        return rua;
    }
}
