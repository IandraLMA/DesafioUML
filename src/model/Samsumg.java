package model;

import contract.SmartPhone;

public class Samsumg implements SmartPhone {
    private String cor;
    private String material;

    @Override
    public void ligar(Integer numero) {
        System.out.println("Ligando para o numero"+numero);
    }

    @Override
    public void atender() {
        System.out.println("Atendendo Chamada...");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Iniciando Correio Voz...");
    }

    @Override
    public void exibirPagina(String url) {
        System.out.println("Exibindo a pagina da url"+url);
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Adicionando nova Aba");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Atualizando pagina");
    }

    @Override
    public void tocar() {
        System.out.println("Tocando musica");
    }

    @Override
    public void pausar() {
        System.out.println("Pausando musica");
    }

    @Override
    public void selecionarMusica(Integer id) {
        System.out.println("Selecionando musica ");
    }
}
