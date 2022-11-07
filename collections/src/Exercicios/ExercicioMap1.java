package Exercicios;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

/*Dada a populacao estimada de alguns estados do NE brasileiro, faga:
Estado = PE - Populagdo = 9616621
Estado = AL - Populacdo = 3351543
Estado = CE - Populacao = 9187103
Estado = RN - Populacao = 3534265
- Crie um dicionario e relacione os estados e suas populacdes;
- substitua a população do estado do RN por 3.534.165;
- confira se PB esta no dicionario, caso não adicione: PB - 4039277
EXIBA A POPULAÇÃO PE
Exiba todos os estados e suas populagdes na ordem que foi
informado;

Exiba os estados e suas populacdes em ordem alfabética;

Exiba o estado com o menor populag¢ao e sua quantidade;

Exiba o estado com a maior populacao e sua quantidade;

Exiba a soma da populagao desses estados;

Exiba a média da populagao deste dicionario de estados;
remova os estados com a população menor que 4000000
apague o dicionario
verifique se está vazio
 */
public class ExercicioMap1 {
    public static void main(String[] args) {
        Map<String, Integer> estados = new HashMap<>(){{
            put("PE", 9616621);
            put("AL", 3351543);
            put("CE", 9187103);
            put("RN", 3534265);
        }};
        System.out.println(estados);
        estados.put("RN", 3534165);
        System.out.println(estados);

        if(!(estados.containsKey("PB"))) estados.put("PB", 4039277);
        System.out.println(estados);
        System.out.println(estados.get("PE"));

        Map<String, Integer> estados2 = new LinkedHashMap<>(){{
            put("PE", 9616621);
            put("AL", 3351543);
            put("CE", 9187103);
            put("RN", 3534165);
            put("PB", 4039277);
        }};
        System.out.println(estados2);

        Map<String, Integer> estados3 = new TreeMap<>(estados2);
        System.out.println(estados3);

        Integer menorPopulacao = Collections.min(estados2.values());
        Set<Map.Entry<String, Integer>> entries = estados2.entrySet();
        String menorEstado = "";

        for (Map.Entry<String,Integer> entry : entries) {
            if(entry.getValue().equals(menorPopulacao)) {
                menorEstado = entry.getKey();
                System.out.println("O estado com a menor população é " + menorEstado + " com a população de " + menorPopulacao + " habitantes."); 
            }
        }
        
        Integer maiorPopulacao = Collections.max(estados2.values());
        String maiorEstado = "";
        for (Map.Entry<String,Integer> entry2 : entries) {
            if(entry2.getValue().equals(maiorPopulacao)){
                maiorEstado = entry2.getKey();
                System.out.println("O estado com a maior população é " + maiorEstado + " com a população de " + maiorPopulacao + " habitantes.");
            }
        }
        Collection<Integer> populacoes = estados2.values();
        Iterator<Integer> iterator = populacoes.iterator();
        int soma = 0;
        while(iterator.hasNext()) soma += iterator.next();
        
        System.out.println("A soma das populações é de: " + soma);
        System.out.println("A média das populações é de: " + soma/populacoes.size());

        Iterator<Integer> iterator2 = populacoes.iterator();
        while(iterator2.hasNext()) 
            if(iterator2.next()<4000000) 
            iterator2.remove();

        System.out.println(estados2);

        estados2.clear();
        System.out.println("O dicionario está vazio? " + estados2.isEmpty());

    }
}
