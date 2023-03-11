package Youtube.Lista01;

import java.util.Scanner;

/**Exercicio 02
 * Desenvolva uma aplicação no console para calcular o valor da porcentagem
 * usando regra de 3
 */
public class RegraDe3 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Programa Regra de 3");
        System.out.println("Informe o valor da sua porcentagem(%)?");
        double numeroPorcentagem = scanner.nextDouble();

        System.out.println("Informe o valor queria saber ");
        double numeroReal = scanner.nextDouble();

        double resultado = calculaRegraDe3(numeroPorcentagem, numeroReal);
        System.out.println(numeroPorcentagem + "% de " + numeroReal + " = " + resultado);

    }

    public static double calculaRegraDe3(double num1, double num2) {
        double formula;
        return formula = (num1 * num2) / 100;

    }
}
