package Exercicios;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class ExercicioSet1 {
    /*
Crie uma conjunto contendo as cores do arco-íris e:
a) Exiba todas as cores o arco-íris uma abaixo da outra;
b) A quantidade de cores que o arco-íris tem;
c) Exiba as cores em ordem alfabética;
d) Exiba as cores na ordem inversa da que foi informada;
e) Exiba todas as cores que começam com a letra ”v”;
f) Remova todas as cores que não começam com a letra “v”;
g) Limpe o conjunto;
h) Confira se o conjunto está vazio;
 */
    public static void main(String[] args) {
        System.out.println("Exiba todas as cores o arco-íris uma abaixo da outra e a quantidade de cores que o arco-íris tem:");

            Set<String> arcoIris = new HashSet<>(Arrays.asList("Vermelho", "Laranja", "Amarelo", "Verde", "Azul", "Índigo", "Violeta"));
        
            Iterator<String> iterator = arcoIris.iterator();
                while(iterator.hasNext()) System.out.println(iterator.next());

                //for (String cor : arcoIris) System.out.println(cor);

            System.out.println("O arco-íris tem " + arcoIris.size() + " cores.");
System.out.println();

        System.out.println("Exiba as cores em ordem alfabética:");

            Set<String> arcoIris2 = new TreeSet<>(arcoIris);
            System.out.println(arcoIris2);
System.out.println();

        System.out.println("Exiba as cores na ordem inversa da que foi informada: ");

            Set<String> arcoIris3 = new LinkedHashSet<>(Arrays.asList("Vermelho", "Laranja", "Amarelo", "Verde", "Azul", "Índigo", "Violeta"));
                List<String> reverso = new ArrayList<String>(arcoIris3);
                Collections.reverse(reverso);
            System.out.println(reverso);
System.out.println();

        System.out.println("Exiba todas as cores que começam com a letra 'v':");

        for (String cor : arcoIris)
            if(cor.startsWith("V")) System.out.print(cor + " ");

System.out.println();
System.out.println();

        System.out.println("Remova todas as cores que não começam com a letra 'v':");

        /*não sei pq mas esse não funciona
        for (String cor : arcoIris)
            if(!(cor.startsWith("V"))) arcoIris.remove(cor);*/

        Iterator<String> iterator2 = arcoIris.iterator();
        while(iterator2.hasNext()) 
            if(!iterator2.next().startsWith("V")) iterator2.remove();

        System.out.println(arcoIris);

System.out.println();

        System.out.println("Limpe o conjunto e confira se o conjunto está vazio:");

            arcoIris.clear();
            System.out.println(arcoIris);
            System.out.println("O conjunto está vazio? " + arcoIris.isEmpty());
    }
}