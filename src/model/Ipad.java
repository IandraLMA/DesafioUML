package model;

import contract.Tablet;

public class Ipad implements Tablet {
    @Override
    public void tocar() {
        System.out.println("Tocando musica no IPAD");
    }

    @Override
    public void pausar() {
        System.out.println("Pausando musica no IPAD");
    }

    @Override
    public void selecionarMusica(Integer id) {
        System.out.println("Selecionando musica no IPAD");
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
}
