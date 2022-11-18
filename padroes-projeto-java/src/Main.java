import one.digitalinnovation.gof.facade.Facade;
import one.digitalinnovation.gof.singleton.EagerSingleton;
import one.digitalinnovation.gof.singleton.LazyHolderSingleton;
import one.digitalinnovation.gof.singleton.LazySingleton;
import one.digitalinnovation.gof.strategy.*;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Singleton
        /*LazySingleton lazy = LazySingleton.getInstancia();
        System.out.println(lazy);
        lazy = LazySingleton.getInstancia();
        System.out.println(lazy);

        EagerSingleton eager = EagerSingleton.getInstancia();
        System.out.println(eager);
        eager = EagerSingleton.getInstancia();
        System.out.println(eager);

        LazyHolderSingleton lazyHolder = LazyHolderSingleton.getInstancia();
        System.out.println(lazyHolder);
        lazyHolder = LazyHolderSingleton.getInstancia();
        System.out.println(lazyHolder);*/

        //Strategy
        /*Comportamento normal = new ComportamentoNormal();
        Comportamento agressivo = new ComportamentoAgressivo();
        Comportamento defensivo = new ComportamentoDefensivo();

        Robo robo = new Robo();

        robo.setComportamento(normal);
        robo.mover();
        robo.mover();

        robo.setComportamento(defensivo);
        robo.mover();

        robo.setComportamento(agressivo);
        robo.mover();
        robo.mover();
        robo.mover();

        Scanner scanner = new Scanner(System.in);

        boolean continueLooping;
        do {
            continueLooping = false;
            String comportamento = scanner.next();
            switch (comportamento) {
                case "normal" -> robo.setComportamento(normal);
                case "agressivo" -> robo.setComportamento(agressivo);
                case "defensivo" -> robo.setComportamento(defensivo);
                default -> {
                    System.out.println("Comportamento inválido");
                    continueLooping = true;
                }
            }
        } while (continueLooping);
        robo.mover();*/

        //Facade
        Facade facade = new Facade();
        facade.migrarCliente("Júlio", "123456");
    }
}