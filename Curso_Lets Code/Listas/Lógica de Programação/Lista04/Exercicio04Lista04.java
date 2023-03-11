package Listas.Lista04;

import java.util.Scanner;

/**
 * 4 - Altere o programa do exercício 3 para que ele processe os dados de 2 alunos ao invés de apenas 1;
 */
public class Exercicio04Lista04 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int matriculaAluno1 = entradaDados(scanner, "Informe o número de matricula do primeiro Aluno(a):");
        int peso1 = entradaDados(scanner, "Informe o valor do peso da primeira prova");
        int peso2 = entradaDados(scanner, "Informe o valor do peso da segunda nota");
        int prova1 = entradaDados(scanner, "Informe o valor da primeira nota");
        int prova2 = entradaDados(scanner, "Informe o valor da segunda nota");

        int produtoAluno1 = calculaProdutos(prova1, peso1, prova2, peso2);
        int mediaAluno1 = calculaMediaPonderada(prova1, peso1, prova2, peso2);
        System.out.println("O número de matricula é: " + matriculaAluno1 + " com a média: " + mediaAluno1 + " e o seu produto é: " + produtoAluno1);

        int matriculaAluno2 = entradaDados(scanner, "Informe o número de matricula do segundo Aluno(a):");
        int peso3 = entradaDados(scanner, "Informe o valor do peso da primeira prova");
        int peso4 = entradaDados(scanner, "Informe o valor do peso da segunda nota");
        int prova3 = entradaDados(scanner, "Informe o valor da primeira nota");
        int prova4 = entradaDados(scanner, "Informe o valor da segunda nota");

        int produtoAluno2 = calculaProdutos(prova3, peso3, prova4, peso4);
        int mediaAluno2 = calculaMediaPonderada(prova3, peso3, prova4, peso4);
        System.out.println("O número de matricula é: " + matriculaAluno2 + " com a média: " + mediaAluno2 + " e o seu produto é: " + produtoAluno2);

    }

    public static int entradaDados(Scanner sc, String mensagem) {
        System.out.println(mensagem);
        return sc.nextInt();
    }

    public static int calculaMediaPonderada(int num1, int valor1, int num2, int valor2) {
        return ((num1 * valor1 + num2 * valor2) / (valor1 + valor2));
    }

    public static int calculaProdutos(int num1, int valor1, int num2, int valor2) {
        return ((num1 * valor1 + num2 * valor2));
    }

}
