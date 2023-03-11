package LogicaDeProgramacao.VariaveisOperadoresAritmeticos;

import java.util.Scanner;

/**
 * Exercicio 8
 * Calcular e apresentar o valor de uma prestação em atraso, utilize a fórmula abaixo:
 * P=VALOR + (VALOR (TAXA100)TEMPO)
 * Onde P é o valor da prestação em atraso.
 */
public class ValorDaPrestacao {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);
        System.out.println("Programa Prestação em atraso");
        System.out.println("");

        System.out.println("Informe o valor da prestação");
        double valorPrestacao = leitor.nextDouble();

        System.out.println("Informe o valor da taxa");
        double valorTaxa = leitor.nextDouble();

        System.out.println("Informe o tempo de atraso");
        double tempo = leitor.nextDouble();

        double parcelaAtraso = valorPrestacao + (valorPrestacao * (valorTaxa / 100) * tempo);

        System.out.println(String.format("O valor da parcela em atraso é de R$ %.2f", parcelaAtraso));

    }
}
