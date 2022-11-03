import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
//import java.util.Arrays;

public class OrdenacaoArray {
    //jon 18 preto
    //simba 6 tigrado
    //jon 12 laranja
    
    public static void main(String[] args) {
        /*Gato gato1 = new Gato("Jon", 18, "preto");
        Gato gato2 = new Gato("Simba", 6, "tigrado");
        Gato gato3 = new Gato("Jon", 12, "laranja");
        List<Gato> meusGatinhos = new ArrayList<>(Arrays.asList(gato1, gato2, gato3));
        System.out.println(meusGatinhos);


        List<Gato> meusGato = new ArrayList<>();
        meusGato.add(new Gato("Jon", 18, "preto"));
        meusGato.add(new Gato("Simba", 6, "tigrado"));
        meusGato.add(new Gato("Jon", 12, "laranja"));
        System.out.println(meusGato);*/

        System.out.println("Crie uma lista com seus gatos:");
        List<Gato> meusGatos = new ArrayList<>() {{
            add(new Gato("Jon", 18, "preto"));
            add(new Gato("Simba", 6, "tigrado"));
            add(new Gato("Jon", 12, "laranja"));
        }}; 
        System.out.println("Meus gatos são: \n" + meusGatos);
System.out.println();

        System.out.println("Embaralhe a lista aleatóriamente:");
            Collections.shuffle(meusGatos);
            System.out.println(meusGatos);
System.out.println();

        System.out.println("Ponha a lista na ordem natural (nome):");
            Collections.sort(meusGatos);
            System.out.println(meusGatos);
System.out.println();

        System.out.println("Ponha a lista na ordem natural (idade):");
            Collections.sort(meusGatos, new ComparatorIdade());
            System.out.println(meusGatos);
System.out.println();

        System.out.println("Ponha a lista na ordem natural (cor):");
            meusGatos.sort(new ComparatorCor());
            System.out.println(meusGatos);
System.out.println();

        System.out.println("Agora ponha a lista na ordem natural (Nome/cor/idade)");
            meusGatos.sort(new ComparatorNomeCorIdade());
            Collections.sort(meusGatos, new ComparatorNomeCorIdade());
        System.out.println(meusGatos);
    }
}
//puxou (implementou) da interface comparable, entao ele é obrigado a chamar o metodo compareTo
class Gato implements Comparable<Gato>{ 
    private String nome;
    private Integer idade;
    private String cor;


    public Gato(String nome, Integer idade, String cor){
        this.nome = nome;
        this.idade = idade;
        this.cor = cor;
    }
    public String getNome(){
        return nome;
    }
    public Integer getIdade(){
        return idade;
    }
    public String getCor(){
        return cor;
    }
    @Override
    public String toString(){
        return "{nome = '" + nome + "' " + "idade = '" + idade + "' " + "cor = '" + cor + "'}";
    }
    @Override
    public int compareTo(Gato gato) {
        return this.getNome().compareToIgnoreCase(gato.getNome());
    }
}
class ComparatorIdade implements Comparator<Gato>{
    @Override
    public int compare(Gato g1, Gato g2) {
       return Integer.compare(g1.getIdade(), g2.getIdade());
    }
}
class ComparatorCor implements Comparator<Gato>{
    @Override
    public int compare(Gato g1, Gato g2) {
       return g1.getCor().compareToIgnoreCase(g2.getCor());
    }
}
class ComparatorNomeCorIdade implements Comparator<Gato>{
    @Override
    public int compare(Gato g1, Gato g2){
        int nome = g1.getNome().compareToIgnoreCase(g2.getNome());
        if(nome != 0)
        return nome;

        int cor = g1.getCor().compareToIgnoreCase(g2.getCor());
        if(cor != 0)
        return cor;
        
        return Integer.compare(g1.getIdade(), g2.getIdade());
    }
}
