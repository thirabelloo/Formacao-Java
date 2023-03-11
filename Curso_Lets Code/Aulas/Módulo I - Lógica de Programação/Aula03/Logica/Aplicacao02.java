package CursoAdaF1rst.Aula03.Logica;

import CursoAdaF1rst.Aula03.Matematica.Media;

import java.util.Scanner;

public class Aplicacao02 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double num1 = lerNumero(scanner, "Informe o primeiro número");
        double num2 = lerNumero(scanner, "Informe o segundo número");
        double num3 = lerNumero(scanner, "Informe o terceiro número");


        double media = Media.CalcularMediaSimples(num1, num2, num3);
        System.out.printf("A média simples é : %.2f", media);

    }

    public static double lerNumero(Scanner sc, String mensagem) {
        System.out.println(mensagem);
//        double num1 = sc.nextDouble();
        return sc.nextDouble();

    }
}
