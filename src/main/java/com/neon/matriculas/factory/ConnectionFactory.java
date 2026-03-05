package com.neon.matriculas.factory;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {

    private static final String URL = "jdbc:oracle:thin:@localhost:1521:xe";
    private static final String USER = "system";
    private static final String PASS = "123A56789o";

    public Connection recuperarConexao() {
        try {
            Connection conn = DriverManager.getConnection(URL, USER, PASS);

            System.out.println("Conexão com Oracle aberta com sucesso!");
            return conn;

        } catch (SQLException e) {
            System.err.println("FALHA CRÍTICA: Não foi possível conectar ao Oracle! " + e.getMessage());
            return null;
        }
    }
}