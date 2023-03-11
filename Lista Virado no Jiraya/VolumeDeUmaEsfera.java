package LogicaDeProgramacao.VariaveisOperadoresAritmeticos;

import java.util.Scanner;

/**
 * Exercicio 16
 * Elabore uma rotina que apresente o valor do volume de uma esfera, utilize a fórmula abaixo:
 * <p>
 * V=(43)(R3)
 * <p>
 * Onde:
 * V = Volume
 * = 3.141592654
 * R = Raio
 */
public class VolumeDeUmaEsfera {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);
        System.out.println("Progrma volume de uma esfera");
        System.out.println("");

        final double PI = 3.141592654;

        System.out.println("Informe o raio da esfera");
        double raioEsfera = leitor.nextDouble();

        double volumeEsfera = ((4 * PI * raioEsfera * raioEsfera * raioEsfera) / 3);
        System.out.println(String.format("O volume da esfera é %.2f ", volumeEsfera));

    }
}
