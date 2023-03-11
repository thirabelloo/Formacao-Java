package Listas.Lista03;

import java.util.Scanner;

/**
 * Crie uma função que recebe uma String e retorna o tamanho da String.
 * E depois crie um método main para testar o seu método, usando um texto inserido pelo usuario.
 */
public class Exercicio3Lista03 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite uma frase? ");
        String texto = scanner.nextLine();

        int tamanho = CalculatamanhoString(texto);

        System.out.println("A frase digitada  "   +  tamanho + " letras");

    }

    public static int CalculatamanhoString(String valor) {
        return valor.length();
    }
}
