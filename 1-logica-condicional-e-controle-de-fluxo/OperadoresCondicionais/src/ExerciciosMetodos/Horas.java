package ExerciciosMetodos;

import java.util.Scanner;

public class Horas {

    public static void main(String[] args) {
        try (//Horas horas = new Horas();
        Scanner scanner = new Scanner(System.in)) {
            while(true){
            System.out.println("Digite o horário:");
            decidirMensagem(scanner.nextInt());
            }
        }
    }
    public static void decidirMensagem(double hora) {
        if(hora >= 4 && hora < 12)
            bomDia();

        else if (hora >= 12 && hora < 17)
            boaTarde();

        else if(hora >= 17 && hora < 24 || hora >= 0 && hora <= 3)
            boaNoite();

        else
            System.out.println("Horário inválido");
    }
    public static void bomDia() {
        System.out.println("Bom dia");
    }
    public static void boaTarde() {
        System.out.println("Boa tarde");  
    }
    public static void boaNoite() {
        System.out.println("Boa noite");  
    }
}
