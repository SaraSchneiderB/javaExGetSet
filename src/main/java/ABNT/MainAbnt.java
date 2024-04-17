package ABNT;

import java.util.Scanner;

public class MainAbnt {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Scanner teclado2 = new Scanner(System.in);

        System.out.print("Digite o título do livro: ");
        String titulo = teclado.nextLine();

        System.out.print("Digite o(s) autor(es) do livro: ");
        String autores = teclado.nextLine();

        System.out.print("Digite a editora do livro: ");
        String editora = teclado.nextLine();

        System.out.print("Digite o ano de publicação do livro: ");
        int anoPublicacao = teclado2.nextInt();

        System.out.print("Digite o número de páginas do livro: ");
        int numPaginas = teclado2.nextInt();
        String autoresFormatados = autores;

        Abnt A = new Abnt(titulo, autores, editora, anoPublicacao, numPaginas);
        String referencia = A.formatarABNT();

        System.out.println("\nReferência ABNT:\n" + referencia);

        teclado.close();
        teclado2.close();
    }
}
