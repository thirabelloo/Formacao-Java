package Ada.Listas.Classes_e_Objetos.Exercicio2;

import java.util.Scanner;

/**
 * Exercicio 2
 * 2 - Construa um programa que receba um número como entrada e informe ao usuário se o número é impar ou par.
 * Para determinar se o número é impar ou par, você deve criar uma classe que represente este cálculo.
 */
public class Aplicacao2 {

    public static void main(String[] args) {

        TestaNumero numero = new TestaNumero();

        Scanner leitor = new Scanner(System.in);
        System.out.println("Informe um número e descubra se ele é par ou ímpar");
        int num = leitor.nextInt();
        numero.getNumeroImpar(num);

    }
}
