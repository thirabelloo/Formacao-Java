package Listas.Lista04;

import java.util.Scanner;

/**
 * 2 - Faça um programa que calcule e imprima a média ponderada de um aluno.
 * Inicialmente, o programa deverá ler o peso da primeira prova e o peso da segunda prova (ambos inteiros).
 * A seguir, o programa deverá ler os seguintes dados do aluno: matrícula (inteiro), nota da primeira prova e nota da segunda prova (ambas reais).
 * Por último, o programa deve mostrar a matricula do aluno seguida da sua média. O seu programa deve, obrigatoriamente,
 * utilizar a seguinte função feita por você:
 * <p>
 * calculaMediaPonderada(): recebe 2 notas (reais) e seus respectivos pesos (inteiros) como parâmetros e retorna a média ponderada dos valores;
 */
public class Exercicio02Lista04 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int peso1 = entradaDeDados(scanner, "Informe o peso da primeira prova");
        int peso2 = entradaDeDados(scanner, "Informe o peso da segunda prova");
        int matricula = entradaDeDados(scanner, "Informe o seu número de Matricula");
        int prova1 = entradaDeDados(scanner, "Informe a nota da primeira prova:");
        int prova2 = entradaDeDados(scanner, "Informe a nota da segunda prova:");


        int mediaPonderadaAluno = calculaMediaPonderada(prova1, peso1, prova2, peso2);
        System.out.println("O numero de matricula do aluno(a) é: " + matricula + " e sua média é: "
                + mediaPonderadaAluno);
    }

    public static int entradaDeDados(Scanner sc, String mensagem) {
        System.out.println(mensagem);
        return sc.nextInt();
    }

    public static int calculaMediaPonderada(int num1, int valor1, int num2, int valor2) {
        return ((num1 * valor1 + num2 * valor2) / (valor1 + valor2));
    }

}
