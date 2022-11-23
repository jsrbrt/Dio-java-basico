package one.digitalinnovation.gof.singleton;

public class EagerSingleton {
    private static EagerSingleton instancia = new EagerSingleton();

    private EagerSingleton() {
        super();
    }
    public static EagerSingleton getInstancia(){
        return instancia;
    }
}
