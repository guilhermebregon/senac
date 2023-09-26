package com.senac.evento;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Alterar {
	public void alterarEvento(String nomeAntigo, String novoNome) {
    	try {
    		
    		Connection conexao = DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/evento", 
					"root", 
					"Sen@c2023" );
    		
            String sql = "UPDATE Evento SET nome = ? WHERE nome = ?";
            PreparedStatement instrucao = conexao.prepareStatement(sql);
            instrucao.setString(1, novoNome);
            instrucao.setString(2, nomeAntigo);
            int linhasAtualizadas = instrucao.executeUpdate();

            if (linhasAtualizadas > 0) {
                System.out.println("Evento alterado com sucesso.");
            } else {
                System.out.println("Nenhum evento encontrado para alteração.");
            }
        } catch (SQLException e) {
            System.out.println("Erro ao alterar evento: " + e);
        }
    }
}
