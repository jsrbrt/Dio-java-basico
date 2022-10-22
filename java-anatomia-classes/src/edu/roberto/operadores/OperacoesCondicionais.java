package edu.roberto.operadores;

import javax.print.event.PrintEvent;

public class OperacoesCondicionais {
    public static void primeirasAulas() {
        int a = 4;
        int b = 6;
        //int b = 5;

        String resultado = a+b==10 ? "verdadeiro" : "falso";
        //System.out.println(resultado);

        String nomeUm = "Roberto";
        String nomeDois = new String("Roberto");
            System.out.println(nomeUm.equals(nomeDois));
        
        int numeroUm = 9;
        int numeroDois = 7;
            String condicaoVerdadeira = numeroUm != numeroDois ? "A condição é verdadeira" : "A condição é falsa";
                System.out.println(condicaoVerdadeira);

        /*if (numeroUm != numeroDois){
            System.out.println("A condição é verdadeira");
        }
        else
            System.out.println("A condição é falsa");*/

        boolean simNao = numeroUm == numeroDois;
            System.out.println("A variável numeroUm é igual a variável numeroDois? " + simNao);
                simNao = numeroUm != numeroDois;
            System.out.println("A variável numeroUm é diferente a variável numeroDois? " + simNao);
                simNao = numeroUm > numeroDois;
            System.out.println("A variável numeroUm é maior a variável numeroDois? " + simNao);
                simNao = numeroUm < numeroDois;
            System.out.println("A variável numeroUm é menor a variável numeroDois? " + simNao);

    }
    public static void main(String[] args) {
        boolean condicaoUm = true;
        boolean condicaoDois = false;
        condicaoDois = !condicaoDois;
        //condicaoUm = !condicaoUm;
            if(condicaoUm && condicaoDois && (7 > 5)){
                System.out.println("As três condições são verdadeiras.");
            }
            else if(condicaoUm || condicaoDois){
                System.out.println("Uma das condições é verdadeira.");
            }
            else
                System.out.println("As duas condições são falsas.");
        
    }
}
