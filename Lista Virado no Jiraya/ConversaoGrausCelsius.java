package LogicaDeProgramacao.VariaveisOperadoresAritmeticos;

import java.util.Scanner;

/**Exercicio 3
 * Escreva um programa que realize a conversão de graus Celsius (C)  para graus Fahrenheit (F).
 * Utilize a fórmula abaixo:
 *
 * F = ( 9 C) 5
 */
public class ConversaoGrausCelsius {
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);
        System.out.println("Programa Conversão de temperatura");
        System.out.println("");
        System.out.println("Informe a temperatura em graus Celsius");
        double tenperaturaCelsius = leitor.nextDouble();
        double temperaturaFahrenheit = (9 * tenperaturaCelsius) / 5;

        System.out.println(String.format("A temperatura em Fahrenheit é %.0f", temperaturaFahrenheit));
    }
}
