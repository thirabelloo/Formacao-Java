package CursoAdaF1rst.Aula03.Aula;

public class MetodoMediaPonderada {

    public static void main(String[] args) {
        imprimirMensagem("Hello World");

        double notaBiologia = 8.2;
        double notaFilosofia = 7.9;
        double notaFisica = 5.0;

        double pesoBiologia = 3;
        double pesoFilosofia = 2;
        double pesoFisica = 4;

        double mediaPond = mediaPonderada(notaBiologia, pesoBiologia, notaFilosofia, pesoFilosofia, notaFisica, pesoFisica);
        System.out.printf("A média ponderada das notas é: %.2f \n", mediaPond);

        double mediaArit = mediaSimples(notaBiologia, notaFilosofia, notaFisica);
        System.out.printf("A média simples das notas é: %.2f ", mediaArit);
    }

    public static void imprimirMensagem(String mensagem) {
        System.out.println(mensagem);
    }

    public static double mediaSimples(double num1, double num2, double num3) {
        return ((num1 + num2 + num3) / 3.0);
    }

    public static double mediaPonderada(double num1, double valor1, double num2, double valor2, double num3, double valor3) {
        return ((num1 * valor1 + num2 * valor2 + num3 * valor3) / (valor1 + valor2 + valor3));
    }
}
