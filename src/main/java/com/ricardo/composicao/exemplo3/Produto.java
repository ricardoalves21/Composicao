package com.ricardo.composicao.exemplo3;

public class Produto {

    private String nome;
    private String unidade;
    private String peso;

    public Produto(String nome, String unidade, String peso) {
        this.nome = nome;
        this.unidade = unidade;
        this.peso = peso;
    }

    public String getNome() {
        return nome;
    }

    public String getUnidade() {
        return unidade;
    }

    public String getPeso() {
        return peso;
    }

}
