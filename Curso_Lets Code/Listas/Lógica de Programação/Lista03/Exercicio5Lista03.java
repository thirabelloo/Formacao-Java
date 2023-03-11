package Listas.Lista03;

import java.util.Scanner;

/**Crie um programa que separa em metodos o input de dados feito pelo usuario e a saida de dados
 Ex. Um programa que pede para o usuario digitar o nome e depois exibir na tela o nome digitado,
 em seguida que solicita ao usuario para digitar o sobre nome e depois exibir na tela o valor digitado
 */
public class Exercicio5Lista03 {

    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);

        String lerNome = entradaDeDados(scanner, "Digite seu nome?");
        System.out.println(lerNome);

        String lerSobrenome = entradaDeDados( scanner, "Digite seu sobrenome");
        System.out.println(lerSobrenome);

    }

    public static String entradaDeDados(Scanner sc, String mensagem) {
        System.out.println(mensagem);
        return sc.nextLine();
    }


}
