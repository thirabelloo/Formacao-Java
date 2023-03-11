package CursoAdaF1rst.Aula05;

public class EstruturaRepeticaoWhile {

    public static void main(String[] args) {

        int contador = 0;

        while (contador <= 10) {
            System.out.println("Olá Turma " + contador);
//            contador = contador +1;
            contador++;
        }
        contador = 0;
        do {
            System.out.println("Olá Turma 2 " + contador);
            contador++;
        } while (contador < 10);

    }
}
