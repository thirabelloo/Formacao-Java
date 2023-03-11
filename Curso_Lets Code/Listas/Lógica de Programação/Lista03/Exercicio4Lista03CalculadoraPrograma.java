package Listas.Lista03;

/**
 * Crie um classe calculadora com os seguites metodos: somar, subtrair, multiplicar e dividir.
 * Cada metodo deve receber dois parametros e retornar o resultado da operação.
 * Lembre-se que nesse momento todos os metodos devem ser estaticos.
 * Crie um programa para usar a calculadora.
 */
public class Exercicio4Lista03CalculadoraPrograma {
    public static void main(String[] args) {

        float num1 = 10;
        float num2 = 3;

        float soma = Exercicio4Lista03CalculadoraClasse.OperacaoSoma(num1,num2);
        System.out.printf(" O resultado da soma é %.2f\n", soma);

        float subtracao = Exercicio4Lista03CalculadoraClasse.OperacaoSubtrair(num1,num2);
        System.out.printf(" O resultado da subtração é %.2f\n", subtracao);

        float multiplicao = Exercicio4Lista03CalculadoraClasse.OperacaoMultiplicao(num1,num2);
        System.out.printf(" O resultado da multiplicação é %.2f\n", multiplicao);

        float divisao = Exercicio4Lista03CalculadoraClasse.OperacaoDivisao(num1,num2);
        System.out.printf(" O resultado da multiplicação é %.2f\n", divisao);

    }
}
