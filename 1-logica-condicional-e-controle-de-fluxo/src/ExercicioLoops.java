import java.util.Scanner;

public class ExercicioLoops {
    Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        ExercicioLoops exercicioLoops = new ExercicioLoops();

        //exercicioLoops.nota();
        //exercicioLoops.nomeIdade();
        //exercicioLoops.maiorMedia();
        //exercicioLoops.ParImpar();
        //exercicioLoops.tabuada();
        exercicioLoops.fatorial();
        
    }
    public void nomeIdade() {

        //variáveis
        String nome; //armazena o nome
        int idade; //armazena a idade

        while(true) { //Enquando o loop for verdadeiro
            System.out.println("Nome: "); //Peça o nome
            nome = scan.next(); //armazene esse nome na variável

            if (nome.equals("0")) { //caso o nome igual a "0"
                break; //interrompa o programa
            }

            System.out.println("Idade: "); //Peça a idade
            idade = scan.nextInt(); //armazene a idade na variável

            //imprima o nome e a idade
            System.out.println("Nome: " + nome + " - idade: " + idade);
        }
    }
    public void nota() {
        /*
        Faça um programa que peça uma nota, entre zero e dez.
        Mostre uma mensagem caso o valor seja inválido
        e continue pedindo
        até que o usuário informe um valor válido.
        */
        double nota;

        System.out.println("Insira uma nota entre 0 e 10:");
        nota = scan.nextDouble();

        while(nota>10 || nota <0){
            System.out.println("Valor inválido");
            System.out.println("Insira uma nota entre 0 e 10:");
                nota = scan.nextDouble();
        }
    }
    public void maiorMedia() {
        /*
        Faça um programa que leia 5 números
        e informe o maior número
        e a média desses números.
        */
        int numero;
        int maiorNumero = 0;
        int counter = 0;
        double media = 0;

        while(counter < 5){
            System.out.println("Digite um número:");
            numero = scan.nextInt();
            counter++;
            media += numero;
            if(numero>maiorNumero) maiorNumero = numero;
        }

        /*do {
            System.out.println("Digite um número:");
            numero = scan.nextInt();
            counter++;
            media += numero;
            if(numero>maiorNumero) maiorNumero = numero;
            
        } while (counter < 5);*/
    
        System.out.println("O maior número é: " + maiorNumero);
        System.out.println("A média dos números é: " + (media / counter));
    }
    public void ParImpar() {
        /*
        Faça um programa que peça N números inteiros,
        calcule e mostre a quantidade de números pares
        e a quantidade de números impares.
        */
        //double teste = 7;

        int quantidade;
        int numero;
        //int counter = 0;
        //int par = 0;
        //int impar = 0;
        
        int counter = 0, par = 0, impar = 0;

        System.out.println("Digite a quantidade de números inteiros desejada:");
        quantidade = scan.nextInt();

        while (counter < quantidade){
            System.out.println("Digite um número:");
            numero = scan.nextInt();
            counter++;
            if (numero % 2 == 0)
                par++;
            else 
                impar++;
        }

        /*do {
            System.out.println("Digite um número:");
            numero = scan.nextInt();
            counter++;
            if (numero % 2 == 0)
                par++;
            else 
                impar++;
        } while (counter < quantidade);*/

        System.out.println("A quantidade de números pares é: " + par);
        System.out.println("A quantidade de números impares é: " + impar);
        //System.out.println(teste / 2);
    }
    public void tabuada() {
        /*
        Desenvolva um gerador de tabuada,
        capaz de gerar a tabuada de qualquer número inteiro entre 1 a 10.
        O usuário deve informar de qual numero ele deseja ver a tabuada.
        A saída deve ser conforme o exemplo abaixo:
        Tabuada de 5:
        5 X 1 = 5
        5 X 2 = 10
        ...
        5 X 10 = 50
        */

        int numero;

        System.out.println("Digite o número desejado pra sua tabuada:");
            numero = scan.nextInt();
        System.out.println("Tabuada de " + numero + ":");

        /*int counter = 1;
        while (counter < 11){
            System.out.println(numero + " X " + counter + " = " + numero * counter);
            counter++;
        }*/

        for(int i = 1; i < 11; i++){
            System.out.println(numero + " X " + i + " = " + numero * i);
        }
    }
    public void fatorial() {
        /*
        Faça um programa que calcule o fatorial de um número inteiro fornecido pelo usuário.
        Ex.: 5!= 120 (5 X 4 X 3 X 2 X 1)
        */

        int numero;
        int multiplicacao = 1;

        System.out.println("Digite o número desejado pra calcular o fatorial:");
            numero = scan.nextInt();
            int counter = numero;

        while(counter >= 1){
            multiplicacao = multiplicacao * counter;
            counter--;
        }
        /*for(int i = numero; i >= 1 ; i--){
            count = count * i;
        }*/
        System.out.println(numero + "! = " + multiplicacao);

    }
}
