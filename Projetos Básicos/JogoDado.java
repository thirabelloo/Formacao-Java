package Youtube.Lista01;


import java.util.Scanner;

/**
 * Exercício 9:
 * Desenvolva um aplicativo no console(terminal) para fazer o lançamento de um dado de 6 faces.
 * O aplicativo deverá executar um sorteio, exibindo a face do dado sorteada.
 * Após a exibição da face sorteada o aplicativo deverá perguntar se o jogador deseja lançar o dado novamente.
 * Se o jogador responder que sim um novo lançamento do dado será executado.
 */
public class JogoDado {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char opcao = 's';
        while (opcao == 's') {
            System.out.println("Lançamento do  DADO................");

            int dado = (int) (Math.random() * 6 + 1);
            System.out.println("Face: " + dado);
            System.out.println("Deseja lançar o dado novamente (s/ n) ?");
            opcao = scanner.next().charAt(0);
        }

    }
}
