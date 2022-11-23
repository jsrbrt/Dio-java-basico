package BancoTerminal;


import java.util.Scanner;

public class BancoTerminal {
    
    //double valorSolicitado = 18;
    double saldo = 25.50;
    double novoSaldo;
    double valorSolicitado;
    long senha;
    String querVerSaldo;
    String querSacarDinheiro;
    Scanner scanner = new Scanner(System.in);

public void conferirSenha() {
    System.out.println("Por favor, insira sua senha:");
        senha = scanner.nextLong();
    if(senha == 123){
        System.out.println("Senha correta, Seja bem vindo Cliente.");
        conferirSaldo();
    }
    else{
        System.out.println("Senha incorreta");
        conferirSenha();
    }
}
public void conferirSaldo() {
    System.out.println("Deseja ver seu saldo? Digite sim ou nao");
        querVerSaldo = scanner.next();
        if(querVerSaldo.equalsIgnoreCase("sim")){
            System.out.println("Seu saldo atual é de: R$ " + saldo);
            sacarDinheiro();
        }else if (querVerSaldo.equalsIgnoreCase("nao")){
            System.out.println("Adeus, boa noite e muito obrigado por usar nossos serviços.");
        }else{
            System.out.println("Comando inválido.");
            conferirSaldo();
        }
}
public void sacarDinheiro() {
    System.out.println("Deseja sacar dinheiro? Digite sim ou nao");
        querSacarDinheiro = scanner.next();
        if(querSacarDinheiro.equals("sim")){
            System.out.print("Digite o valor desejado: ");
                valorSolicitado = scanner.nextDouble();
                if(valorSolicitado > saldo){
                    System.out.println("Seu saldo atual é insuficiente (R$ " + saldo + ")");
                    sacarDinheiro();
                }else{
                novoSaldo = saldo - valorSolicitado;
                System.out.println("Retirando dinheiro... ");
                System.out.println("Seu saldo atual é de: R$ " + novoSaldo);
                
            }
        }else if (querSacarDinheiro.equalsIgnoreCase("nao")){
            System.out.println("Adeus, boa noite e muito obrigado por usar nossos serviços.");
        }else{
            System.out.println("Comando inválido.");
            sacarDinheiro();
        }
}


}
