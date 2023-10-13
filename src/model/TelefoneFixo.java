package model;

import contract.AparelhoTelefonico;

public class TelefoneFixo implements AparelhoTelefonico {
    @Override
    public void ligar(Integer numero) {
        System.out.println("ligando no telefone fixo");
    }

    @Override
    public void atender() {
        System.out.println("atendendo chamada no telefone fixo");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Correio de voz no telefone fixo");
    }
}
