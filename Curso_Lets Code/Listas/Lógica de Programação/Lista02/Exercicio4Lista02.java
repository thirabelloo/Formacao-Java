package Listas.Lista02;

import java.util.Scanner;

/**
 * Considerando o código abaixo. A instrução que melhor representa o cálculo da área de um trapézio é:
 */
public class Exercicio4Lista02 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe o valor da base Maior?");
        float baseMaior =scanner.nextFloat();
        System.out.println("informe o valor da base Menor?");
        float baseMenor = scanner.nextFloat();
        System.out.println("Informe o valor da altura?");
        float altura = scanner.nextFloat();


        float area = (baseMaior + baseMenor)*altura/2;
        System.out.printf("A área do trapézio informado é : %.2f ", area);
    }
}
