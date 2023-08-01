package com.senac.evento;

public class EventoTeste {
    public static void main(String[] args) {
        
        Cadastro cadastro = new Cadastro();
        
        // Cadastrar um evento
        String nomeEvento = "Evento novo novo";
        String dataEvento = "28 de janeiro";
        boolean eventoAtivo = true;
        cadastro.cadastrarEvento(nomeEvento, dataEvento, eventoAtivo);
        
        // Criar uma instância de Exibir, Alterar e Excluir
        Exibir objexibir = new Exibir();
        Alterar objalterar = new Alterar();
        Excluir objexcluir = new Excluir();
        
        // Exibir todos os eventos
        objexibir.exibirEventos();
        
        // Alterar o nome de um evento
        String nomeAntigo = "Meu Evento";
        String novoNome = "Novo Evento";
        objalterar.alterarEvento(nomeAntigo, novoNome);
        
        // Exibir todos os eventos após a alteração
        objexibir.exibirEventos();
        
        // Excluir um evento
        String nomeEventoExcluir = "Novo Evento";
        objexcluir.excluirEvento(nomeEventoExcluir);
        
        // Exibir todos os eventos após a exclusão
        objexibir.exibirEventos();
    }
}
