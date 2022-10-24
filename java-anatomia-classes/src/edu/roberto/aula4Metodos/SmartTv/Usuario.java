package edu.roberto.aula4Metodos.SmartTv;

import java.util.Scanner;

public class Usuario {
    public static void main(String[] args) {

        try (Scanner scanner = new Scanner(System.in)) {
            SmartTv smartTv = new SmartTv();
      
            System.out.println("Deseja ligar a Tv? Digite sim ou não. ");
            smartTv.simNao = scanner.next();
            smartTv.toTurnItOn();
            System.out.println("Tv ligada? " + smartTv.onOff);
            System.out.println("Canal atual: " + smartTv.channel);
            System.out.println("Volume atual: " + smartTv.volume);
                    
            System.out.println("Deseja aumentar ou diminuir o volume? Digite aumentar ou diminuir. ");
            smartTv.changeVolume = scanner.next();
            smartTv.toChangeVolume();

            System.out.println("Deseja mudar de canal? Digite aumentar ou diminuir para mudar de canal. ");
            smartTv.changeChannel = scanner.next();
            smartTv.toUpDownChannel();

            System.out.println("Deseja mudar de canal mais rápido? Digite o número do canal: ");
            smartTv.newChannel = scanner.nextInt();
            smartTv.toChangeChannel();
        }
        
    }
}
