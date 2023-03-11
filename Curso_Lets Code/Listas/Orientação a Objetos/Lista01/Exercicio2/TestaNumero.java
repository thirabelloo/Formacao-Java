package Ada.Listas.Classes_e_Objetos.Exercicio2;

public class TestaNumero {

    public int numeroImpar;


    public int getNumeroImpar(int numeroImpar) {
        if (numeroImpar % 2 == 1) {
            System.out.println(numeroImpar + " é impar");
            this.numeroImpar = numeroImpar;
        } else {
            System.out.println(numeroImpar + " é par");
        }
        return numeroImpar;
    }
}





