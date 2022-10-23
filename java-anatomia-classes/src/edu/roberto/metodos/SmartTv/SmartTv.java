package edu.roberto.metodos.SmartTv;

public class SmartTv {

boolean onOff = false;
int channel = 1;
int volume = 25;


        public void toTurnItOn(){
            onOff = true;
        }

        public void toTurnItOff(){
            onOff= false;
        }

        public void toRaiseVolume(){
            volume++;
            System.out.println("Volume atual: " + volume);
        }

        public void toDecreaseVolume(){ 
            volume--;
            System.out.println("Volume atual: " + volume);
        }
        public void toChangeChannel(int newChannel) {
            channel = newChannel;
            System.out.println("Canal atual: " + newChannel);
        }
        public void toUpChannel() {
            channel++;
        }
        public void toDownChannel() {
            channel--;
        }
}