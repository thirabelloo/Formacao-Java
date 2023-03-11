package CursoAdaF1rst.Aula02;

/**
 * Aula 10/02/2023
 * String
 * Módulo %
 */
public class EntradaEsaidaDados {

    public static void main(String[] args) {

        String valor = "Isto é um texto";

        //Quantidade de Caracter
        int tamanho = valor.length();
        System.out.println(tamanho);

        //achar a posição do caracter especifico
        int posicao = valor.indexOf("x");
        System.out.println(posicao);

        int valor1 = 7;
        int valor2 = 2;
        //Resto da divisao
        int resultado = valor1 % valor2;
        System.out.println(resultado);

        System.out.println("Palavra1");
        System.out.print("Palavra2");
        System.out.printf("Palavra3");
        System.err.println("Palavra4");

    }
}
