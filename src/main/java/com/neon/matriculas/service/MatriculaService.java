package com.neon.matriculas.service;

import com.neon.matriculas.dao.AlunoDAO;
import com.neon.matriculas.dao.CursoDAO;
import com.neon.matriculas.dao.MatriculaDAO;
import com.neon.matriculas.factory.ConnectionFactory;
import com.neon.matriculas.model.Aluno;
import com.neon.matriculas.model.Curso;
import com.neon.matriculas.model.Matricula;
import org.springframework.stereotype.Service;
import java.sql.Connection;

@Service
public class MatriculaService {

    private final AlunoDAO alunoDAO;
    private final CursoDAO cursoDAO;
    private final MatriculaDAO matriculaDAO;

    // Construtor: Aqui garantimos que a conexão é criada ANTES dos DAOs
    public MatriculaService() {
        ConnectionFactory factory = new ConnectionFactory();
        Connection conn = factory.recuperarConexao();

        // Agora passamos a mesma conexão para todos
        this.alunoDAO = new AlunoDAO(conn);
        this.cursoDAO = new CursoDAO(conn);
        this.matriculaDAO = new MatriculaDAO(conn);
    }

    public void realizarMatricula(Aluno aluno, Curso curso) {
        // Validação de CPF
        if (aluno.getCpf() == null || aluno.getCpf().length() != 11) {
            System.err.println("CPF Inválido!");
            return;
        }

        try {
            alunoDAO.salvar(aluno);
            cursoDAO.salvar(curso);

            Matricula m = new Matricula(aluno, curso);
            matriculaDAO.salvar(m);

            System.out.println("Matrícula de " + aluno.getNome() + " realizada com sucesso!");

        } catch (Exception e) {
            System.err.println("Erro ao processar matrícula no banco: " + e.getMessage());
            e.printStackTrace(); // Isso vai mostrar no console EXATAMENTE onde deu erro
        }
    }
}