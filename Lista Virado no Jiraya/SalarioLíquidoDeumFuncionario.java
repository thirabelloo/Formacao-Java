package LogicaDeProgramacao.VariaveisOperadoresAritmeticos;

import java.util.Scanner;

/**
 * Exercicio 2
 * Baseado nas fórmulas abaixo, desenvolva uma rotina que calcule o salário líquido de um funcionário.
 * Após o cálculo o programa deve apresentar o salário base e o salário líquido calculado.
 * SB = HT * VH
 * TD = (PD / 100) * SB
 * SL = SB  - TD
 * <p>
 * Onde:
 * SB =  Salário Base
 * HT = Horas Trabalhadas
 * VH = Valor Hora de trabalho
 * TD = Total de Descontos
 * PD = Percentual de Desconto
 * SL = Salário Líquido
 */
public class SalarioLíquidoDeumFuncionario {
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);
        System.out.println("Programa Salário");
        System.out.println("");

        double horasTrabalhadas = entradaDados(leitor, "Informe o total de horas trabalhadas");
        double valorHoraTrabalho = entradaDados(leitor, "Informe o valor da hora de trabalho");
        double percentualDesconto = entradaDados(leitor, "Informe o percentual de desconto");

        double salarioBase = horasTrabalhadas * valorHoraTrabalho;
        double totalDesconto = (percentualDesconto / 100) * salarioBase;
        double salarioLiquido = salarioBase - totalDesconto;

        System.out.println(String.format("O Salário base é de R$ %.2f", salarioBase));
        System.out.println(String.format("O Salário liquído é de R$ %.2f", salarioLiquido));

    }

    public static double entradaDados(Scanner scan, String mensagem) {
        System.out.println(mensagem);
        return scan.nextDouble();
    }
}
