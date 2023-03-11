package CursoAdaF1rst.Aula04.Escola;

public enum StatusAluno {

    APROVADO("Aprovado"),
    NAO_APROVADO("Reprovado"),
    RECUPERACAO("Recuperação");

    public String descricao;

    //Vamos aprender isso em O.O
    StatusAluno(String descricao) {
        this.descricao = descricao;
    }


}
