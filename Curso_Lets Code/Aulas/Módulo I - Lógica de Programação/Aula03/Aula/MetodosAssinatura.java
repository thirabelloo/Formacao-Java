package CursoAdaF1rst.Aula03.Aula;

/**
 * Aula 03- 13/02/2023
 * Metodos e Assinatura de metodos
 * Classes
 * Funções
 */
public class MetodosAssinatura {

    public static void main(String[] args) {

        escreverMensagem("Hello World");

        int idade1 = 35;
        int idade2 = 18;
        int idade3 = 49;

        double mediaIdades = calcularMedia(idade1, idade2, idade3);
        escreverMensagem("A média das idades é: " + mediaIdades);
    }

    public static void escreverMensagem(String mensagem) {
        System.out.println(mensagem);
    }

    public static double calcularMedia(double num1, double num2, double num3) {
        return (num1 + num2 + num3) / 3.0;
    }
}
