package Listas.Lista04;

import java.util.Scanner;

/**
 * 7 - A empresa X resolveu dar um aumento de salário aos seus colaboradores e lhe contraram para desenvolver o programa que calculará os reajustes.
 * Faça um programa que recebe o salário de um colaborador e use a tabela abaixo para identificar o percentual de aumento baseado no salário atual:
 * salários até R$ 280,00 (incluindo) : aumento de 20%
 * salários entre R$ 280,00 e R$ 700,00 : aumento de 15%
 * salários entre R$ 700,00 e R$ 1500,00 : aumento de 10%
 * salários de R$ 1500,00 em diante : aumento de 5%
 * Após o aumento ser realizado, informe na tela:
 * O salário antes do reajuste;
 * O percentual de aumento aplicado;
 * O valor do aumento;
 * O novo salário, após o aumento
 */
public class Exercicio07Lista04 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe o seu salário:");
        double salarioColaborador = scanner.nextDouble();

        if (salarioColaborador >= 0 && salarioColaborador <= 280.00) {
            int percentual = 20;
            double valorAumento = salarioColaborador * 1.20 - salarioColaborador;
            double novoSalario = salarioColaborador + valorAumento;

            System.out.println("O salário antes do reajuste R$ " + salarioColaborador);
            System.out.println("O percentual de aumento foi de " + percentual + "%");
            System.out.println("O percentual do aumento foi de R$" + valorAumento);
            System.out.println("O novo salário após o aumento de R$" + novoSalario);

        } else if (salarioColaborador > 280 && salarioColaborador <= 700) {
            int percentual = 15;
            double valorAumento = salarioColaborador * 1.15 - salarioColaborador;
            double novoSalario = salarioColaborador + valorAumento;

            System.out.println("O salário antes do reajuste R$ " + salarioColaborador);
            System.out.println("O percentual de aumento foi de " + percentual + "%");
            System.out.println("O percentual do aumento foi de R$" + valorAumento);
            System.out.println("O novo salário após o aumento de R$" + novoSalario);

        } else if (salarioColaborador > 700 && salarioColaborador <= 1500) {
            int percentual = 10;
            double valorAumento = salarioColaborador * 1.10 - salarioColaborador;
            double novoSalario = salarioColaborador + valorAumento;

            System.out.println("O salário antes do reajuste R$ " + salarioColaborador);
            System.out.println("O percentual de aumento foi de " + percentual + "%");
            System.out.println("O percentual do aumento foi de R$" + valorAumento);
            System.out.println("O novo salário após o aumento de R$" + novoSalario);

        } else if (salarioColaborador > 1500) {
            int percentual = 5;
            double valorAumento = salarioColaborador * 1.05 - salarioColaborador;
            double novoSalario = salarioColaborador + valorAumento;
            System.out.println("O salário antes do reajuste R$ " + salarioColaborador);
            System.out.println("O percentual de aumento foi de " + percentual + "%");
            System.out.println("O percentual do aumento foi de R$" + valorAumento);
            System.out.println("O novo salário após o aumento de R$" + novoSalario);
        } else {
            System.out.println("Salário inválido");
        }
    }
}

