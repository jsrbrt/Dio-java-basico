import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class AulaSet {
    public static void main(String[] args) {
        System.out.println("Faça uma lista de notas de um aluno: ");
        Set<Double> notas = new HashSet<>(Arrays.asList(7d, 8.5, 9.3, 5d, 7d, 0d, 3.6));
        System.out.println(notas.toString());
System.out.println();

        //System.out.println("Exiba a posição da nota 9.3:");
            //HashSet não tem index e nem tem o metodo indexOf
        
        //System.out.println("Adicione na lista a nota 8.0 na posição 4:");
            //novamente não podemos resolver sem ter o index

        //System.out.println("Substitua a nota 5.0 pela nota 6.0:");
            //HashSet não tem o metodo set

        System.out.println("Confira se a nota 5.0 está na lista:");
            System.out.println("A lista contém a nota 5.0? " + notas.contains(5d)); 
System.out.println();

    System.out.println("Exiba a menor nota:");
            System.out.println("A menor nota é: " + Collections.min(notas));
System.out.println();

        System.out.println("Exiba a maior nota:");
            System.out.println("A maior nota é: " + Collections.max(notas));
System.out.println();

        System.out.println("Exiba a soma dos valores:");
            Iterator<Double> iterator = notas.iterator();
            double soma = 0;
            while(iterator.hasNext())
                soma += iterator.next();
            
            System.out.println("A soma dos valores é: " + soma);
System.out.println();

        System.out.println("Exiba a média das notas:");
            System.out.println("A média das notas é: " + soma/notas.size());
System.out.println();

        System.out.println("Remova a nota 0:");
            notas.remove(0d);
            System.out.println(notas);
System.out.println();

        System.out.println("Remova as notas menores que 7:");
            Iterator<Double> iterator2 = notas.iterator();
            while (iterator2.hasNext()) {
                double next = iterator2.next();
                if(next < 7)
                iterator2.remove();
            }
            System.out.println(notas);
System.out.println();
        
        System.out.println("Exiba as notas na ordem que foram informadas:");
        Set<Double> notas2 = new LinkedHashSet<>(Arrays.asList(7d, 8.5, 9.3, 5d, 7d, 0d, 3.6));
        System.out.println(notas2);

        System.out.println("Exiba as notas na ordem crescente:");
        //So funciona pq a é um double que tem um comparator e comparable
        Set<Double> notas3 = new TreeSet<>(notas2);
        System.out.println(notas3);

        System.out.println("Apague todo o conjunto e verifique se está vazio:");
        notas.clear();
        System.out.println("O conjunto 'notas' está vazio? " + notas.isEmpty());
        System.out.println("O conjunto 'notas2' está vazio? " + notas2.isEmpty());
        System.out.println("O conjunto 'notas3' está vazio? " + notas3.isEmpty());
    }
}
