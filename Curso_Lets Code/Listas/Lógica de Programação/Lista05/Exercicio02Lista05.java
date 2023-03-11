package Listas.Lista05;

import java.util.Scanner;

/**
 * 02-Faça um programa que peça para um usuário digitar um número e que só finaliza quando o usuário digitar 0.
 * Ao final imprima a soma de todos os números digitados.
 */
public class Exercicio02Lista05 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int numero;
        int somaNumero = 0;

        do {
            System.out.println("Digite um número");
            numero = scanner.nextInt();
            somaNumero += numero;

        } while (numero != 0);

        System.out.println("A soma dos números digitados é: " + somaNumero);
    }
}
