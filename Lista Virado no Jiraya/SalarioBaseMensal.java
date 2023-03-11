package LogicaDeProgramacao.VariaveisOperadoresAritmeticos;

import java.util.Scanner;

/**
 * Exercicio 13
 * Elaborar um programa que leia o salário base mensal (SB) de um funcionário e o percentual de reajuste (PR) e
 * calcule e apresente o novo valor de salário do funcionário.
 * A fórmula abaixo é uma sugestão de como esse cálculo pode ser feito:
 * NS=SB + (SB*PR)  100
 * Onde:
 * NS = Novo Salário
 * SB = Salário Base
 * PR = Percentual de Reajuste
 */
public class SalarioBaseMensal {
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        System.out.println("Programa novo salário do funcionário");
        System.out.println("");

        System.out.println("Informe o salário base");
        double salarioBase = leitor.nextDouble();

        System.out.println("Informe o percentual de reajuste");
        double percentual = leitor.nextDouble();

        double novoSalario = salarioBase + ((salarioBase * percentual) / 100);
        System.out.println(String.format("O novo salário do funcionário é R$ %.2f",novoSalario));


    }
}
