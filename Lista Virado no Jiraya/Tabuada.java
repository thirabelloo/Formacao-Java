package Youtube.Lista01;

import java.util.Scanner;

/**
 * Exercício 8: Desenvolva um aplicativo no console(terminal) para calcular o valor da tabuada.
 * O aplicativo deverá perguntar qual é o valor da tabuada a ser calculada.
 */
public class Tabuada {

    public static void main(String[] args) {


        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite o valor da tabuada: ");
        int valor = teclado.nextInt();

        for (int i = 0; i <= 10; i++) {
            System.out.println(valor + " x " + i + " = " + (valor * i));

        }

    }
}
