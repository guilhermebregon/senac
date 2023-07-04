package com.senac.evento;

public class EventoTeste {
    public static void main(String[] args) {
        
        Cadastro cadastro = new Cadastro();
        
        // Cadastrar um evento
        String nomeEvento = "Meu Evento";
        String dataEvento = "2023-07-01";
        boolean eventoAtivo = true;
        cadastro.cadastrarEvento(nomeEvento, dataEvento, eventoAtivo);
        
        // Criar uma instância da classe Consulta
        Consulta consulta = new Consulta();
        
        // Exibir todos os eventos
        consulta.exibirEventos();
        
        // Alterar o nome de um evento
        String nomeAntigo = "Meu Evento";
        String novoNome = "Novo Evento";
        consulta.alterarEvento(nomeAntigo, novoNome);
        
        // Exibir todos os eventos após a alteração
        consulta.exibirEventos();
        
        // Excluir um evento
        String nomeEventoExcluir = "Novo Evento";
        consulta.excluirEvento(nomeEventoExcluir);
        
        // Exibir todos os eventos após a exclusão
        consulta.exibirEventos();
    }
}
