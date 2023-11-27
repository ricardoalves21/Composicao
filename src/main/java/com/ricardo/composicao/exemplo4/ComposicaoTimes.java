package com.ricardo.composicao.exemplo4;

public class ComposicaoTimes {

    public static void main(String[] args) {

        Jogador jogador99 = new Jogador("Vegetti", "Atacante", "99");
        Jogador jogador22 = new Jogador("Paulinho", "Meia", "22");
        Jogador jogador1 = new Jogador("Leo Jardim", "Goleiro", "1");
        Jogador jogador10 = new Jogador("Payet", "Meia", "10");
        Jogador jogador20 = new Jogador("Ivan", "Goleiro", "20");

        Equipes equipeTitular = new Equipes("TITULAR");
        Equipes equipeReserva = new Equipes("RESERVA");

        equipeTitular.adicionarJogador(jogador1);
        equipeTitular.adicionarJogador(jogador22);
        equipeTitular.adicionarJogador(jogador99);
        equipeTitular.listarEquipe();

        equipeReserva.adicionarJogador(jogador10);
        equipeReserva.adicionarJogador(jogador20);
        equipeReserva.listarEquipe();


    }

}
