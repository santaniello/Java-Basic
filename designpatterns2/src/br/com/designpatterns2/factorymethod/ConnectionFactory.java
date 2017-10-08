package br.com.designpatterns2.factorymethod;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {
	public Connection getConnection() {
        try {
            Connection conexao = 
                    DriverManager.getConnection("jdbc:mysql://localhost:3306/banco", "usuario", "senha");

            return conexao;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
