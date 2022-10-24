package edu.roberto.aula6JavaDoc;

import java.util.Scanner;

public class Aluno {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            Calculadora calculadora = new Calculadora();

            System.out.println("CALCULADORA");
            System.out.println("Insira o cálculo: ");
                calculadora.primeiroNumero = scanner.nextDouble();
            //System.out.println("Insira a operação desejada: ");
                calculadora.operacao = scanner.next();
            //System.out.println("Insira o segundo número:");
                calculadora.segundoNumero = scanner.nextDouble();
            calculadora.DecidirOperacao();
            System.out.println("O resultado é : "+ calculadora.resultado);
        }
        }

    }

