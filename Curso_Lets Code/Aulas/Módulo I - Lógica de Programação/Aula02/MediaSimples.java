package CursoAdaF1rst.Aula02;

import java.util.Scanner;

/**
 * Exercicio media simples com o input para o usuario.
 */
public class MediaSimples {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Programa Média Simples De 3 Idades,Seja bem-vindo");
        System.out.println("Digite a primeira idade?");
        double idade1 = scanner.nextInt();

        System.out.println("Digite a segunda idade?");
        double idade2 = scanner.nextInt();

        System.out.println("Digite a terceira?");
        double idade3 = scanner.nextInt();

        double quantidadeIdades = 3.0;
        double somaIdades = (idade1 + idade2 + idade3);
        double mediaIdades = somaIdades / quantidadeIdades;

        System.out.printf("A média da idade é: %.2f ", mediaIdades);
    }
}
