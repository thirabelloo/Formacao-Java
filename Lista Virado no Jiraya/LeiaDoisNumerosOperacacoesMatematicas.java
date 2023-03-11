package LogicaDeProgramacao.VariaveisOperadoresAritmeticos;

import java.util.Scanner;

/**Exercicio 14
 * Desenvolva uma rotina que leia dois valores numéricos inteiros e
 * apresente o resultado das quatro operações aritméticas básicas (adicao, subtracao, multiplicacao e divisao).
 */
public class LeiaDoisNumerosOperacacoesMatematicas {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        System.out.println("Programa que ler dois números inteiros e apresenta 4 operações matématicas");
        System.out.println("");

        System.out.println("Informe o primeiro número");
        int num1 = leitor.nextInt();

        System.out.println("Informe o segundo número");
        int num2 = leitor.nextInt();

        int soma = num1 + num2;
        System.out.println("O resultado da soma é: " + soma);

        int subtracao = num1 - num2;
        System.out.println("O resultado da subtração é: " + subtracao);

        int multiplicao = num1 * num2;
        System.out.println("O resultado da multiplição é: " + multiplicao);

        int divisao = num1 / num2;
        System.out.println("O resultado da divisão é: " + divisao);
    }
}
