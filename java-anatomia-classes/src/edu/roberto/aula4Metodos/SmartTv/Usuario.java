package edu.roberto.aula4Metodos.SmartTv;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Usuario {
    public static void main(String[] args)throws IOException {

        InputStreamReader reader = new InputStreamReader(System.in);
        BufferedReader read = new BufferedReader(reader);
        try (Scanner in = new Scanner(System.in)) {
            SmartTv smartTv = new SmartTv();
      
            System.out.println("Deseja ligar a Tv? Digite sim ou não. ");
            smartTv.simNao = read.readLine();
            smartTv.toTurnItOn();
            System.out.println("Tv ligada? " + smartTv.onOff);
            System.out.println("Canal atual: " + smartTv.channel);
            System.out.println("Volume atual: " + smartTv.volume);
                    
            System.out.println("Deseja aumentar ou diminuir o volume? Digite aumentar ou diminuir. ");
            smartTv.changeVolume = read.readLine();
            smartTv.toChangeVolume();

            System.out.println("Deseja mudar de canal? Digite aumentar ou diminuir para mudar de canal. ");
            smartTv.changeChannel = read.readLine();
            smartTv.toUpDownChannel();

            System.out.println("Deseja mudar de canal mais rápido? Digite o número do canal: ");
            smartTv.newChannel = in.nextInt();
            smartTv.toChangeChannel();
        }
        
    }
}
