package Projeto;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Produto> carrinho = new ArrayList<>();

        Mouse mouse1 = new Mouse("Mouse otico, Saida USB. 1.600 dpi", "otico");
        Livro livro1 = new Livro("Aventuras de Sherlock Holmes", "Arthur Conan Doyle");
        Mouse mouse2 = new Mouse("Mouse sem fio, 2.400 dpi", "Sem Fio");

        carrinho.add(mouse1);
        carrinho.add(livro1);
        carrinho.add(mouse2);

        for(Produto produto : carrinho) {
            System.out.println(produto.getDescricao());
        }
    }
}