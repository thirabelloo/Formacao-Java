package Youtube.Lista01;

import java.util.Scanner;

/**
 * Exercício 5 - Para carros com motor flex é preciso ter cautela ao escolher o combustível na hora de abastecer.
 * A principal diferença de preços e vantagens entre os dois combustíveis está na proporção preço X desempenho.
 * Para o álcool ser mais vantajoso do que a gasolina, o preço do litro tem que custar até 70% do litro da gasolina.
 * Baseado nestas informações desenvolva um aplicativo no console(terminal) para
 * determinar qual é o combustível mais vantajoso para abastecer.
 */
public class CarroFlex {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        final double PORCENTAGEM = 0.7;
        System.out.println("Álcool x Gasolina");

        double gasolina = entradaInput(scanner, "Digite o valor da gasolina: ");
        double alcool = entradaInput(scanner, "Digite o valor do álcool: ");

        if (alcool < PORCENTAGEM * gasolina) {
            System.out.println("Abastecer com Álcool");
        } else {
            System.out.println("Abastecer com Gasolina");
        }

    }

    public static double entradaInput(Scanner sc, String texto) {
        System.out.println(texto);
        return sc.nextDouble();
    }
}
