package Listas.Lista05;

import java.util.Scanner;

/**
 * 05-Faça um código que solicite uma senha formada de 4 números inteiros, caso a senha esteja correta apresente a mensagem:
 * "Senha correta", caso contrário apresente a mensagem: "Senha inválida, tente novamente!"
 * Obs: a senha de comparação, você mesmo pode definir. E o programa termina somente quando a senha correta for digitada
 */
public class Exercicio05Lista05 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int solicitacaoSenha;
        int senha = 1234;

        do {
            System.out.println("Insira a sua senha?");
            solicitacaoSenha = scanner.nextInt();

            if (solicitacaoSenha == senha) {
                System.out.println("Senha correta");
                break;

            } else if (solicitacaoSenha != senha) {
                System.out.println("Senha inválida, tente novamente!");
            }

        } while (true);

    }
}


