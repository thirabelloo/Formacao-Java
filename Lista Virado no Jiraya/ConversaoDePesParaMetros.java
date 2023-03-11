package LogicaDeProgramacao.VariaveisOperadoresAritmeticos;

import java.util.Scanner;

/**
 * Exercicio 17
 * Sabendo que 1 ft é igual a 0,3048 m ou 30,48 cm,
 * desenvolva um programa que leia uma medida em pés e calcule o equivalente em metros.
 */
public class ConversaoDePesParaMetros {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);
        System.out.println("Programa que ler  uma medida em pés e converte para metros");
        System.out.println("");

        final double METROSFT = 0.3048;
        final double CENTRIMENTOSFT = 30.48;

        System.out.println("Informe uma medida em pés (ft)");
        double medidaPes = leitor.nextDouble();

        double metros = medidaPes * METROSFT;
        double centimetros = medidaPes * CENTRIMENTOSFT;

        System.out.println(String.format("A medida é igual %.4f (m) e %.2f (cm)",metros,centimetros));
    }
}
