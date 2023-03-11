package CursoAdaF1rst.Aula05;

import java.util.Scanner;

/**
 * Programa que mostra se numero par interrompe o programa
 */
public class ExercicioNumeroImpar {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int resultado;

        do {
            System.out.println("Digite um número");
            int numero = sc.nextInt();
            resultado =  numero % 2;
//            if (resultado == 0) {
//                System.out.println("O numero é par " + numero);
//            } else {
//                System.out.println("O numero é impar " + numero);
//            }
        } while (resultado != 0);

    }
}
