package Projeto;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Main loja = new Main();

        Mouse mouse1 = new Mouse("Mouse otico, Saida USB. 1.600 dpi", "otico");
        Livro livro1 = new Livro("Aventuras de Sherlock Holmes", "Arthur Conan Doyle");
        Mouse mouse2 = new Mouse("Mouse sem fio, 2.400 dpi", "Sem Fio");

        loja.adicionarProduto(mouse1);
        loja.adicionarProduto(livro1);
        loja.adicionarProduto(mouse2);

        loja.mostrarCarrinho();
    }

    private ArrayList<Produto> carrinho;

    public Main() {
        carrinho = new ArrayList<>();
    }

    public void adicionarProduto(Produto produto) {
        carrinho.add(produto);
    }

    public void mostrarCarrinho() {
        for (Produto produto : carrinho) {
            System.out.println(produto.getDescricao());
        }
    }
}