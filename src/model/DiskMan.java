package model;

import contract.ReprodutorMusica;

public class DiskMan implements ReprodutorMusica {
    @Override
    public void tocar() {
        System.out.println("Tocando musica no diskman");
    }

    @Override
    public void pausar() {
        System.out.println("Pausando musica no diskman");
    }

    @Override
    public void selecionarMusica(Integer id) {
        System.out.println("Selecionando musica no diskman");
    }
}
