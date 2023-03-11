package Listas.Lista04;

import java.util.Scanner;

/**
 * 3 - Altere o programa do exercício 2
 * para que ele utilize a função calcula_produto do exercício 1 no cálculo da média ponderada;
 */
public class Exercicio03Lista04 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int peso1 = entradaDeDados(scanner, "Informe o peso da primeira prova:");
        int peso2 = entradaDeDados(scanner, "Informe o peso da segunda prova:");

        int matricula = entradaDeDados(scanner, "Informe o numero de matricula:");
        int prova1 = entradaDeDados(scanner, "Informe a nota da primeira prova:");
        int prova2 = entradaDeDados(scanner, "Informe a nota da segunda prova:");

        int produtoAluno = calculaProduto(prova1, peso1, prova2, peso2);
        int mediaPondera = calculaMediaPonderada(prova1, peso1, prova2, peso2);

        System.out.println(" O numero de matricula do aluno é: " + matricula + " com  a média: " + mediaPondera + " e o produto igual: "
                + produtoAluno);
    }

    public static int entradaDeDados(Scanner sc, String mensagem) {
        System.out.println(mensagem);
        return sc.nextInt();
    }

    public static int calculaMediaPonderada(int num1, int valor1, int num2, int valor2) {
        return ((num1 * valor1 + num2 * valor2) / (valor1 + valor2));
    }

    public static int calculaProduto(int num1, int valor1, int num2, int valor2) {
        return ((num1 * valor1 + num2 * valor2));
    }

}
