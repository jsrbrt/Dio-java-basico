package ExerciciosMetodos;


public class CalculaArea {
    /*
     Crie uma aplicação que calcule a area dos tres quadrilateros notaveis
     quadrado retangulo e trapezio
    */
    public static void main(String[] args) {

        System.out.println("A área do quadrado é: " + calcularArea(5));
        System.out.println("A área do retângulo é: " + calcularArea(9,5.2));
        System.out.println("A área do trapézio é: " + calcularArea(9.2, 4 , 11));

        }
    public static double calcularArea(double base) {
        return base * base;
    }
    public static double calcularArea(double base, double altura) {
        return base * altura;
    }
    public static double calcularArea(double base1, double base2, double altura) {
        return ((base1 + base2) * altura) / 2;
    }

}
