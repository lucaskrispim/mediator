package org.example;

public class SetorPublicacoes implements Setor {

    private static SetorPublicacoes instancia = new SetorPublicacoes();

    private SetorPublicacoes() {}

    public static SetorPublicacoes getInstancia() {
        return instancia;
    }

    public String receberSolicitacao(String mensagem) {
        return "O Setor de Publicações está processando sua solicitação: " + mensagem;
    }
}
