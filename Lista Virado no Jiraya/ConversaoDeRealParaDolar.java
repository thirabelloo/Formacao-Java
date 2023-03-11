package LogicaDeProgramacao.VariaveisOperadoresAritmeticos;

import java.util.Scanner;

/**
 * Exercicio 12
 * Elaborar um programa que realize a conversão de R$ para US$, o programa deve saber qual o valor da cotação do dólar e fazer a conversão.
 */
public class ConversaoDeRealParaDolar {
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);
        System.out.println("Programa que converte real em dólar");
        System.out.println("");
        double cotacaoDolar = 5.20;

        System.out.println("Informe o valor do real brasileiro");
        double real = leitor.nextDouble();

        double dolar = real / cotacaoDolar;
        System.out.println(String.format("R$ %.2f Real brasileiro igual a US$ %.2f dólares americano", real, dolar));


    }
}
