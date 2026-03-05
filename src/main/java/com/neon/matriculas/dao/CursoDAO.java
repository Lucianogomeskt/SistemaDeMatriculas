
package com.neon.matriculas.dao;

import com.neon.matriculas.model.Curso;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class CursoDAO {

    private Connection connection;



    public CursoDAO(Connection connection){
    this.connection = connection;
}

    public CursoDAO() {

    }

    public void salvar(Curso curso){
    String sql = "INSERT INTO CURSO (id_curso, nome_curso, carga_horaria) VALUES (?, ?, ?)";

    try (PreparedStatement stmt = connection.prepareStatement(sql)) {

        stmt.setString(1, curso.getId().toString());
        stmt.setString(2, curso.getNomeCurso());
        stmt.setInt(3, curso.getCargaHoraria());


        stmt.execute();

        System.out.println("Curso '" + curso.getNomeCurso() + "' salvo com sucesso!");
    } catch (SQLException e){
        throw new RuntimeException("Erro ao salvar curso no banco: " + e.getMessage());
    }
}
}
