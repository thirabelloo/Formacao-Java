package LogicaDeProgramacao.VariaveisOperadoresAritmeticos;

import java.util.Scanner;

/**
 * Exercicio 15
 * Construa um programa que calcule a velocidade em metros por segundo de um projétil que percorre uma distância
 * em quilômetros a um espaço de tempo em minutos, utilize a fórmula abaixo:
 * <p>
 * V=(D * 1000) / (T*60)
 * <p>
 * Onde:
 * V = Velocidade em m/s
 * D = Distância
 * T = Tempo
 */
public class VelocidadeProjetil {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);
        System.out.println("Velocidade de um projétil");
        System.out.println("");

        System.out.println("Informe a distância percorrida pelo projétil (Km)");
        double distancia = leitor.nextDouble();

        System.out.println("Informe o tempo do projétil (min)");
        double tempo = leitor.nextDouble();

        double velocidade = (distancia * 1000) / (tempo * 60);

        System.out.println(String.format("A velocidade do projétil é %.2f(m/s)", velocidade));
    }
}
