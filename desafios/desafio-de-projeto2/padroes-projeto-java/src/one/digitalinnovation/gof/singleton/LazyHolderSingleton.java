package one.digitalinnovation.gof.singleton;

public class LazyHolderSingleton {
    private static class InstanceHolder{
        private static LazyHolderSingleton instancia = new LazyHolderSingleton();
    }

    private LazyHolderSingleton() {
        super();
    }
    public static LazyHolderSingleton getInstancia(){
        return InstanceHolder.instancia;
    }
}
