package CursoAdaF1rst.Aula02;

import java.util.Scanner;

public class EntradaDeValores {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite seu nome completo");
        String nome = sc.nextLine();
        System.out.println("Digite a sua cidade");
        String cidade = sc.nextLine();
        System.out.println("Digite o seu bairro");
        String bairro = sc.nextLine();

        System.out.println("O nome digitado foi " + nome);
        System.out.println("O cidade digitada foi " + cidade);
        System.out.println("O bairro digitada foi " + bairro);


        System.out.println("Digite um valor");
        String valor = sc.nextLine();
        //Para sempre ser numero e não letra para acontecer o erro
        try {
            int intValor = Integer.parseInt(valor);
        } catch (Exception e) {
            System.err.println("O valor digitado não pode ser convertido para número");
            System.exit(0);
        }


        System.out.println("Digite um outro valor");
        String outroValor = sc.nextLine();
        try {
            int intOutroValor = Integer.parseInt(outroValor);
        } catch (Exception e) {
            System.err.println("O valor digitado não pode ser convertido para número");
            System.exit(0);
        }

//        System.out.println(intValor);
//        System.out.println(intOutroValor);
//
//        System.out.println(intValor + intOutroValor);
    }
}
