package Listas.Lista04;

import java.util.Scanner;

/**
 * 1 - Faça um programa que leia 2 números inteiros, calcule e exiba a média aritmética e o produto dos números.
 * O seu programa deve, obrigatoriamente, utilizar as seguintes funções feitas por você:
 * <p>
 * calculaMedia(): recebe 2 números inteiros como parâmetros e retorne a média dos números;
 * calculaProduto(): recebe 2 números inteiros como parâmetros e retorna o produto dos números;
 */
public class Exercicio01Lista04 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int num1 = entradaDeDados(scanner,"Informe o primeiro número");
        int num2 = entradaDeDados(scanner,"Informe o segundo número");

        int media = calculaMedia(num1, num2);
        System.out.println("O resultado da média é: " + media);

        int produto = calculaProduto(num1, num2);
        System.out.println("O resultado do produto é: " + produto);
    }

    public  static int entradaDeDados(Scanner scanner,String mensagem){
        System.out.println("Informe um número");
        return scanner.nextInt();
    }

    public static int calculaMedia(int num1, int num2) {
        return (num1 + num2) / 2;
    }

    public static int calculaProduto(int num1, int num2) {
        return (num1 * num2);
    }
}
