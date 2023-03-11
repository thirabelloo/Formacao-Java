package LogicaDeProgramacao.VariaveisOperadoresAritmeticos;

import java.util.Scanner;

/**Exercicio 19
 *Baseado nesses símbolos, existem alguns cálculos que podemos fazer utilizando a Lei de Ohm,
 *  que diz que tendo ao menos dois valores pode-se encontrar o terceiro.
 *
 *  A-) Em um circuito elétrico temos as seguintes informações:
 * 275 V e 10 A, calcule a resistência elétrica, utilizando a fórmula abaixo:
 * R=UI
 * Onde:
 * 	R = Resistência em Ohms
 * 	U = Tensão em Volts
 * 	I = Corrente em Amperes
 */
public class LeiDeOhm {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);
        System.out.println("Programa Lei de Ohm");
        System.out.println("");

        System.out.println("Digite o valor da tensão ");
        double tensao = leitor.nextDouble();

        System.out.println("Digite o valor da corrente");
        double corrente = leitor.nextDouble();

        double resistencia = tensao / corrente;

        System.out.println(String.format("O valor da resistência é R: %.2f",resistencia));


    }
}
