package CursoAdaF1rst.Aula04.Aula;

import CursoAdaF1rst.Aula04.Util.Meses;

import java.util.Scanner;

/**
 * ENUM-Exemplos
 */
public class Principal {

    public static void main(String[] args) {

        System.out.println("Inicio da aplicação");

        System.out.println("Informe o mês do seu nascimento");

        Scanner sc = new Scanner(System.in);
        String mes = sc.nextLine();

//        Chamando o ENUM E CONVERTENDO PARA MAIUSCULO
        Meses mesDigitado = Meses.valueOf(mes.toUpperCase());

        switch (mesDigitado) {
            case JANEIRO:
                System.out.println("O mês informado foi " + mes);
                break;
            case MARCO:
                System.out.println("O mês informado foi " + mes);
                break;
            case SETEMBRO:
                System.out.println("O mês informado foi " + mes);
                break;
            default:
                System.out.println("O mês não existe ");


        }


        System.out.println("Fim da Aplicação");

    }
}
