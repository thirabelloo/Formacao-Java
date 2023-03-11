package CursoAdaF1rst.Aula04.Aula;

/**
 * String não pode comparar usar (==)  ATENÇÂO!!!!!!!!!!!!!!
 */
public class ControlesFluxosOperadoresLogicos {
    public static void main(String[] args) {

        System.out.println("Inicio da Aplicação");
        int valor1 = 20;
        int valor2 = 1;
        int valor3 = 88;
        int valor4 = 3;
        int valor5 = 6;

        boolean valido = valor1 == valor2;
        System.out.println(valido);

        if ((valor1 == valor2 && valor3 == valor4) || valor5 == 5) {
            System.out.println("Sim é " );
        } else {
            System.out.println("Não é " );
        }

        System.out.println("Fim da Aplicação");
    }

}
