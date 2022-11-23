interface OperacaoMatematica {
    void soma(double numero1, double numero2); 
    void subtracao(double numero1, double numero2); 
    void multiplicacao(double numero1, double numero2); 
    void divisao(double numero1, double numero2); 
}
public class Resolver implements OperacaoMatematica {
    @Override
    public void soma(double numero1, double numero2) {
        System.out.println(numero1 + numero2);
    }
    //@Override
    public void subtracao(double numero1, double numero2) {
        System.out.println(numero1 - numero2);
    }
    public void multiplicacao(double numero1, double numero2) {
        System.out.println(numero1 * numero2);
    }
    public void divisao(double numero1, double numero2) {
        System.out.println(numero1 / numero2);
    }
    public static void main(String[] args) {
        Resolver resolver = new Resolver();

        resolver.soma(5, 8);
        resolver.subtracao(8, 9);
    }
}
