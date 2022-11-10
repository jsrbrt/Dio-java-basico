
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Consumer;
import java.util.function.DoubleConsumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.ToIntFunction;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class AulaStream {
    public static void main(String[] args) {
        List<String> numerosAleatorios = Arrays.asList("1","0","4","1","2","3","9","9","6","5");
        System.out.println("Imprima todos os elementos dessa lista:");
        numerosAleatorios.stream().forEach(new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s);
            }
        });
        //numerosAleatorios.stream().forEach(s -> System.out.println(s));
        //numerosAleatorios.forEach(s -> System.out.println(s));
        numerosAleatorios.forEach(System.out::println);

        System.out.println("\n Pegue os 5 primeiros numeros da lista e coloque dentro de um set:");
        numerosAleatorios.stream()
                         .limit(5)
                         .collect(Collectors.toSet())
                         .forEach(System.out::println);

        Set<String> cincoPrimeiros = 
        numerosAleatorios.stream()
        //usa um long para limitar a quantidade de objets que pega da lista
                         .limit(5)
        //coleta os numeros limitados e passa pra um set
                         .collect(Collectors.toSet());
        //printa o set (apenas 4 numeros pq um set não permite objetos repetidos, removendo o segundo "1")
        cincoPrimeiros.forEach(System.out::println);
                
        System.out.println("\nTransforme essa lista de string em uma lista de numeros inteiros:");
        numerosAleatorios.stream()
                         .map(new Function<String,Integer>() {
                            @Override
                            public Integer apply(String s) {
                                return Integer.parseInt(s);
                            }
                         });
       
        /*List<Integer> numerosAleatoriosInteger =
        numerosAleatorios.stream()
                         .map(Integer::parseInt)
                         .collect(Collectors.toList());*/

        List<Integer> numerosAleatoriosInteger =
        numerosAleatorios.stream()
                        .map(Integer::parseInt)
                        .collect(Collectors.toList());
        numerosAleatoriosInteger.forEach(System.out::println);

        Stream<Integer> numerosAleatoriosStreamInteger =
        //numerosAleatorios.stream().map(s-> Integer.parseInt(s));
        numerosAleatorios.stream().map(Integer::parseInt);

        System.out.println("Pegue os números pares e maiores que 2 e coloque em uma list:");
        List<Integer> numerosAleatoriosInteger2 =

        /*numerosAleatoriosStreamInteger.filter(new Predicate<Integer>() {
            @Override
            public boolean test(Integer i) {
                if(i % 2 == 0 && i > 2) return true;
                return false;
            }
        }).collect(Collectors.toList());*/

        numerosAleatoriosStreamInteger
        .filter(i -> (i % 2 == 0) && (i > 2))
        .collect(Collectors.toList());
        System.out.println(numerosAleatoriosInteger2);

        System.out.println("\nMostre a média dos números:");

        /*numerosAleatorios.stream()
                         .mapToInt(new ToIntFunction<String>() {
                            @Override
                            public int applyAsInt(String s){
                                return Integer.parseInt(s);
                            }
                         });
        numerosAleatorios.stream()
                         .mapToInt(s -> Integer.parseInt(s));*/
//integer como o tipo e int é usado para fazer as operaçoes como o average
        numerosAleatorios.stream()
                         .mapToInt(Integer::parseInt)
                         .average()
                         .ifPresent(System.out::println);
                        
                        // .ifPresent(v -> System.out.println(v));
                         /*.ifPresent(new DoubleConsumer() {
                            @Override
                            public void accept(double v){
                                System.out.println(v);
                            }
                         });*/

        System.out.println("\nRemova os valores impares:");

        /*numerosAleatoriosInteger.removeIf(new Predicate<Integer>() {
            @Override
            public boolean test(Integer i) {
                if(i % 2 == 0) return false;
                return true;
            }
        });*/
        
        List<Integer> semImpares = numerosAleatorios.stream().map(Integer::parseInt)
        .collect(Collectors.toList());
        semImpares.removeIf(i -> !(i % 2 == 0));
        System.out.println(semImpares);
        
        System.out.println("\nIgnore os 3 primeiros elementos da lista e imprima o restante:");
        numerosAleatorios.stream().skip(3)
                                  .collect(Collectors.toList())
                                  .forEach(System.out::println);

        System.out.println("\nRetirando os números repetidos da lista, quantos números ficam? ");
        long semRepetidos = numerosAleatoriosInteger.stream().distinct().count();

        System.out.println(semRepetidos);

        System.out.print("\nMostre o menor valor da lista: ");
//pega a lista, retorna uma stream com elaa de base, transforma numa intstream usando o intvalue que transforma o integer num int pra poder ser usado pelo min/max/average
        numerosAleatoriosInteger.stream()
                                .mapToInt(Integer::intValue)
                                .min()
                                .ifPresent(System.out::print);

        /*   numerosAleatorios.stream()
                            .mapToInt(Integer::parseInt)
                            .min()
                            .ifPresent(System.out::print);*/
        
        /*Integer menorValor = Collections.min(numerosAleatoriosInteger);
        System.out.println(menorValor);*/

        System.out.print("\nMostre o maior valor da lista: ");
        numerosAleatorios.stream()
                         .mapToInt(Integer::parseInt)
                         .max()
                         .ifPresent(System.out::println);


        System.out.println("\nPegue apenas os números pares e some: ");
        int somaPares = numerosAleatoriosInteger.stream()
                                           .filter(i -> i % 2 == 0)
                                           .mapToInt(Integer::intValue)
                                           .sum();
        System.out.println(somaPares);
        /*Usando esse metodo especifico e o "%f" podemos arredondar um valor int como um double
        System.out.printf("A soma dos pares é %f",somaPares+0.5);*/
        System.out.println("\nMostre a lista na ordem númerica: ");
        /*Set<Integer> ordemNumerica = 
        numerosAleatoriosInteger.stream()
                                .collect(Collectors.toSet());
        System.out.println(ordemNumerica);*/
        List<Integer> ordemNatural =
        numerosAleatoriosInteger.stream()
                                .sorted(Comparator.naturalOrder())
                                .collect(Collectors.toList());
        System.out.println(ordemNatural);

        System.out.println("\nAgrupe os valores ímpares (em) múltiplos de 3 ou de 5:");

        /*List<Integer> multiplos3 =
        numerosAleatoriosInteger.stream()
                                .filter(i -> (i%3==0))
                                .collect(Collectors.toList());
        List<Integer> multiplos5 =
        numerosAleatoriosInteger.stream()
                                .filter(i -> (i%5==0))
                                .collect(Collectors.toList());*/

        Map<Object, List<Integer>> multiplos3ou5 = 
        /*new HashMap<>(){{
            put(3, multiplos3);
            put(5, multiplos5);
        }};*/
        numerosAleatoriosInteger.stream()
                                .collect(Collectors.groupingBy(i -> i%3==0 || i%5==0));
        Map<Object, List<Integer>> multiplos =          
        numerosAleatoriosInteger.stream()
                                .collect(Collectors.groupingBy
                                //(i -> i %3 == 0 ? "3" : i %5 == 0 ? "5" : "nenhum"));
                                (i ->{                               
                                    if(i %5 == 0) return "5";
                                    if(i %3 == 0) return "3";
                                    return "nenhum";
                                }));

        System.out.println(multiplos);

    }
}
