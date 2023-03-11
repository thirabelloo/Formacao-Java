package Listas.Lista04;

import java.util.Scanner;

/**
 * 5 - Implemente, utilizando funções,
 * um programa que receba do usuário o valor do salário bruto de um funcionário e imprima o
 * valor com descontos de INSS, FGTS e Plano de Saúde.
 * O programa deve utilizar uma função para calcular cada um dos descontos,
 * sendo que estas funções devem receber o valor do salário bruto e retornar o valor a ser descontado.
 * Os valores descontados devem ser:
 * INSS: 10% do valor bruto; FGTS: 8%; Plano de Saúde: R$100,00.
 */

public class Exercicio05Lista04 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe o valor do seu salário Bruto:");
        double salarioBruto = scanner.nextDouble();

        double inss = descontoInss(salarioBruto);
        System.out.println("O valor à ser descontado com o INSS é R$" + inss);

        double fgts = descontoFgts(salarioBruto);
        System.out.println("O valor à ser descontado com o FGTS é R$" + fgts);

        double saude = descontoPlanoSaude(salarioBruto);
        System.out.println("O valor à ser descontado com o Plano de Saúde é R$" + saude);

        double salarioLiquido = salarioBruto - (inss + fgts + saude) ;
        System.out.println("O seu salário líquido é R$" + salarioLiquido);
    }

    public static double descontoInss(double salario) {
        return (salario - (salario * 0.90));
    }

    public static double descontoFgts(double salario) {
        return (salario - (salario * 0.92));
    }

    public static double descontoPlanoSaude(double salario) {
        return (salario - (salario - 100));
    }
}
