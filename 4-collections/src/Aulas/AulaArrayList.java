package Aulas;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class AulaArrayList {
    public static void main(String[] args) throws Exception {
        //Dada uma lista com 7 notas de um aluno (7, 8.5, 9.3, 5, 7, 0, 3.6), faça:

        System.out.println("Faça uma lista de notas de um aluno: ");
        List <Double> notas = new ArrayList<>(Arrays.asList(7d, 8.5, 9.3, 5d, 7d, 0d, 3.6));
        List <Double> notasOutraManeira = new ArrayList<>();
        notasOutraManeira.add(7.0);
        notasOutraManeira.add(8.5);
        notasOutraManeira.add(9.3);
        notasOutraManeira.add(5.0);        
        notasOutraManeira.add(7.0);
        notasOutraManeira.add(0.0);
        notasOutraManeira.add(3.6);
        System.out.println(notas);
        System.out.println(notasOutraManeira.toString()); 
System.out.println();

        System.out.println("Exiba a posição da nota 9.3:");
        System.out.println("A posição da nota 9.3 é : " + notas.indexOf(9.3));
System.out.println();

        System.out.println("Adicione na lista a nota 8.0 na posição 4:");
        notas.add(4, 8.0);
        System.out.println(notas);
System.out.println();

        System.out.println("Substitua a nota 5.0 pela nota 6.0:");
        notas.set(3, 6d);
        System.out.println(notas);
System.out.println();

        System.out.println("Confira se a nota 5.0 está na lista:");
        System.out.println("A nota 5.0 está na lista? " + notas.contains(5d));
System.out.println();

        System.out.println("Exiba todas as notas na ordem em que foram informadas:");
        for (Double nota : notas) System.out.println(nota);
System.out.println();

        System.out.println("Exiba a terceira nota adicionada:");
        System.out.println("A terceira nota adicionada foi: " + notas.get(2));
System.out.println();

        System.out.println("Exiba a menor nota:");
        System.out.println("A menor nota é: " + Collections.min(notas));
System.out.println();

        System.out.println("Exiba a maior nota:");
        System.out.println("A maior nota é: " + Collections.max(notas));
System.out.println();

        System.out.println("Exiba a soma dos valores:");
        double soma = 0;
        /*for (Double nota : notas)  soma += nota;
        System.out.println("A soma dos valores é: " + soma);*/

        Iterator<Double> iterator =  notas.iterator();
        while (iterator.hasNext()) {
            Double next = iterator.next();
            soma += next;
        }
        System.out.println("A soma dos valores é: " + soma);
System.out.println();

        System.out.println("Exiba a média das notas:");
        System.out.println("A média das notas é: " + soma / notas.size());
System.out.println();

        System.out.println("Remova a nota 0:");
        notas.remove(0d);
        System.out.println(notas);
System.out.println();

        System.out.println("Remova a nota da posição 0:");
        notas.remove(0);
        System.out.println(notas);
System.out.println();

        System.out.println("Remova as notas menores que 7:");
        Iterator<Double> iterator2 = notas.iterator();
        while(iterator2.hasNext()){
            Double next = iterator2.next();
            if(next < 7) iterator2.remove();
        }
        System.out.println(notas);
System.out.println();

        System.out.println("Apague toda a lista e confira se a lista está vazia:");
        //notas.removeAll(notas);
        notas.clear();
        System.out.println(notas);
        System.out.println("A lista está vazia? " + notas.isEmpty());
    }
}
