package com.senac.evento;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Cadastro {
    public void cadastrarEvento(String nome, String data, boolean ativo) {
        try {
            String url = "jdbc:mysql://localhost:3306/novo";
            String nomeUsuario = "root";
            String senha = "Sen@cEdu22";

            Connection conexao = DriverManager.getConnection(url, nomeUsuario, senha);

            String sql = "INSERT INTO Evento (nome, data, ativo) VALUES (?, ?, ?)";
            PreparedStatement declaracao = conexao.prepareStatement(sql);
            declaracao.setString(1, nome);
            declaracao.setString(2, data);
            declaracao.setBoolean(3, ativo);
            declaracao.executeUpdate();

            System.out.println("Evento cadastrado com sucesso.");

            conexao.close();
        } catch (SQLException e) {
            System.out.println("Erro ao cadastrar evento: " + e);
        }
    }
}
