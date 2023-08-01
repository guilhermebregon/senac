package com.senac.evento;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Excluir {
	public void excluirEvento(String nome) {
    	try {
    		
    		Connection conexao = DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/evento", 
					"root", 
					"Sen@c2023" );
    		
            String sql = "DELETE FROM Evento WHERE nome = ?";
            PreparedStatement instrucao = conexao.prepareStatement(sql);
            instrucao.setString(1, nome);
            int linhasExcluidas = instrucao.executeUpdate();

            if (linhasExcluidas > 0) {
                System.out.println("Evento excluído com sucesso.");
            } else {
                System.out.println("Nenhum evento encontrado para exclusão.");
            }
        } catch (SQLException e) {
            System.out.println("Erro ao excluir evento: " + e);
        }
    }
}
