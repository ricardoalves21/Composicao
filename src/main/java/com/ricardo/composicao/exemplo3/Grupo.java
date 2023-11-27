package com.ricardo.composicao.exemplo3;

import java.util.ArrayList;
import java.util.List;

public class Grupo {

    private String nomeGrupo;
    private List<Produto> produtos;

    public Grupo(String nomeGrupo) {
        this.nomeGrupo = nomeGrupo;
        this.produtos = new ArrayList<>();
    }

    public String getNomeGrupo() {
        return nomeGrupo;
    }

    public void adicionarProduto(Produto prod) {
        produtos.add(prod);
        System.out.println("Produto " + prod.getNome() + " adicionado ao grupo " + getNomeGrupo());
    }

    public void listarProdutoGrupo() {
        System.out.println("LISTA DE PRODUTOS DO GRUPO " + getNomeGrupo());
        for (Produto prods : produtos) {
            System.out.println(prods.getNome() + " | " + prods.getUnidade() + " | " + prods.getPeso());
        }
    }

}
