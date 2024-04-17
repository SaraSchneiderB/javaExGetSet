package Estudante;

import java.util.Scanner;

public class MainEstudante {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Scanner teclado2 = new Scanner(System.in);

        Estudante E = new Estudante("", "", 0);

        System.out.print("Digite o nome do aluno: ");
        E.setNome(teclado.nextLine());
        System.out.print("Qual o curso em que o aluno está matriculado? ");
        E.setCurso(teclado.nextLine());
        System.out.print("Digite o número de matrícula: ");
        E.setMatricula(teclado2.nextInt());

        System.out.println("\nNome: " + E.getNome());
        System.out.println("Curso " + E.getCurso());
        System.out.println("Matrícula: " + E.getMatricula());

    }
}
