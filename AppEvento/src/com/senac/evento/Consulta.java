package com.senac.evento;

import java.sql.Connection; // configuracao de conexao pega o driver
import java.sql.DriverManager; // drivers para trazer o DB
import java.sql.PreparedStatement; // instrucao preparada sql
import java.sql.ResultSet; // pega instrucao
import java.sql.SQLException; // previne erros sql

public class Consulta {
    public void exibirEventos() {
        try {
        	
        	Connection conexao = DriverManager.getConnection(
        							"jdbc:mysql://localhost:3306/novo", 
        							"root", 
        							"Sen@cEdu22" );
        	
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

    public void alterarEvento(String nomeAntigo, String novoNome) {
    	try {
    		
    		Connection conexao = DriverManager.getConnection(
				"jdbc:mysql://localhost:3306/novo", 
				"root", 
				"Sen@cEdu22" );
    		
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

    public void excluirEvento(String nome) {
    	try {
    		
    		Connection conexao = DriverManager.getConnection(
				"jdbc:mysql://localhost:3306/novo", 
				"root", 
				"Sen@cEdu22" );
    		
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
