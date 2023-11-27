package com.ricardo.composicao.exemplo2;

import java.util.ArrayList;
import java.util.List;

public class Equipe {

    private List<Jogador> jogadores; // Composição: uma equipe tem uma lista de jogadores

    public Equipe() {
        this.jogadores = new ArrayList<>();
    }

    public void adicionarJorgador(Jogador jogador) {
        jogadores.add(jogador);
        System.out.println("Jogador " + jogador.getNome() + " adicionado à equipe.");
    }

    public void listarJogadores() {
        System.out.println("JOGADORES NA EQUIPE:");
        for (Jogador atleta : jogadores) {
            System.out.println(atleta.getNome());
        }
    }

}
