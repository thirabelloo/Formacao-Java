package LogicaDeProgramacao.VariaveisOperadoresAritmeticos;

import java.util.Scanner;

/**
 * Exercicio 9
 * Desenvolver um programa que apresente e calcule o volume de uma caixa retangular, utilize a fórmula abaixo:
 * <p>
 * V=CLA
 * <p>
 * Onde:
 * V = Volume em cm3
 * C = Comprimento
 * L = Largura
 * A = Altura
 */
public class VolumeDeUmaCaixa {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);
        System.out.println("Programa Calculo do volume de uma caixa retangular");
        System.out.println("");

        double comprimento = entradaDados(leitor, "Informe o comprimento da caixa");
        double largura = entradaDados(leitor, "Informe a largura da caixa");
        double altura = entradaDados(leitor, "Informe a altura da caixa");

        double volume = comprimento * largura * altura;

        System.out.println(String.format("O volume da caixa informada é V: %.2f", volume));


    }

    public static double entradaDados(Scanner teclado, String mensagem) {
        System.out.println(mensagem);
        return teclado.nextDouble();
    }
}
