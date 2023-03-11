package Ada.Listas.Classes_e_Objetos.Exercicio1;

/**
 * Lista 01 - Módulo II
 * 1 - Crie uma classe para representar uma pessoa, com os atributos nome, sobrenome, data de nascimento e altura.
 * Crie 2 metodos um que retorne a idade e outro que retorne o nome completo.
 * Crie uma classe Aplicacao para testar sua classe.
 */
public class Aplicacao {

    public static void main(String[] args) {

        Cadastro pessoa = new Cadastro();

        pessoa.nome = "Thiago";
        pessoa.sobreNome = "Rabello";
        pessoa.dataNascimento = 2020;
        pessoa.altura = 1.86;

        pessoa.calcularIdade(pessoa.dataNascimento);
        pessoa.nomeCompleto(pessoa.nome, pessoa.sobreNome);

        System.out.println("A sua idade é: " + pessoa.dataNascimento + " anos");
        System.out.println("O nome completo: " + pessoa.nomeCompleto);
        System.out.println("A sua altura é: " + pessoa.altura);
    }
}
