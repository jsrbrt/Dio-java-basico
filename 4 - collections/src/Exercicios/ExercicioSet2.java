package Exercicios;

import java.util.Comparator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class ExercicioSet2 {
    /*
Crie uma classe LinguagemFavorita que possua os atributos nome, anoDeCriacao e IDE.
Em seguida, crie um conjunto com 3 linguagens e faça um programa que ordene esse conjunto por:
a) Ordem de inserção;
b) Ordem natural(nome);
c) IDE;
d) Ano de criação e nome;
e) Nome, ano de criação e IDE;
Ao final, exiba as linguagens no console, um abaixo da outra.
*/
    public static void main(String[] args) {
        System.out.println("Crie um conjunto com 3 linguagens e faça um programa que ordene esse conjunto por:");
        System.out.println("a) Ordem de inserção:");

            Set<LinguagemFavorita> linguagens = new LinkedHashSet<>();
                linguagens.add(new LinguagemFavorita("Java", 1991, "Intellij"));
                linguagens.add(new LinguagemFavorita("C#", 2000, "VS code"));
                linguagens.add(new LinguagemFavorita("Python", 1991, "Pycharm"));
        System.out.println(linguagens);
System.out.println();

        System.out.println("b) Ordem natural(nome):");
            Set<LinguagemFavorita> linguagens2 = new TreeSet<>(new ComparatorNome());
                linguagens2.addAll(linguagens);
        System.out.println(linguagens2);
System.out.println();

        System.out.println("c) Ordem natural (IDE):");
            Set<LinguagemFavorita> linguagens3 = new TreeSet<>(new ComparatorIDE());
                linguagens3.addAll(linguagens);
        System.out.println(linguagens3);    
System.out.println();

        System.out.println("d) Ordem natural (ano de criação e nome):");
            Set<LinguagemFavorita> linguagens4 = new TreeSet<>(new ComparatorAnoDeCriacaoNome());
                linguagens4.addAll(linguagens);
        System.out.println(linguagens4);
System.out.println();

        System.out.println("d) Ordem natural (nome, ano de criação e IDE):");
            Set<LinguagemFavorita> linguagens5 = new TreeSet<>(new ComparatorNomeAnoDeCriacaoIDE());
                linguagens5.addAll(linguagens);
        System.out.println(linguagens5);
System.out.println();

        System.out.println("Exiba as linguagens no console, um abaixo da outra:");
        for (LinguagemFavorita linguagem : linguagens5) System.out.println(linguagem);
    }
}
class LinguagemFavorita {
    private String nome;
    private Integer anoDeCriacao;
    private String IDE;

    public LinguagemFavorita(String nome, Integer anoDeCriacao, String IDE) {
        this.nome = nome;
        this.anoDeCriacao = anoDeCriacao;
        this.IDE = IDE;
    }

    public String getNome(){
        return nome;
    }
    public Integer getAnoDeCriacao() {
        return anoDeCriacao;
    }
    public String getIDE() {
        return IDE;
    }
    @Override
    public String toString(){
        return "nome = '" + nome + "' ano de criação = '" + anoDeCriacao + "' IDE = '" + IDE + "'";
    }
}
class ComparatorNome implements Comparator<LinguagemFavorita>{
    public int compare(LinguagemFavorita l1, LinguagemFavorita l2){
        return l1.getNome().compareToIgnoreCase(l2.getNome());
    }
}
class ComparatorIDE implements Comparator<LinguagemFavorita>{
    public int compare(LinguagemFavorita l1, LinguagemFavorita l2) {
        return l1.getIDE().compareToIgnoreCase(l2.getIDE());
    }
}
class ComparatorAnoDeCriacaoNome implements Comparator<LinguagemFavorita>{
    public int compare(LinguagemFavorita l1, LinguagemFavorita l2){
        int anoDeCriacao = l1.getAnoDeCriacao().compareTo(l2.getAnoDeCriacao());
        if(anoDeCriacao != 0) return anoDeCriacao;

        return l1.getNome().compareToIgnoreCase(l2.getNome());
    }
}
class ComparatorNomeAnoDeCriacaoIDE implements Comparator<LinguagemFavorita>{
    public int compare(LinguagemFavorita l1, LinguagemFavorita l2){
        int nome = l1.getNome().compareToIgnoreCase(l2.getNome());
        if(nome != 0) return nome;

        int anoDeCriacao = l1.getAnoDeCriacao().compareTo(l2.getAnoDeCriacao());
        if(anoDeCriacao != 0) return anoDeCriacao;

        return l1.getIDE().compareToIgnoreCase(l2.getIDE());
    }
}
