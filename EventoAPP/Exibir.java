package com.senac.evento;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Exibir {
	public void exibirEventos() {
        try {
        	
        	Connection conexao = DriverManager.getConnection(
        							"jdbc:mysql://localhost:3306/evento", 
        							"root", 
        							"Sen@c2023" );
        	
            String sql = "SELECT * FROM Evento";
            PreparedStatement instrucao = conexao.prepareStatement(sql);
            ResultSet resultado = instrucao.executeQuery();

            while (resultado.next()) {
                String nome = resultado.getString("nome");
                String data = resultado.getString("data");
                boolean ativo = resultado.getBoolean("ativo");

                System.out.println("Nome: " + nome + ", Data: " + data + ", Ativo: " + ativo);
            }
        } catch (SQLException e) {
            System.out.println("Erro ao exibir eventos: " + e);
        }
    }
}
