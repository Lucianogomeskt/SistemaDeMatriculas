package com.neon.matriculas.dao;

import com.neon.matriculas.model.Aluno;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class AlunoDAO {

    private Connection connection;

    public AlunoDAO(Connection connection) {
        this.connection = connection;
    }

    public void salvar(Aluno aluno) {
        String sql = "INSERT INTO ALUNO (id_aluno, nome, cpf) VALUES (?, ?, ?)";

        try (PreparedStatement stmt = connection.prepareStatement(sql)) {

            // O ID (UUID) convertido para String para o Oracle
            stmt.setString(1, aluno.getId().toString());
            stmt.setString(2, aluno.getNome());
            stmt.setString(3, aluno.getCpf());

            stmt.executeUpdate();

            System.out.println("Aluno " + aluno.getNome() + " salvo no banco com sucesso!");

        } catch (SQLException e) {
            throw new RuntimeException("Erro ao salvar aluno no Oracle: " + e.getMessage());
        }
    }
}