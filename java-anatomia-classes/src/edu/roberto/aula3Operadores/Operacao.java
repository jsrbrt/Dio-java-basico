package edu.roberto.aula3Operadores;

public class Operacao {
    public static void main(String[] args) {
        int primeiroNome = 25;
        int segundoNome = 35;
        int aulaUm = aulaUm(primeiroNome, segundoNome);
        System.out.println(aulaUm);
        
    }
    public static int aulaUm (int primeiroNumero, int segundoNumero){
        double soma = 25.8 + 148.3;
        int subtracao = 64 - 47;
        int multiplicacao = 15 * 3;
        int divisao = 50 / 5;
        int modulo = 18 % 3;
        double resultado = (5*3) + (50/15);
        System.out.println(modulo);
        System.out.println(resultado);
        System.out.println(soma + subtracao + multiplicacao + divisao);
        return primeiroNumero + segundoNumero;
    }
    public static void aulaDois (){
        String concatenacao = "?";
        concatenacao = 1 + 1 + 1 + "1";
            System.out.println(concatenacao);
        concatenacao = 1 + 1 + "1" + 1;
            System.out.println(concatenacao);
        concatenacao = 1 + "1" + 1 + 1;
            System.out.println(concatenacao);
        concatenacao = "1" + 1 + 1 + 1;
            System.out.println(concatenacao);
        concatenacao = "1" + (1 + 1 + 1);
            System.out.println(concatenacao);

    }
    public static void aulaTres() {
        int numero = 6;
        numero = - numero;
            System.out.println(numero);
        numero = numero * -1;
            System.out.println(numero);
    }
    public static void aulaQuatro() {
        int numero = 5;
        numero++;
        System.out.println(++numero);
        System.out.println(numero++);
        System.out.println(numero);
        numero--;
        
        boolean variavel = true;
        //variavel = !variavel;
        System.out.print(!variavel);
        }
}
