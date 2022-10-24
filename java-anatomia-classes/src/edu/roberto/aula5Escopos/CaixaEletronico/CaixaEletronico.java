
package edu.roberto.aula5Escopos.CaixaEletronico;



import java.util.Scanner;
public class CaixaEletronico {
    double saldo = 535.75;
    double novoSaldo;
    int querSacar;
    
    int querSaldo;
    Scanner scanner = new Scanner(System.in);


    public void sacar(double valor) {
        if(querSacar == 1){
            System.out.print("Digite o valor desejado: ");
            valor = scanner.nextDouble();
            novoSaldo = saldo - valor;
            querSaldo = 2;
            mostrarSaldo();
        }else
        {
            System.out.println("Muito obrigado por usar nosso caixa eletrônico.");
        }
    }
    public void mostrarSaldo(){
        if(querSaldo == 1){
            System.out.println("Seu saldo atual é: " + saldo);
            if(querSacar == 1){
                System.out.println("Seu saldo atual é: " + novoSaldo);

            }
        }else if(querSaldo==0)
        {
            System.out.println("Muito obrigado por usar nosso caixa eletrônico.");
        }else{
            System.out.println("Seu saldo atual é: " + novoSaldo);
        }
    }
}
