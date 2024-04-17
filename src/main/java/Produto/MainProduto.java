package Produto;

import java.util.Scanner;

public class MainProduto {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Produto selecionado: ");
        String nome = teclado.nextLine();

        System.out.println("Valor unitário da mercadoria: ");
        double valorUn = teclado.nextDouble();

        Produto p = new Produto(nome, valorUn);

        System.out.println("Nome do produto: " + p.getnome());
        System.out.println("Valor unitário: " + p.getvalorUn());
    }
}
