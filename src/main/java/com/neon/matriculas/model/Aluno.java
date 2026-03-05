package com.neon.matriculas.model;

import java.util.UUID;

public class Aluno {

    private UUID id;
    private String nome;
    private String cpf;


    public Aluno() {

        this.id = UUID.randomUUID();
    }

    public Aluno(String nome, String cpf) {
        this.id = UUID.randomUUID();
        this.nome = nome;
        this.cpf = cpf;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getCpf() {
        return cpf;
    }

    public String getNome() {
        return nome;
    }

    public UUID getId() {
        return id;
    }
}