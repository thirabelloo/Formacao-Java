package Listas.Lista05;

import java.util.Scanner;

/**
 * 03-Faça um programa que peça para o usuário digitar a idade, o salário e o sexo de uma pessoa até que as entradas digitadas sejam válidas.
 * Idade: entre 0 e 150; Salário: maior que 0; Gênero: M, F ou Outro.
 * Por último imprima os dados recebidos do usuário.
 */
public class Exercicio03Lista05 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int idade;
        double salario;
        String sexo;
        boolean entradaVailida = false;

        do {
            System.out.println("Informe a sua idade");
            idade = scanner.nextInt();

            System.out.println("Informe o seu salario");
            salario = scanner.nextDouble();

            System.out.println("Informe o seu Gênero: M, F ou Outro");
            sexo = scanner.next();

            if (idade >= 0 && idade <= 150 && salario > 0 &&
                    (sexo.equalsIgnoreCase("M") || sexo.equalsIgnoreCase("F") ||
                            sexo.equalsIgnoreCase("Outro")) ) {
                entradaVailida = true;
            } else {
                System.out.println("Entrada inválida. Tente novamente");
            }

        } while (!entradaVailida);

        System.out.println("A sua idada é " + idade + ", seu salário é R$:" + salario + " e seu gênero é " + sexo);
    }
}
//((idade > 0 && idade <= 150) &&
//                (salario > 0) && (sexo.equals("M") || (sexo.equals("F") || (sexo.equals("Outro")))));