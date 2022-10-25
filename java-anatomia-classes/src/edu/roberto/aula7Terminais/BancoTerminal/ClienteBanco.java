

public class ClienteBanco {
    public static void main(String[] args) {
        BancoTerminal bancoTerminal = new BancoTerminal();
        //Scanner scanner = new Scanner(System.in);

        System.out.println("Bem vindo ao Banco.");
        System.out.println("Por favor insira seu cartão.");
        System.out.println("Aguardando...");
        System.out.println("Cartão inserido");
        bancoTerminal.conferirSenha();

    }
}
