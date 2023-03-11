package CursoAdaF1rst.Aula04.Aula;

public class SwitchAula {

    public static void main(String[] args) {

        String palavra = "java";

        switch (palavra) {
            case "c#":
                System.out.println("É c#");
                break;
            case "javaScript":
                System.out.println("É javaScript");
                break;
            case "java":
                System.out.println("É java");
                break;
            default:
                System.out.println("Não é nenhuma");
        }

    }
}
