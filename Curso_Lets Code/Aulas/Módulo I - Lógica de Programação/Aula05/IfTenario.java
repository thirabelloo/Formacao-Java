package CursoAdaF1rst.Aula05;

public class IfTenario {

    public static void main(String[] args) {

        int contador = 1;
        int resultado = 0;

        if (contador == 0) {
            resultado = 10;
        } else {
            resultado = 100;
        }

        resultado = (contador == 1) ? 10 : resultado;

        int salario = 0;
        String funcao = "Gerente";
        int tempoCasa = 1;

//Usando o If tenario
        salario = (funcao.equals("Gerente")) ? ((tempoCasa == 1) ? 1000 : 900) : 100;


        if (funcao.equals("Gerente")) {
            if (tempoCasa == 1) {
                salario = 900;
            } else {
                salario = 100;
            }
        }
    }
}
