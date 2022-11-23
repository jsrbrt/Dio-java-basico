import java.util.Random;
import java.util.Scanner;

public class ExercicioArrays {
    Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
        ExercicioArrays exercicioArrays = new ExercicioArrays();

        //exercicioArrays.ordemInversa();
        //exercicioArrays.consoantes();
        //exercicioArrays.numerosAleatorios();
        exercicioArrays.arrayMultidimensional();
    }
    public void ordemInversa() {
    /*
    Crie um vetor de 6 números inteiros
    e mostre-os na ordem inversa.
    */
        int[] arrayN = {5,-26,24,528,1,7};

        System.out.print("Vetor normal: ");
        int counter = 0;
        while(counter < arrayN.length){
            System.out.print(arrayN[counter] + " ");
            counter++;
        }
        /*int i = (arrayN.length-1);
        while(i >= 0) {
            System.out.print(arrayN[i] + " ");
            i--;
        }*/
        /*for(int i = 0; i < arrayN.length; i++)
            System.out.print(arrayN[i] + " ");*/

            System.out.print("\nVetor inverso: ");
        for(int i = (arrayN.length-1); i >= 0; i--)
            System.out.print(arrayN[i] + " ");
    }
    public void consoantes() {
    /*
    Faça um Programa que leia um vetor de 6 caracteres,
    e diga quantas consoantes foram lidas.
    Imprima as consoantes.
    */
        String letra;
        int numeroConsoante = 0;
        //String[] consoante = {};
        String[] arrayC = new String[5];

        for(int i = 0;i < arrayC.length;i++){
        System.out.println("Escreva 1 letra");
        letra = scan.next();
            if(!(letra.equals("a") ||
                 letra.equals("e") || 
                 letra.equals("i") || 
                 letra.equals("o") || 
                 letra.equals("u") ))
            {
                arrayC[i] = letra;
                numeroConsoante++;
            }
        }
        System.out.println("O número de consoantes é: " + numeroConsoante);
        System.out.println("As consoantes são:");
        //foreach: cada valor dentro do array é atribuido à nova string que é depois printada e essa ação é repetida até o final do array
        for (String consoante : arrayC) {
            if (consoante != null)
            System.out.print(consoante + " ");
        }
    }
    public void numerosAleatorios() {
    /*
    Faça um Programa que leia 20 números inteiros aleatórios (entre 0 e 100) armazene-os num vetor.
    Ao final mostre os números e seus sucessores.
    */
    
    Random random = new Random();
    int[] arrayA = new int[20];
    int i = 0;
        while(i < arrayA.length){
            /*System.out.println("Digite números aleatórios entre 0 e 100 para o array:");
            int numero = scan.nextInt();            
                if(!(numero < 0 || numero > 100)){
                arrayA[i] = numero;
                i++;
            }else{
                System.out.println("Número inválido");
            }*/
            int numero = random.nextInt(100);
            arrayA[i] = numero;
            i++;
        }
        System.out.println("Os números e seus sucesssores são:");
        for (int j : arrayA) {
            System.out.println("Número: " + j + " Sucessor: " + (j + 1));
        }   
    }
    public void arrayMultidimensional() {
    /*
    Gere e imprima uma matriz M 4x4 com valores aleatórios entre 0-9.
    */
    Random random = new Random();

    int[][] matriz = new int[4][4];
        for(int i = 0; i < matriz.length; i++){
            for(int j = 0; j < matriz[i].length; j++)
            matriz[i][j] = random.nextInt(9);
        }
        //o foreach transforma as linhas da matriz nesse array e o segundo foreach pega cada elemento do array e transforma no int que é imprimido
        for (int[] linha : matriz) {
            for (int coluna : linha) {
                System.out.print(coluna + " ");
            }
            System.out.println();
        }
    }
}
