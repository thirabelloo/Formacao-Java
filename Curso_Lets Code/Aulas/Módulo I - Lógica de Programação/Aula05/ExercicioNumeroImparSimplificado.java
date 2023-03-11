package CursoAdaF1rst.Aula05;

import java.util.Scanner;

public class ExercicioNumeroImparSimplificado {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int numero;

        do {
            System.out.println("Informe um número");
            numero = sc.nextInt();

        } while (numero % 2 != 0);

//        boolean par
//        par = numero %2 == 0 ? true : false
//        while(!par)
//        If tenario
    }
}
