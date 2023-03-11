package Listas.Lista01;

/**
 * João está aprendendo a programar na linguagem de programação Java.
 * Para praticar decidiu criar um programa para calcular a média das suas notas nos últimos 4 bimestres, sendo as notas 10, 8, 8 e 10.
 * Porém, João está em dúvida sobre quais operadores aritméticos deve usar para obter o resultado. Quais operadores João deve usar?
 */
public class Exercicio01 {
    public static void main(String[] args) {

        float nota1 = 10;
        float nota2 = 8;
        float nota3 = 8;
        float nota4 = 10;

        float media = (nota1 + nota2 + nota3 + nota4) / 4;

        System.out.printf(" A média do João é: %.2f", media);
    }
}
