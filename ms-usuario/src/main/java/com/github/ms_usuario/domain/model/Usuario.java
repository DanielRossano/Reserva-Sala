package com.github.ms_usuario.domain.model;

import com.github.ms_usuario.domain.model.value.*;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Embedded
    private Nome nome;
    @Embedded
    private Email email;
    @Embedded
    private Cpf cpf;
    @Embedded
    private DataNascimento dataNascimento;
    @Embedded
    private Endereco endereco;

    public Usuario(Nome nome, Email email, Cpf cpf, DataNascimento dataNascimento, Endereco endereco) {
        this.nome = nome;
        this.email = email;
        this.cpf = cpf;
        this.dataNascimento = dataNascimento;
        this.endereco = endereco;
    }
    
    // Manual getter methods to ensure availability even if Lombok fails
    public Long getId() {
        return id;
    }
    
    public Nome getNome() {
        return nome;
    }
    
    public Email getEmail() {
        return email;
    }
    
    public Cpf getCpf() {
        return cpf;
    }
    
    public DataNascimento getDataNascimento() {
        return dataNascimento;
    }
    
    public Endereco getEndereco() {
        return endereco;
    }
}