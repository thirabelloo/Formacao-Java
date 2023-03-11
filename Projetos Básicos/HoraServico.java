package Youtube.Lista01;

import java.util.Scanner;

/**
 * Exercício 4 - Desenvolva uma aplicação no console(terminal) para calcular o valor da hora de um serviço.
 */
public class HoraServico {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        final double IMPOSTOS = 0.30;
        final double INVESTIMENTO = 0.20;

        System.out.println("Cálculo do valor da hora de um serviço ");
        double remuneracaoMensal = entradaDados(scanner, "Remuração mensal pretendida: ");
        double custoOperacional = entradaDados(scanner, "Custo Operacional mensal: ");
        double cargaHorariaMensal = entradaDados(scanner, "Carga horária mensal de trabalho");

        double hora = (remuneracaoMensal + (remuneracaoMensal * IMPOSTOS) + custoOperacional + (remuneracaoMensal * INVESTIMENTO)) / cargaHorariaMensal;
        System.out.println("Valor da hora R$: " + hora);
    }
    public static double entradaDados(Scanner sc, String mensagem) {
        System.out.println(mensagem);
        return sc.nextDouble();
    }
}
