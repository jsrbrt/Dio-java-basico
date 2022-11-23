package PolimorfismoSobrescrever;

public class ClasseFilha1 extends ClasseMae {

    
    public void metodo1() {
        System.out.println("Metodo 1 da classe filha 1");
    }
    @Override
    public void metodo2() {
        System.out.println("Metodo 2 da classe filha 1");
    }
}
