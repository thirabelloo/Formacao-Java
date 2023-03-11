package Youtube.Lista01;

import java.util.Scanner;

/**Exercicio 01
 * Nos Estados Unidos a temperatura em geral é medida em uma escala denominada
 * fahrenheit. Desenvolva uma aplicação no console(terminal) que faça a conversão
 * de temperatura em Fahrenheit para Celsius.
 */
public class ConversaoTemperatura {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Conversão de temperatura");
        System.out.println("Informe a temperatura em Fahrenheit");
        double entradaFahrenheit = scanner.nextDouble();

        double resultado = calculaTemperatura(entradaFahrenheit);
        System.out.printf("A temperatura em graus Celsius é: %.1f" +
                "°C", resultado);
    }

    public static double calculaTemperatura(double temperaturaF) {
        double CalculaCelsius = (5 * temperaturaF - 160) / 9;
        return CalculaCelsius;

    }
}
