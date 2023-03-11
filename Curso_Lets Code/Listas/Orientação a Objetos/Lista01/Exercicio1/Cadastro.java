package Ada.Listas.Classes_e_Objetos.Exercicio1;

import java.util.Calendar;

public class Cadastro {

    public String nome;
    public String sobreNome;

    public String nomeCompleto;
    public int dataNascimento;
    public double altura;

    public void calcularIdade(int anoNascimento) {
        Calendar calendario = Calendar.getInstance();
        this.dataNascimento = calendario.get(Calendar.YEAR) - anoNascimento;
    }

    public void nomeCompleto(String nome, String sobreNome) {
        this.nomeCompleto = nome + " " + sobreNome;
    }


}
