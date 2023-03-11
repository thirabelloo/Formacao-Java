package LogicaDeProgramacao.VariaveisOperadoresAritmeticos;

import java.util.Scanner;

/**Exercicio 1
 * Baseado na fórmula abaixo escreva um programa que calcule e apresente a área de um círculo.

 A = R2

 Onde:
 A representa a área do círculo
 = 3.141592654
 R = Raio do círculo (deve ser fornecido pelo usuário)
 *
 */
public class AreaDoCirculo {

    public static void main(String[] args) {

        double area;

        final double PI = 3.141592654;

        Scanner leitor = new Scanner(System.in);
        System.out.println("Programa Área do Círculo");
        System.out.println("");

        System.out.println("Informe o raio do círculo?");
        double raio = leitor.nextDouble();

        area = PI * (raio * raio);

//       Objeto para formatar o resultado em 2 casas decimais
        System.out.println(String.format("A área do circulo é: %.2f",area));

    }
}
