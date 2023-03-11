package CursoAdaF1rst.Aula03.Logica;

import CursoAdaF1rst.Aula03.Matematica.Media;

public class Aplicacao {

    public static void main(String[] args) {

        double num1 = 33.2;
        double num2 = 99.3;
        double num3 = 1.9;

        double media = Media.CalcularMediaSimples(num1, num2, num3);
        System.out.printf("A média simples é: %.2f\n", media);


        double mediaPonderada = Media.calcularMediaPonderada(num1, num2, num3);
        System.out.printf("A média ponderada é: %.2f\n", mediaPonderada);

    }
}
