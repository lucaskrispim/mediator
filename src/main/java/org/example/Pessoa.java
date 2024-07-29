package org.example;

public class Pessoa {

    public String solicitarEquipamentos(String mensagem) {
        return CoordenadorLaboratorio.getInstancia().receberSolicitacaoEquipamentos(mensagem);
    }

    public String solicitarAnaliseDados(String mensagem) {
        return CoordenadorLaboratorio.getInstancia().receberSolicitacaoAnaliseDados(mensagem);
    }

    public String solicitarPublicacoes(String mensagem) {
        return CoordenadorLaboratorio.getInstancia().receberSolicitacaoPublicacoes(mensagem);
    }
}
