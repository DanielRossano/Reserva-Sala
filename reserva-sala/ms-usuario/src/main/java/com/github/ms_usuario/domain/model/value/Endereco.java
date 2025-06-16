package com.github.ms_usuario.domain.model.value;

import jakarta.persistence.Embeddable;
import lombok.Getter;
import lombok.Setter;

@Getter
@Embeddable
@Setter
public class Endereco {
    private String cidade;
    private String estado;
    private String cep;
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
