package br.com.dudadev.model;

public class Preguica extends Animal{
    public Preguica(String nome, int idade) {
        super(nome, idade);
    }

    @Override
    void emitirSom() {
        System.out.println("A preguiça está chiando");
    }

    @Override
    void moverSe() {
        System.out.println("A preguiça está subindo em árvores");
    }
}
