package edu.roberto.aula5Escopos.CaixaEletronico;
import java.util.Scanner;

public class Cliente {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            CaixaEletronico caixaEletronico = new CaixaEletronico();
            System.out.println("Você vai querer ver seu saldo? Se sim digite 1, caso não, digite 0. ");
            caixaEletronico.querSaldo = scanner.nextInt();
            caixaEletronico.mostrarSaldo();
            if(caixaEletronico.querSaldo == 1){
                
            } System.out.println("Você vai querer sacar dinheiro? Se sim digite 1, caso não, digite 0. ");
            caixaEletronico.querSacar = scanner.nextInt();
            caixaEletronico.sacar(0);
        }
        
    }
}
