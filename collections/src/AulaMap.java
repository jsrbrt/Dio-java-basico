import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class AulaMap {
    /*
 Dada os modelos dos carros e seus respectivos consumos na estrada, faça:
 modelo = gol - consumo = 14,4km/l
 modelo = uno - consumo = 15,6 km/l
 modelo = mobi - consumo = 16,1 km/l
 modelo = hb20 - consumo = 14,5 km/l
 modelo = kwid - consumo = 15,6 km/l
 */
    public static void main(String[] args) {
        System.out.println("Crie um dicionário que relacione os modelos e seus respectivos consumos: ");
        Map<String, Double> carrosPopulares = new HashMap<>(){{
            put("gol", 14.4);
            put("uno", 15.6);
            put("mobi", 16.1);
            put("hb20", 14.5);
            put("kwid", 15.6);
        }};
        System.out.println(carrosPopulares.toString());
System.out.println();
        System.out.println("Substitua o consumo do gol por 15,2 km/l: ");
        carrosPopulares.put("gol", 15.2);
        System.out.println(carrosPopulares);
System.out.println();

        System.out.println("Confira se o modelo tucson está no dicionário: ");
        System.out.println("O modelo tucson está no dicionário? " + carrosPopulares.containsKey("tucson"));
System.out.println();

        System.out.println("Confira se o modelo uno está no dicionário: ");
        System.out.println("O modelo uno está no dicionário? " + carrosPopulares.containsKey("uno"));
System.out.println();
        
        System.out.println("Exiba o consumo do uno:");
        System.out.println(carrosPopulares.get("uno"));
System.out.println();

        /*System.out.println("Exiba o terceiro modelo adicionado:");
        impossivel de fazer, pois não tem ordem no hashmap*/

        System.out.println("Exiba os modelos:");
        Set<String> modelos = carrosPopulares.keySet();
        System.out.println(modelos);
        //System.out.println(carrosPopulares.keySet());
System.out.println();

        System.out.println("Exiba o consumo dos carros:");
        Collection<Double> consumos = carrosPopulares.values();
        System.out.println(consumos);
        //System.out.println(carrosPopulares.values());
System.out.println();

        /*o codigo pega o maior numero dentro do hashmap usando um metodo do collections, que puxa da collection retornada do metodo values,
          depois usando o entryset que retorna um set baseado no map escolhido, ele transforma cada elemento dentro do set em uma variavel
          do tipo entry usando um foreache depois verifica se o valor desse entry é igual ao melhor consumo que foi verificado la em cima(o maior numero), se for
          igual ele atribui a variavel melhor modelo a key desse entry que no momento da verificação é a variavel com o maior numero
          e depois tendo o maior numero e a key dele, ele printa.*/
        System.out.println("Exiba o modelo mais eficiente e seu consumo:");
        double melhorConsumo = Collections.max(carrosPopulares.values());
        Set<Map.Entry<String, Double>> entries = carrosPopulares.entrySet();
        String melhorModelo = "";

        for (Map.Entry<String,Double> entry : entries) {
           if(entry.getValue().equals(melhorConsumo)){ 
                melhorModelo = entry.getKey();         
                System.out.println("O " + melhorModelo + " é o modelo mais eficiente, com o consumo de " + melhorConsumo + "km/l.");
           }
        }
System.out.println();

        System.out.println("Exiba o modelo menos eficiente e seu consumo:");
        double piorConsumo = Collections.min(carrosPopulares.values());
        String piorModelo = "";

        for (Map.Entry<String,Double> entry : entries) {
            if(entry.getValue().equals(piorConsumo)){
                piorModelo = entry.getKey();
                System.out.println("O " + piorModelo + " é o modelo menos eficiente, com o consumo de " + piorConsumo + " km/l.");
            }
        }
System.out.println();

        System.out.println("Exiba a soma dos consumos:");
        //Collection<Double> consumos = carrosPopulares.values();
        double soma = 0;
        //for (double consumo : consumos) soma += consumo;

        Iterator<Double> iterator =  consumos.iterator();
        while (iterator.hasNext()) soma += iterator.next();
            
        System.out.println("A soma dos consumos é de: " + soma);
System.out.println();

        System.out.println("Exiba a média dos consumos deste dicionário de carros:");
        System.out.println("A média dos consumos é de: " + soma/carrosPopulares.size() + "km/l.");
System.out.println();

        System.out.println("Remova os modelos com o consumo igual a 15,6km/l:");
        Iterator<Double> iterator2 = consumos.iterator();
        while (iterator2.hasNext()) 
            if(iterator2.next().equals(15.6)) 
                iterator2.remove();
        
        System.out.println(carrosPopulares);
System.out.println();
        
        System.out.println("Exiba todos os carros na ordem que foram informados:");
        Map<String, Double> carrosPopulares2 = new LinkedHashMap<>(){{
            put("gol", 14.4);
            put("uno", 15.6);
            put("mobi", 16.1);
            put("hb20", 14.5);
            put("kwid", 15.6);
        }};
        System.out.println(carrosPopulares2);
System.out.println();

        System.out.println("Exiba o dicionario ordenado pelo modelo: ");
        Map<String, Double> carrosPopulares3 = new TreeMap<>(carrosPopulares2);
        System.out.println(carrosPopulares3);
System.out.println();

        System.out.println("Apague o dicionário de carros e verifique se o dicionário está vazio:");
        carrosPopulares.clear();
        System.out.println(carrosPopulares);
        System.out.println("O dicionário está vazio? " + carrosPopulares.isEmpty());
    }
}
