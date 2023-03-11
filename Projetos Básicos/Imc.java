package Youtube.Lista01;

import java.util.Scanner;

/**
 * Exercício 6:
 * Desenvolva um aplicativo no console(terminal) para calcular o valor do IMC.
 * O aplicativo deverá exibir além do valor do IMC a classificação de acordo com a tabela do IMC.
 */
public class Imc {
    public static void main(String[] args) {

        System.out.println("Calculo do IMC");
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o seu peso");
        double peso = scanner.nextDouble();
        System.out.println("Digite a sua altura");
        double altura = scanner.nextDouble();

        double calculaImc = peso / (altura * altura);

        if (calculaImc >= 0 && calculaImc <= 18.5) {
            System.out.printf("Abaixo do peso");
        } else if (calculaImc >= 18.6 && calculaImc <= 24.9) {
            System.out.printf("Peso ideal: %.2f ", calculaImc);
        } else if (calculaImc >= 25.0 && calculaImc <= 29.9) {
            System.out.printf("Levemente acima do peso: %.2f", calculaImc);
        } else if (calculaImc >= 30.0 && calculaImc <= 34.9) {
            System.out.printf("Obesidade grau I: %.2f", calculaImc);
        } else if (calculaImc >= 35.0 && calculaImc <= 39.9) {
            System.out.printf("Obesidade grau II (severa): %.2f", calculaImc);
        } else if (calculaImc >= 40.0) {
            System.out.printf("Obesidade grau III (mórbida): %.2f", calculaImc);
        } else {
            System.out.printf("Valor inválido, tente novamente: %.2f", calculaImc);
        }
    }
}
