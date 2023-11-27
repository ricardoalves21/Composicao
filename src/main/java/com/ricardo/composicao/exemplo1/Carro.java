package com.ricardo.composicao.exemplo1;

public class Carro {

    private Motor motor; // composição

    public Carro() {
        this.motor = new Motor();
    }

    public void ligarCarro() {
        motor.ligar();
        System.out.println("Carro ligado.");
    }

}
