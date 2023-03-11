package LogicaDeProgramacao.VariaveisOperadoresAritmeticos;
/**
 * Exercicio 4
 * Escreva um programa que realize a conversão de graus Fahrenheit (F)  para graus Celsius (C).
 * Utilize a fórmula abaixo:
 * <p>
 * C = (( F - 32)  5)9
 */

import java.util.Scanner;

public class ConversaoGrausFahrenheit {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);
        System.out.println("Programa Conversão de temperatura");
        System.out.println("");
        System.out.println("Informe a temperatura em graus Fahrenheit");
        double temperaturaFahrenheit = leitor.nextDouble();
        double temperaturaCelsius = (5 * temperaturaFahrenheit - 160) / 9;

        System.out.println(String.format("A temperatura em graus Celsisus é %.1f", temperaturaCelsius));
    }
}
