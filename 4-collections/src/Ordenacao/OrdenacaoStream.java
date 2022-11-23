package Ordenacao;

import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;
//import java.util.function.Function;

/*Dadas as seguintes informações  de id e contato, crie um dicionário e
ordene este dicionário exibindo (Nome id - Nome contato);
id = 1 - Ordenacao.Contato = nome: Simba, numero: 2222;
id = 4 - Ordenacao.Contato = nome: Cami, numero: 5555;
id = 3 - Ordenacao.Contato = nome: Jon, numero: 1111;
*/
public class OrdenacaoStream {
    public static void main(String[] args) {
        System.out.println("Exiba os contatos na ordem aleatória:");
        Map<Integer, Contato> contatos = new HashMap<>(){{
            put(1, new Contato("Simba", 2222));
            put(4, new Contato("Cami", 5555));
            put(3, new Contato("Jon", 1111));
        }};
            for (Map.Entry<Integer, Contato> contato : contatos.entrySet()) {
                System.out.println(contato.getKey() + " - " + contato.getValue().getNome());
            }

        System.out.println("\nExiba os contatos na ordem de inserção:");
        Map<Integer, Contato> contatos2 = new LinkedHashMap<>(){{
            put(1, new Contato("Simba", 2222));
            put(4, new Contato("Cami", 5555));
            put(3, new Contato("Jon", 1111));
        }};
            for (Map.Entry<Integer, Contato> contato : contatos2.entrySet()) {
                System.out.println(contato.getKey() + " - " + contato.getValue().getNome());
            }

        System.out.println("\nExiba os contatos na ordem natural(ID):");
        Map<Integer, Contato> contatos3 = new TreeMap<>(contatos2);
            for (Map.Entry<Integer, Contato> contato : contatos3.entrySet()) {
                System.out.println(contato.getKey() + " - " + contato.getValue().getNome());
            }

        System.out.println("\nExiba os contatos na ordem pelo nome da pessoa:");
        //classe anonima
        /*Set<Map.Entry<Integer, Ordenacao.Contato>> contatosOrdemNome = new TreeSet<>(new Comparator<Map.Entry<Integer,Ordenacao.Contato>>() {
            @Override
            public int compare(Map.Entry<Integer,Ordenacao.Contato> c1, Map.Entry<Integer,Ordenacao.Contato> c2) {
            return c1.getValue().getNome().compareToIgnoreCase(c2.getValue().getNome());
            }
        });*/

        //usando o comparing
        /*Set<Map.Entry<Integer, Ordenacao.Contato>> contatosOrdemNome = new TreeSet<>(
            Comparator.comparing(new Function<Map.Entry<Integer, Ordenacao.Contato>, String>(){
                @Override
                public String apply(Map.Entry<Integer,Ordenacao.Contato> c1) {
                return c1.getValue().getNome();
                }
            }
        ));*/

        //usando o lambda
        Set<Map.Entry<Integer, Contato>> contatosOrdemNome = new TreeSet<>(
            Comparator.comparing(c1 -> c1.getValue().getNome() ));

        contatosOrdemNome.addAll(contatos.entrySet());
        for (Map.Entry<Integer, Contato> cadaNome : contatosOrdemNome) {
            System.out.println(cadaNome.getKey() + " - " + cadaNome.getValue().getNome());
        }

    //Set<Map.Entry<Integer, Ordenacao.Contato>> contatosOrdemNome = new TreeSet<>(Comparator.comparing((Ordenacao.Contato contato) -> (contato.getNome())));

        System.out.println("\nExiba os contatos na ordem pelo número:");
        Set<Map.Entry<Integer, Contato>> contatosOrdemNumero = new TreeSet<>(
            Comparator.comparing(c1 -> c1.getValue().getNumero() ));

        contatosOrdemNumero.addAll(contatos.entrySet());
        for (Map.Entry<Integer, Contato> cadaNumero : contatosOrdemNumero) {
            System.out.println(cadaNumero.getKey() + " - " + cadaNumero.getValue().getNome() + "-" + cadaNumero.getValue().getNumero());
        }

    }
}
class Contato{
    private String nome;
    private Integer numero;

    public Contato(String nome, Integer numero){
        this.nome = nome;
        this.numero = numero;
    }

    public String getNome() {
        return nome;
    }
    public Integer getNumero() {
        return numero;
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Contato contato = (Contato) o;
        return nome.equals(contato.nome) && numero.equals(contato.numero);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, numero);
    }
    public String toString(){
        return "nome - '" + nome + "', número - '" + numero + "'.";
    }
}

