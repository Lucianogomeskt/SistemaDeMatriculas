package com.neon.matriculas.dao;

import com.neon.matriculas.model.Matricula;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class MatriculaDAO {

    private Connection connection;



    public MatriculaDAO(Connection connection) {
        this.connection = connection;
    }


    public void salvar(Matricula matricula){
        String sql = "INSERT INTO MATRICULA (id_aluno, id_curso) VALUES (?, ?)";

        try(PreparedStatement stmt = connection.prepareStatement(sql)){
            stmt.setString(1, matricula.getAluno().getId().toString());
            stmt.setString(2, matricula.getCurso().getId().toString());


            stmt.execute();
            System.out.println("Matrícula registrada!");
        } catch (SQLException e){
            throw new RuntimeException("Erro ao salvar matrícula " + e.getMessage());
        }

    }


}
