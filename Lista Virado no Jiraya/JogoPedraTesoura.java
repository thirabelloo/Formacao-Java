package Youtube.Lista01;

import java.util.Scanner;

/**
 * Exercício 7:  Desenvolva o jogo “Pedra – Papel – Tesoura” (Jokenpô),  conforme modelo abaixo:
 * ______ JoKenPô ______
 * 1. Pedra
 * 2. Papel
 * 3. Tesoura
 * Digite a opção desejada:
 * Jogador escolheu:
 * Computador escolheu:
 * VENCEDOR:
 */
public class JogoPedraTesoura {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.println("_____JokenPô_____");
        System.out.println("");

        System.out.println("1. Pedra");
        System.out.println("2. Papel");
        System.out.println("3. Tesoura");
        System.out.println("Digite a opção desejada: ");

        int jogador = teclado.nextInt();
        System.out.println("");

        switch (jogador) {
            case 1:
                System.out.println("Jogador escolheu PEDRA");
                break;
            case 2:
                System.out.println("Jogador escolheu PAPEL");
                break;
            case 3:
                System.out.println("Jogador escolheu TESOURA");
                break;
            default:
                System.out.println("Opção inválida");
                break;
        }

        int computador = (int) (Math.random() * 3 + 1);
        teclado.close();
        switch (computador) {
            case 1:
                System.out.println("Computador escolheu PEDRA");
                break;
            case 2:
                System.out.println("Computador escolheu PAPEL");
                break;
            case 3:
                System.out.println("Computador escolheu TESOURA");
                break;
        }
        System.out.println("");

        if (jogador == computador) {
            System.out.println("Empate");
        } else if ((jogador == 1 && computador == 3) || (jogador == 2 && computador == 1) || (jogador == 3 && computador == 2)) {
            System.out.println("JOGADOR VENCEU");
        } else {
            System.out.println("COMPUTADOR VENCEU");
        }
    }
}

