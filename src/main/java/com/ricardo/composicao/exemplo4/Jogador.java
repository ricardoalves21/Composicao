package com.ricardo.composicao.exemplo4;

public class Jogador {

    private String nome;
    private String posicao;
    private String numeroCamisa;

    public Jogador(String nome, String posicao, String numeroCamisa) {
        this.nome = nome;
        this.posicao = posicao;
        this.numeroCamisa = numeroCamisa;
    }

    public String getNome() {
        return nome;
    }

    public String getPosicao() {
        return posicao;
    }

    public String getNumeroCamisa() {
        return numeroCamisa;
    }
}
