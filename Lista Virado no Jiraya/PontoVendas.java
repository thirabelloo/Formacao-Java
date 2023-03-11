package Youtube.Lista01;

import java.util.Scanner;

/**Exercicio 3
 * Desemvolva uma aplicação no consolde(terminal) de ponto de vendas(PVD)
 * ,conforme modelo abaixo:
 * Valor total:200,00
 * Desconto (%): 5
 * Total de desconto : 190(valor calculado)
 * Valor pago: 200,00
 * Troco: 10,00(valor calculado)
 */
public class PontoVendas {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Programa PVD");
        double valorTotal =entradaDados(scanner,"Valor total:");
        double desconto =entradaDados(scanner,"Desconto(%)");

        double totalDesconto =  valorTotal -(valorTotal* desconto)/100;
        System.out.println("Total com desconto R$" + totalDesconto);

        double valorPago =entradaDados(scanner,"Valor pago em dinheiro R$:");
        double troco = valorPago - totalDesconto;
        System.out.println("O troco R$:" + troco);

    }
    public static double entradaDados(Scanner sc,String mensagem) {
        System.out.println(mensagem);
        return  sc.nextDouble();
    }
}
