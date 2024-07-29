package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PesquisadorTest {

    @Test
    void deveSolicitarEquipamentos() {
        Pesquisador pesquisador = new Pesquisador();
        assertEquals("O Coordenador do Laboratório agradece seu contato.\nO Setor de Equipamentos respondeu sua solicitação conforme mensagem a seguir.\n" +
                        ">>O Setor de Equipamentos está processando sua solicitação: Solicitação de novos equipamentos de medição",
                pesquisador.solicitarEquipamentos("Solicitação de novos equipamentos de medição"));
    }

    @Test
    void deveSolicitarAnaliseDados() {
        Pesquisador pesquisador = new Pesquisador();
        assertEquals("O Coordenador do Laboratório agradece seu contato.\nO Setor de Análise de Dados respondeu sua solicitação conforme mensagem a seguir.\n" +
                        ">>O Setor de Análise de Dados está processando sua solicitação: Solicitação de análise dos dados do último experimento",
                pesquisador.solicitarAnaliseDados("Solicitação de análise dos dados do último experimento"));
    }

    @Test
    void deveSolicitarPublicacoes() {
        Pesquisador pesquisador = new Pesquisador();
        assertEquals("O Coordenador do Laboratório agradece seu contato.\nO Setor de Publicações respondeu sua solicitação conforme mensagem a seguir.\n" +
                        ">>O Setor de Publicações está processando sua solicitação: Solicitação de publicação dos resultados do experimento",
                pesquisador.solicitarPublicacoes("Solicitação de publicação dos resultados do experimento"));
    }
}