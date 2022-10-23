package edu.roberto.metodos.SmartTv;

public class Usuario {
    public static void main(String[] args) {
        
        SmartTv smartTv = new SmartTv();
            System.out.println("Tv ligada? " + smartTv.onOff);
            System.out.println("Canal atual: " + smartTv.channel);
            System.out.println("Volume atual: " + smartTv.volume);

        smartTv.toTurnItOn();
            System.out.println("Tv ligada? " + smartTv.onOff);
        /*smartTv.toTurnItOff();
            System.out.println("Tv ligada? " + smartTv.onOff);*/

        if(smartTv.onOff == true){
            System.out.println("Canal atual: " + smartTv.channel);
                smartTv.toChangeChannel(13);
                smartTv.toDecreaseVolume();
                smartTv.toDecreaseVolume();
                smartTv.toDecreaseVolume();
                smartTv.toRaiseVolume();
                smartTv.toTurnItOff();  
        }
        else
        {
            System.out.println("Tv desligada");
        }
        
    }
}
