package Listas.Lista05;

import java.util.Scanner;

/**
 * 01- Faça um programa que peça para um usuário digitar um número e que só finaliza quando o usuário digitar 0
 */
public class Exercicio01Lista05 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int numero;

        do {
            System.out.println("Digite um número");
            numero = scanner.nextInt();

        } while (numero != 0);

    }
}
