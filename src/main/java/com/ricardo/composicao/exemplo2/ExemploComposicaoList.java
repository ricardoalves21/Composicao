package com.ricardo.composicao.exemplo2;

public class ExemploComposicaoList {

    public static void main(String[] args) {

        Jogador jogador1 = new Jogador("Ricardo");
        Jogador jogador2 = new Jogador("Elias");
        Equipe minhaEquipe = new Equipe();

        minhaEquipe.adicionarJorgador(jogador1);
        minhaEquipe.adicionarJorgador(jogador2);
        minhaEquipe.listarJogadores();


    }

}
