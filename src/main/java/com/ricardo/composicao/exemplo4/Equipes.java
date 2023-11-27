package com.ricardo.composicao.exemplo4;

import java.util.ArrayList;
import java.util.List;

public class Equipes {

    private String nome;

    private List<Jogador> jogadores;

    public Equipes(String nome) {
        this.nome = nome;
        this.jogadores = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public void adicionarJogador(Jogador jogador) {
        jogadores.add(jogador);
    }

    public void listarEquipe() {
        System.out.println();
        System.out.println("EQUIPE " + getNome());
        for (Jogador atleta : jogadores) {
            System.out.println(atleta.getNome() + " | " + atleta.getPosicao() + " | " + atleta.getNumeroCamisa());
        }
    }
}
