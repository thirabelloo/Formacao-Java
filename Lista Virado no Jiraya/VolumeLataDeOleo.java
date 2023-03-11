package LogicaDeProgramacao.VariaveisOperadoresAritmeticos;

import java.util.Scanner;

/**
 * Exercicio 5
 * <p>
 * Escreva uma rotina capaz de calcular e apresentar o valor do volume de uma lata de óleo, utilize a fórmula abaixo.
 * <p>
 * V = R2A
 * <p>
 * Onde:
 * V = Volume
 * = 3.141592654
 * R = Raio da circunferência da lata
 * A = Altura da lata
 * OBS: O volume deve ser apresentado com a unidade de medida correto cm3.
 */
public class VolumeLataDeOleo {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);
        final double PI = 3.141592654;

        System.out.println("Programa que calcula o volume de uma lata");
        System.out.println("");

        System.out.println("Informe o raio da lata");
        double raioLata = leitor.nextDouble();

        System.out.println("Informe a área da lata");
        double areaLata = leitor.nextDouble();

        double volumeLata = (PI * raioLata * raioLata) * areaLata;

        System.out.println(String.format("O volume da lata de óleo é V: %.2f cm^3", volumeLata));


    }
}
