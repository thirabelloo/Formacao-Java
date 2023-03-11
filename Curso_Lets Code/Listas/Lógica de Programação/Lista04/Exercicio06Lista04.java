package Listas.Lista04;

import java.util.Scanner;

/**
 * 6 - Faça um programa para a leitura de duas notas parciais de um aluno.
 * O programa deve calcular a média alcançada por aluno e apresentar:
 * -> A mensagem "Aprovado", se a média alcançada for maior ou igual a sete;
 * -> A mensagem "Reprovado", se a média for menor do que sete;
 * -> A mensagem "Aprovado com Distinção", se a média for igual a dez.
 */
public class Exercicio06Lista04 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double nota1 = entradaDeDados(scanner, "Informe o valor da primeira nota");
        double nota2 = entradaDeDados(scanner, "Informe o valor da segunda nota");

        double media = (nota1 + nota2) / 2;

        if (media == 10) {
            System.out.println("Aprovado com distinção " + media);
        } else if (media >= 7 && media <= 9) {
            System.out.println("Aprovado " + media);
        } else if (media >= 0 && media < 7) {
            System.out.println("Reprovado " + media);
        } else {
            System.out.println("Media inválida");
        }
    }

    public static double entradaDeDados(Scanner sc, String mensagem) {
        System.out.println(mensagem);
        return sc.nextDouble();
    }
}
