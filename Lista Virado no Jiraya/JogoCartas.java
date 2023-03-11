package Youtube.Lista01;

/**
 * Exercício 10:
 * Desenvolva uma aplicação no console(terminal)
 * para recuperar uma carta específica de um baralho de 52 cartas armazenado em dois arrays (nipes e faces).
 * Este exercício demonstra de forma prática e divertida como o array pode ser usado para otimizar
 * o uso da memória e simplificar a programação.
 * Este vídeo também ensina a usar a classe Math para gerar um número aleatório e sortear uma carta.
 */
public class JogoCartas {
    public static void main(String[] args) {

        String[] nipes = {"Ouros", "Copas", "Espadas", "Paus"};
        String[] faces = {"Az", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Valete", "Dama", "Rei"};

        //Nas linhas abaixo recuperam de forma aleatória o conteúdo dos arrays.

        String nipe = nipes[(int) (Math.random() * nipes.length)];
        String face = faces[(int) (Math.random() * faces.length)];

        //A linha abaixo exibe a carta sorteada
        System.out.println(face + " de " + nipe);
    }
}
