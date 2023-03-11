package CursoAdaF1rst.Aula01;

public class OperacoesMatematicas {

    public static void main(String[] args) {

        double preco = 10.0;
        int quantidade = 5;
        int conteudo = 99;
        int conteudo1 = 1;

        double valor = preco * quantidade;
        System.out.println(valor);
        double valor1 = preco / quantidade;
        System.out.println(valor1);
        double valor2 = preco + quantidade;
        System.out.println(valor2);
        double valor3 = preco - quantidade;
        System.out.println(valor3);
        double valor4 = ((preco + quantidade) / conteudo) + conteudo1;
        System.out.println(valor4);
    }
}
