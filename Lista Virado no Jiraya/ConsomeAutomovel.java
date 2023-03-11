package LogicaDeProgramacao.VariaveisOperadoresAritmeticos;

import java.util.Scanner;

/**Exercicio 6
 *Efetuar o cálculo de quantos litros de combustível um automóvel consome em uma viagem. Sabendo que o automóvel tem uma autonomia de 12 Km por litro de combustível, desenvolva o cálculo utilizando a fórmula abaixo:
 *
 * 	D=TV
 * 	LU=D  12
 *
 * 	Onde:
 * 		D = Distância em Km
 * 		T = Tempo gasto na viagem
 * 		V = Velocidade
 */
public class ConsomeAutomovel {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        System.out.println("Programa Consume Combustivél");

        System.out.println("Informe o tempo gasto na viagem?");
        double tempo = leitor.nextDouble();

        System.out.println("Informe a velocidade da média da viagem?");
        double velocidade = leitor.nextDouble();

        double distancia = tempo * velocidade;
        double litrosViagem = distancia/12;


        System.out.println(String.format("Nessa viagem o automóvel consume %.2f litros", litrosViagem));



    }
}
