package PolimorfismoSobrescrever;

public class Rodar {
    public static void main(String[] args) {
        ClasseMae[] classes = new ClasseMae[]{new ClasseFilha1(), new ClasseFilha2(), new ClasseMae()};

        for (ClasseMae classe : classes) {
            classe.metodo1();
        }
        /* o for acima está fazendo isso com cada elemento do array
        ClasseMae classe = new ClasseFilha1();
            classe.metodo1();
        */
        System.out.println(" ");

        for (ClasseMae classe : classes) {
            classe.metodo2();
        }
        System.out.println(" ");

        //sobrescrevendo diretamente (se chamar o metodo2, que não existe nessa classe, ele retorna o metodo2 da classe mae)
        ClasseFilha2 classeFilha2 = new ClasseFilha2();
        classeFilha2.metodo1();
    }
}
