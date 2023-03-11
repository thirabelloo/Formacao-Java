package Listas.Lista03;
/**
 * Crie um classe calculadora com os seguites metodos: somar, subtrair, multiplicar e dividir.
 * Cada metodo deve receber dois parametros e retornar o resultado da operação.
 * Lembre-se que nesse momento todos os metodos devem ser estaticos.
 * Crie um programa para usar a calculadora.
 */
public class Exercicio04Thiago {

    public static void main(String[] args) {
        double num1 = 10;
        double num2 = 3;

        double soma = operacaoSoma(num1, num2);
        System.out.printf(" O resultado da soma é %.2f\n", soma);

        double subtracao = operacaoSoma(num1, num2);
        System.out.printf(" O resultado da subtração é %.2f\n", subtracao);

        double multiplicao = operacaoMultiplicar(num1, num2);
        System.out.printf(" O resultado da multiplicação é %.2f\n", multiplicao);

        double divisao =operacaoDivisao (num1, num2);
        System.out.printf(" O resultado da multiplicação é %.2f\n", divisao);

    }

    public static double operacaoSoma(double num1, double num2) {
        return (num1 + num2);
    }

    public static double operacaoSubtrair(double num1, double num2) {
        return (num1 - num2);
    }

    public static double operacaoMultiplicar(double num1, double num2) {
        return (num1 * num2);
    }

    public static double operacaoDivisao(double num1, double num2) {
        return (num1 / num2);
    }
}
