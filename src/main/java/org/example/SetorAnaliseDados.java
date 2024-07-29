package org.example;

public class SetorAnaliseDados implements Setor {

    private static SetorAnaliseDados instancia = new SetorAnaliseDados();

    private SetorAnaliseDados() {}

    public static SetorAnaliseDados getInstancia() {
        return instancia;
    }

    public String receberSolicitacao(String mensagem) {
        return "O Setor de Análise de Dados está processando sua solicitação: " + mensagem;
    }
}
