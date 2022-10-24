package edu.roberto.aula6JavaDoc;

import java.util.Scanner;

public class Aluno {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Calculadora calculadora = new Calculadora();

        System.out.println("CALCULADORA");
        System.out.println("Insira o primeiro número: ");
            calculadora.primeiroNumero = sc.nextDouble();
        System.out.println("Insira a operação desejada: ");
            calculadora.operacao = sc.next();
        System.out.println("Insira o segundo número:");
            calculadora.segundoNumero = sc.nextDouble();
        calculadora.DecidirOperacao(0);
        System.out.println("O resultado é : "+ calculadora.resultado);

    }
}
