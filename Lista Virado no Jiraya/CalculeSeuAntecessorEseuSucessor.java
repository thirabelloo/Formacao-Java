package LogicaDeProgramacao.VariaveisOperadoresAritmeticos;

import java.util.Scanner;

/**
 * Exercicio 18
 * Desenvolva uma rotina que dado um número inteiro qualquer calcule seu antecessor e seu sucessor.
 */
public class CalculeSeuAntecessorEseuSucessor {
    public static void main(String[] args) {

        System.out.println("Programa  que calcula o seu número antecessor e seu sucessor ");
        System.out.println("");
        Scanner leitor = new Scanner(System.in);

        System.out.println("Informe um numero");
        int numero = leitor.nextInt();

        int numeroAntecessor = numero - 1;
        int numeroSucessor = numero + 1;

        System.out.println("O número antecessor é " + numeroAntecessor);
        System.out.println("O número sucessor é " + numeroSucessor);
    }
}
