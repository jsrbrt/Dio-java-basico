package edu.roberto.aula4Metodos.SmartTv;

public class SmartTv {

boolean onOff = false;
int channel = 1;
int volume = 25;
int newChannel;
String simNao;
String changeVolume;
String changeChannel;

        public void toTurnItOn(){
            if(simNao.equalsIgnoreCase("sim")){
                onOff = true;
            }else{
                System.out.println("Tv desligada");
            }
        }

        public void toTurnItOff(){
            onOff = false;
        }

        public void toChangeVolume(){
            if(onOff == true){
                if(changeVolume.equalsIgnoreCase("aumentar")){
                    volume++;
                    System.out.println("Volume atual: " + volume);
                }else if(changeVolume.equalsIgnoreCase("diminuir")){
                    volume--;
                    System.out.println("Volume atual: " + volume);    
                }else
                {
                    System.out.println("Comando desconhecido");

                }
                }
            else
            {
                System.out.println("Tv desligada");
            }
        }
        public void toChangeChannel() {
            if(onOff == true){
                channel = newChannel;
                System.out.println("Canal atual: " + channel);
            }
            else
            {
                System.out.println("Tv desligada");
            }
        }
        public void toUpDownChannel() {
            if(onOff == true){
                if(changeChannel.equalsIgnoreCase("aumentar")){
                channel++;
                System.out.println("Canal atual: " + channel);
                }   
                else if(changeChannel.equalsIgnoreCase("diminuir")){
                channel--;
                System.out.println("Canal atual: " + channel);    
            }   else
            {
                System.out.println("Comando desconhecido");

            }}
            else
            {
                System.out.println("Tv desligada");
            }
        }
        
}