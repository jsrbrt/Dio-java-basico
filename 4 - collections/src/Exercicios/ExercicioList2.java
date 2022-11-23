package Exercicios;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class ExercicioList2 {
/*Utilizando listas, faça um programa que faça 5 perguntas para uma
pessoa sobre um crime. As perguntas são:

"Telefonou para a vítima?"

"Esteve no local do crime?"

"Mora perto da vítima?"

"Devia para a vítima?"

"Já trabalhou com a vítima?"


Se a pessoa responder positivamente a 2 questões ela deve ser
classificada como "Suspeita", entre 3 e 4 como "Cúmplice" e 5 como
"Assassina". Caso contrário, ela será classificado como "Inocente". */
Scanner scanner = new Scanner(System.in);
public static void main(String[] args) {
    ExercicioList2 exercicioList2 = new ExercicioList2();
    exercicioList2.verificarProcedencia();
}

public void verificarProcedencia() {
    List<String> respostas = new ArrayList<>();
    System.out.println("Telefonou para a vítima?");
        String resposta = scanner.nextLine();
        respostas.add(resposta.toLowerCase());
    System.out.println("Esteve no local do crime?");
        resposta = scanner.nextLine();
        respostas.add(resposta.toLowerCase());
    System.out.println("Mora perto da vítima?");
        resposta = scanner.nextLine();
        respostas.add(resposta.toLowerCase());
    System.out.println("Devia para a vítima?");
        resposta = scanner.nextLine();
        respostas.add(resposta.toLowerCase());    
    System.out.println("Já trabalhou com a vítima?");
        resposta = scanner.nextLine();
        respostas.add(resposta.toLowerCase());
   
    Iterator<String> iterator = respostas.iterator();
    int count = 0;
    while (iterator.hasNext()){
        String resp = iterator.next();
        if(resp.contains("sim"))
            count++;
    }
    
    switch (count) {
        case 2:
            System.out.println("A pessoa é suspeita.");
            break;
        case 3:
        case 4:
            System.out.println("A pessoa é cúmplice.");
            break;
        case 5:
            System.out.println("A pessoa é a assassina.");
            break;
        default:
        System.out.println("A pessoa é inocente.");
            break;
    }
    }
}