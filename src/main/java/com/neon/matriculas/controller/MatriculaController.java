package com.neon.matriculas.controller;

import com.neon.matriculas.model.Aluno;
import com.neon.matriculas.model.Curso;
import com.neon.matriculas.service.MatriculaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class MatriculaController {

    @Autowired
    private MatriculaService matriculaService;

    @PostMapping("/cadastrar")
    public String cadastrar(@ModelAttribute Aluno aluno, @ModelAttribute Curso curso) {
        // O @ModelAttribute garante que o Spring procure 'nome' e 'cpf' para o Aluno

        try {
            matriculaService.realizarMatricula(aluno, curso);
            System.out.println("Controller: Processando matrícula de " + aluno.getNome());
        } catch (Exception e) {
            System.err.println("Erro no Controller: " + e.getMessage());
        }

        return "redirect:/";
    }
}