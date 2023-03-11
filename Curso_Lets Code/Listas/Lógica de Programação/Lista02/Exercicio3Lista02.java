package Listas.Lista02;

import java.util.Calendar;
import java.util.Scanner;

/**
 * Crie um programa que solicite os dados do usuario: Nome, Cidade e Ano de nascimento
 * Exemplo de entrada:
 * Nome: Rodrigo Cidade: Sao Paulo Ano de nascimento: 1984
 * Calcule a idade da pessoa e final imprima a seguinte mensagem:
 * "Ola, NOME. A sua idade é IDADE anos. A sua cidade é CIDADE".
 * SAIDA:
 * "Ola, Rodrigo. A sua idade é 39 anos. A sua cidade é Sao Paulo".
 */
public class Exercicio3Lista02 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o seu nome? ");
        String nome = sc.nextLine();

        System.out.println("Digite a sua cidade?");
        String cidade = sc.nextLine();

        System.out.println("informe seu ano de nascimento? ");
        int anoNascimento = sc.nextInt();

        // Chamando a biblioteca Ano
        Calendar ano = Calendar.getInstance();

        int idadeAtual = ano.get(Calendar.YEAR) - anoNascimento;

        System.out.printf("Olá. %s. A sua idade é %d anos. A sua cidade é %s", nome, idadeAtual, cidade);

    }
}

