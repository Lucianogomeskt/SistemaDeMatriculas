package com.neon.matriculas.model;

import java.util.UUID;

public class Curso {

    private UUID id;
    private String nomeCurso;
    private int cargaHoraria;

    public Curso() {
        this.id = UUID.randomUUID(); // Gera o ID mesmo se o objeto começar vazio
    }

    public Curso(String nomeCurso, int cargaHoraria) {
        this.id = UUID.randomUUID();
        this.nomeCurso = nomeCurso;
        this.cargaHoraria = cargaHoraria;
    }

    public void setNomeCurso(String nomeCurso) {
        this.nomeCurso = nomeCurso;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    public String getNomeCurso() {
        return nomeCurso;
    }

    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public UUID getId() {
        return id;
    }
}