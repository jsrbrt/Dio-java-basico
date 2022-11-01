package Escola;

class Escola {
public static void main(String[] args) {
    Estudante estudante1 = new Estudante();
    Cor cor = new Cor();
    Sexo sexo = new Sexo();

    estudante1.nome = "Joao";
    estudante1.idade = 10;
    estudante1.cor = cor.NEGRA;
    estudante1.sexo = sexo.masculino;

    Estudante estudante2 = new Estudante();

    estudante2.nome = "Julia";
    estudante2.idade = 11;
    estudante2.cor = cor.BRANCA;
    estudante2.sexo = sexo.feminino;

    System.out.println(estudante1.idade);
}
}
