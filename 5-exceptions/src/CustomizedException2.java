import javax.swing.*;

public class CustomizedException2 {
    public static void main(String[] args) {
        int[] numerador = {4, 5, 8, 10};
        int[] denominador = {2, 4, 0, 2, 8};
                for (int i = 0; i < denominador.length; i++) {
                    try {
                        if(i == numerador.length) throw new ArrayIndexOutOfBoundsException();

                        if (numerador[i] %2 != 0) throw new DivisaoNaoExataException("Divisão não exata.",numerador[i],denominador[i]);

                        if (denominador[i] == 0) throw new ArithmeticException();
                        int resultado = numerador[i] / denominador[i];
                        System.out.println(numerador[i] + "/" + denominador[i] + " = " + resultado);
                    }catch (DivisaoNaoExataException e){
                        //e.printStackTrace();
                        JOptionPane.showMessageDialog(null, e.getMessage());
                    } catch (ArithmeticException e) {
                        //e.printStackTrace();
                        JOptionPane.showMessageDialog(null, "Impossivel dividir por 0.");
                    }catch (ArrayIndexOutOfBoundsException e){
                        //e.printStackTrace();
                        JOptionPane.showMessageDialog(null, "Tentou dividir por um número nulo.");
                    }
                }
            System.out.println("Continua...");
    }
}
class DivisaoNaoExataException extends Exception{
    private int numerador;
    private int denominador;

    public DivisaoNaoExataException(String message, int numerador, int denominador) {
        super(message);
        this.numerador = numerador;
        this.denominador = denominador;
    }
}
