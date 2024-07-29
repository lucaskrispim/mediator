package org.example;

public class SetorEquipamentos implements Setor {

    private static SetorEquipamentos instancia = new SetorEquipamentos();

    private SetorEquipamentos() {}

    public static SetorEquipamentos getInstancia() {
        return instancia;
    }

    public String receberSolicitacao(String mensagem) {
        return "O Setor de Equipamentos está processando sua solicitação: " + mensagem;
    }
}
