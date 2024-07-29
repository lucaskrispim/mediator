package org.example;

public class CoordenadorLaboratorio {

    private static CoordenadorLaboratorio instancia = new CoordenadorLaboratorio();

    private CoordenadorLaboratorio() {}

    public static CoordenadorLaboratorio getInstancia() {
        return instancia;
    }

    public String receberSolicitacaoEquipamentos(String mensagem) {
        return "O Coordenador do Laboratório agradece seu contato.\n"+
                "O Setor de Equipamentos respondeu sua solicitação conforme mensagem a seguir.\n" +
                ">>" + SetorEquipamentos.getInstancia().receberSolicitacao(mensagem);
    }

    public String receberSolicitacaoAnaliseDados(String mensagem) {
        return "O Coordenador do Laboratório agradece seu contato.\n"+
                "O Setor de Análise de Dados respondeu sua solicitação conforme mensagem a seguir.\n" +
                ">>" + SetorAnaliseDados.getInstancia().receberSolicitacao(mensagem);
    }

    public String receberSolicitacaoPublicacoes(String mensagem) {
        return "O Coordenador do Laboratório agradece seu contato.\n"+
                "O Setor de Publicações respondeu sua solicitação conforme mensagem a seguir.\n" +
                ">>" + SetorPublicacoes.getInstancia().receberSolicitacao(mensagem);
    }
}

