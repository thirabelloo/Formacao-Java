package LogicaDeProgramacao.VariaveisOperadoresAritmeticos;

import java.util.Scanner;

/**
 * Exercicio 11
 * Elaborar um programa que realize a conversão de US$ para R$,
 * o programa deve saber qual o valor da cotação do dólar e fazer a conversão.
 */
public class ConversaoDeDolarParaReal {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);
        System.out.println("Programa que converte dólar em real");
        System.out.println("");
        double cotacaoReal = 5.20;

        System.out.println("Informe o valor do dólar americano");
        double dolar = leitor.nextDouble();

        double real = cotacaoReal * dolar;
        System.out.println(String.format("%.2f US$ Dólares americano igual a RS %.2f Real brasileiro",dolar,real));
    }
}
