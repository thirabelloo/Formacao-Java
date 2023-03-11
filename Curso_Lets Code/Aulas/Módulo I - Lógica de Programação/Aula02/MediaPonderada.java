package CursoAdaF1rst.Aula02;

import java.util.Scanner;

public class MediaPonderada {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Programa Média Simples De 3 notas,Seja bem-vindo");

        System.out.println("Informe a nota de Biologia e seu Peso?");
        double notaBiologia = scanner.nextDouble();
        double pesoBiologia = scanner.nextDouble();

        System.out.println("Informe a nota de Filosofia?");
        double notaFilosofia = scanner.nextDouble();
        double pesoFilosofia = scanner.nextDouble();

        System.out.println("Informe a nota de Física?");
        double notaFisica = scanner.nextDouble();
        double pesoFisica = scanner.nextDouble();

        double totalPesos = (pesoBiologia + pesoFilosofia + pesoFisica);
        double somaNotas = (notaBiologia * pesoBiologia + notaFilosofia * pesoFilosofia + notaFisica * pesoFisica);

        double mediaNotas = somaNotas / totalPesos;
        System.out.printf("A média das notas é: %.2f ", mediaNotas);
    }
}