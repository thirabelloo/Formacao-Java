package CursoAdaF1rst.Aula01;

public class MediaPonderada {
    public static void main(String[] args) {

        double notaBiologia = 8.2;
        double notaFilosofia = 7.9;
        double notaFisica = 5.0;

        double pesoBiologia = 3;
        double pesoFilosofia = 2;
        double pesoFisica = 4;

        double totalPesos = (pesoBiologia + pesoFilosofia + pesoFisica);

        double mediaPonderada = (notaBiologia * pesoBiologia + notaFilosofia * pesoFilosofia + notaFisica * pesoFisica) / totalPesos;
        System.out.printf("A media ponderada do aluno é %.2f. ", mediaPonderada);
    }

}
