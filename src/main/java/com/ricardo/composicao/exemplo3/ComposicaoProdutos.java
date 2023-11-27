package com.ricardo.composicao.exemplo3;

public class ComposicaoProdutos {

    public static void main(String[] args) {

        Produto produto1 = new Produto("Tinta Coral", "UN", "18Lt");
        Produto produto2 = new Produto("Tinta Suvinil", "UN", "18Lt");
        Produto produto3 = new Produto("Cimento Coqueiro", "SC", "50Kg");
        Produto produto4 = new Produto("Cimento Serra", "SC", "50Kg");
        Grupo grupo1 = new Grupo("Tinta");
        Grupo grupo2 = new Grupo("Cimento");

        grupo1.adicionarProduto(produto1);
        grupo1.adicionarProduto(produto2);
        grupo2.adicionarProduto(produto3);
        grupo2.adicionarProduto(produto4);
        grupo1.listarProdutoGrupo();
        grupo2.listarProdutoGrupo();


    }

}
