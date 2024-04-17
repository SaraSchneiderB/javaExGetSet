package Livro;

import java.util.Locale;
import java.util.Scanner;

public class MainLivro {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner teclado = new Scanner(System.in);
        Scanner teclado2 = new Scanner(System.in);

        Livro L = new Livro("", "", "", 0.0);

        System.out.print("Qual o nome do livro escolhido? ");
        L.setTitulo(teclado.nextLine());
        System.out.print("Digite o nome do autor da obra: ");
        L.setAutor(teclado.nextLine());
        System.out.print("Qual a editora? ");
        L.setEditora(teclado.nextLine());
        System.out.print("Agora nos informe o valor da obra: ");
        L.setValor(teclado2.nextDouble());

        System.out.println("\nTítulo: " + L.getTitulo());
        System.out.println("Autor: " + L.getAutor());
        System.out.println("Editora: " + L.getEditora());
        System.out.println("Valor: R$ " + L.getValor());

        teclado.close();
        teclado2.close();
    }
}
