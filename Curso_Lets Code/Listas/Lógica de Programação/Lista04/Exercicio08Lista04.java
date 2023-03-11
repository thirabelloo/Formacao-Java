package Listas.Lista04;

import java.util.Scanner;

/**
 * 8-Faça um programa para o cálculo de uma folha de pagamento,
 * Sabendo que os descontos são do Imposto de Renda e do INNS(10%),
 * que depende do salário bruto(conforme tabela abaixo)e que o FGTS corresponde a 11%do Salário Bruto,mas não é descontado(é a empresa que deposita).
 * O Salário Líquido corresponde ao Salário Bruto menos os descontos.
 * O programa deverá pedir ao usuário o valor da sua hora e a quantidade de horas trabalhadas no mês.
 * Desconto do IR:
 * Salário Bruto até 900(inclusive)-isento;
 * Salário Bruto até 1500(inclusive)-desconto de 5%;
 * Salário Bruto até 2500(inclusive)-desconto de 10%;
 * Salário Bruto acima de 2500-desconto de 20%
 * Imprima na tela as informações,dispostas conforme o exemplo abaixo.No exemplo o valor da hora é 5 e a quantidade de hora é 220.
 * Salário Bruto:(5*220):R$ 1100,00
 * (-)IR(5%):R$ 55,00
 * (-)INSS(10%):R$ 110,00
 * FGTS(11%):R$ 121,00
 * Total de descontos:R$ 165,00
 * Salário Liquido:R$ 935,00
 **/

public class Exercicio08Lista04 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double valorHora = entradaDados(scanner, "Informe o valor da sua hora?");
        double quantidadeHora = entradaDados(scanner, "Informe a quantidade de horas trabalhadas");
        double salarioBruto = valorHora * quantidadeHora;

        if (salarioBruto >= 0 && salarioBruto <= 900) {
            double descontoIr = 0;
            double descontoInss = salarioBruto - (salarioBruto * 0.90);
            double descontoFgtss = salarioBruto - (salarioBruto * 0.89);
            double totalDesconto = descontoIr + descontoInss;
            double salarioLiquido = salarioBruto - totalDesconto;

            System.out.println("Salário Bruto: " + "(" + valorHora + " * " + quantidadeHora + ")" + " : R$ " + salarioBruto);
            System.out.println("(-) IR (%0)                  : R$ " + descontoIr);
            System.out.println("(-) INSS (10%)                : R$ " + descontoInss);
            System.out.println("FGTS (11%)                   : R$ " + descontoFgtss);
            System.out.println("Total de descontos           : R$ " + totalDesconto);
            System.out.println("Salário Liquido              : R$ " + salarioLiquido);

        } else if (salarioBruto > 900 && salarioBruto <= 1500) {
            double descontoIr = salarioBruto - (salarioBruto * 0.95);
            double descontoInss = salarioBruto - (salarioBruto * 0.90);
            double descontoFgtss = salarioBruto - (salarioBruto * 0.89);
            double totalDesconto = descontoIr + descontoInss;
            double salarioLiquido = salarioBruto - totalDesconto;

            System.out.println("Salário Bruto: " + "(" + valorHora + " * " + quantidadeHora + ")" + " : R$ " + salarioBruto);
            System.out.println("(-) IR (5%)                  : R$ "  + descontoIr);
            System.out.println("(-) INSS (10%)                : R$ " + descontoInss);
            System.out.println("FGTS (11%)                   : R$ " + descontoFgtss);
            System.out.println("Total de descontos           : R$ " + totalDesconto);
            System.out.println("Salário Liquido              : R$ " + salarioLiquido);

        } else if (salarioBruto > 1500 && salarioBruto <= 2500) {
            double descontoIr = salarioBruto - (salarioBruto * 0.90);
            double descontoInss = salarioBruto - (salarioBruto * 0.90);
            double descontoFgtss = salarioBruto - (salarioBruto * 0.89);
            double totalDesconto = descontoIr + descontoInss;
            double salarioLiquido = salarioBruto - totalDesconto;

            System.out.println("Salário Bruto: " + "(" + valorHora + " * " + quantidadeHora + ")" + " : R$ " + salarioBruto);
            System.out.println("(-) IR (10%)                 : R$ " + descontoIr);
            System.out.println("(-) INSS (10%)                : R$ " + descontoInss);
            System.out.println("FGTS (11%)                   : R$ " + descontoFgtss);
            System.out.println("Total de descontos           : R$ " + totalDesconto);
            System.out.println("Salário Liquido              : R$ " + salarioLiquido);

        } else if (salarioBruto > 2500) {
            double descontoIr = salarioBruto - (salarioBruto * 0.80);
            double descontoInss = salarioBruto - (salarioBruto * 0.90);
            double descontoFgtss = salarioBruto - (salarioBruto * 0.89);
            double totalDesconto = descontoIr + descontoInss;
            double salarioLiquido = salarioBruto - totalDesconto;

            System.out.println("Salário Bruto: " + "(" + valorHora + " * " + quantidadeHora + ")" + " : R$ " + salarioBruto);
            System.out.println("(-) IR (20%)                 : R$ " + descontoIr);
            System.out.println("(-) INSS (10%)                : R$ " + descontoInss);
            System.out.println("FGTS (11%)                   : R$ " + descontoFgtss);
            System.out.println("Total de descontos           : R$ " + totalDesconto);
            System.out.println("Salário Liquido              : R$ " + salarioLiquido);

        } else {
            System.out.println("Dados incoretos, tente novamente");
        }
    }

    public static double entradaDados(Scanner sc, String mensagem) {
        System.out.println(mensagem);
        return sc.nextDouble();
    }

}
