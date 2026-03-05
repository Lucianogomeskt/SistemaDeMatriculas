package com.neon.matriculas.model;

import java.time.LocalDate;

public class Matricula {

    private Curso curso;
    private Aluno aluno;
    private LocalDate dataMatricula;

    public Matricula(Aluno aluno, Curso curso) {
        this.aluno = aluno;
        this.curso = curso;
        this.dataMatricula = LocalDate.now();
    }

    public Aluno getAluno() {
        return aluno;
    }

    public Curso getCurso() {
        return curso;
    }

    public LocalDate getDataMatricula() {
        return dataMatricula;
    }
}