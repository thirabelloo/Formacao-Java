package CursoAdaF1rst.Aula04.Escola;

import CursoAdaF1rst.Aula03.Matematica.Media;

import java.util.Scanner;

public class Escola {

    public static void main(String[] args) {

        final double NOTA_CORTE = 60.0;
        final double NOTA_MINIMA_RECUPERACAO = 50.0;
        final int MINIMO_PRESENCA = 50;

        Scanner sc = new Scanner(System.in);

        System.out.println("Informe a nota da disciplina 1");
        double nota1 = sc.nextDouble();
        System.out.println("Informe a nota da disciplina 2");
        double nota2 = sc.nextDouble();
        System.out.println("Informe a nota da disciplina 3");
        double nota3 = sc.nextDouble();

        System.out.println("Informe o percentual de presença do aluno");
        int presenca = sc.nextInt();

        double media = Media.CalcularMediaSimples(nota1, nota2, nota3);

//chamando o ENUM
        StatusAluno status;

        if (media > NOTA_CORTE && presenca > MINIMO_PRESENCA) {
            status = StatusAluno.APROVADO;
        } else if (media > NOTA_MINIMA_RECUPERACAO) {
            status = StatusAluno.RECUPERACAO;
        } else {
            status = StatusAluno.NAO_APROVADO;
        }
        System.out.println("O aluno foi " + status.descricao);

    }
}
