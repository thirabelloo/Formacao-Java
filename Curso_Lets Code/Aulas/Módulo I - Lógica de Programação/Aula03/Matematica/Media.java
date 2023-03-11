package CursoAdaF1rst.Aula03.Matematica;

public class Media {
    public static double CalcularMediaSimples(double num1, double num2, double num3) {
        return ((num1 + num2 + num3) / 3.0);
    }

    public static double calcularMediaPonderada(double num1, double num2, double num3) {
        return ((num1 * 3 + num2 * 2 + num3 * 4) / (3 + 2 + 4));
    }
}
