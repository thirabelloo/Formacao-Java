package Listas.Lista05;

import java.util.Scanner;

/**
 * 04-Crie um código que recebe 2 números e exiba no console a mensagem 'Hello World'
 * enquanto o primeiro número for menor que o segundo.
 */
public class Exercicio04Lista05 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int num1;
        int num2;

        do {
            System.out.println("Digite o primeiro numero");
            num1 = scanner.nextInt();

            System.out.println("Digite p segundo número");
            num2 = scanner.nextInt();

            if (num1 < num2) {
                System.out.println("Hello World");
            }

        } while (num1 > num2);
    }
}
