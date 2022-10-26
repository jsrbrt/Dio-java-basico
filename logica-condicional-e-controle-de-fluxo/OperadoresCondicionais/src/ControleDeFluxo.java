import java.util.Scanner;


public class ControleDeFluxo {
    public static void main(String[] args) {
        ControleDeFluxo controleDeFluxo = new ControleDeFluxo();

        controleDeFluxo.verCertoErrado();
        controleDeFluxo.verMes();
        controleDeFluxo.verDiaDaSemana();
    }
    public void verCertoErrado() {
        try (Scanner scanner = new Scanner(System.in)) {
            int certoErrado;
            System.out.println("Digite um número");
            certoErrado = scanner.nextInt();
            switch (certoErrado) {
                case 1:
                case 2:
                case 3:
                System.out.println("certo");
                break;
                case 4:
                System.out.println("errado");
                break;
                case 5:
                System.out.println("talvez");
                break;
                default:
                System.out.println("valor indefinido");
                break;
            }
        }
    }
    public void verDiaDaSemana() {
        String diaDaSemana;
    try (Scanner scanner = new Scanner(System.in)) {
        System.out.println("Digite o dia da semana desejado");
        diaDaSemana = scanner.next();

        switch(diaDaSemana){
            case "domingo":
                System.out.println(1);
                break;
            case "segunda":
                System.out.println(2);
                break;
            case "terça":
                System.out.println(3);
                break;
            case "quarta":
                System.out.println(4);
                break;
            case "quinta":
                System.out.println(5);
                break;
            case "sexta":
                System.out.println(6);
                break;
            case "sabado":
                System.out.println(7);
                break;
            default:
                System.out.println("Dia da semana desconhecido");
                break;
        }
    }
}
    public void verMes() {
    String mes;
    int numeroMes;

    try (Scanner scanner = new Scanner(System.in)) {
        System.out.println("Selecione um número para obter o mês correspondente:");
        numeroMes = scanner.nextInt();
    }
        if (numeroMes == 1){
        mes = "Janeiro";
        System.out.println(mes);
    }else if (numeroMes == 2){
        mes = "Fevereiro";
        System.out.println(mes);
    }else if (numeroMes == 3){
        mes = "Março";
        System.out.println(mes);
    }else if (numeroMes == 4){
        mes = "Abril";
        System.out.println(mes);
    }else if (numeroMes == 5){
        mes = "Maio";
        System.out.println(mes);
    }else if (numeroMes == 6){
        mes = "Junho";
        System.out.println(mes);
    }else if (numeroMes == 7){
        mes = "Julho";
        System.out.println(mes);
    }else if (numeroMes == 8){
        mes = "Agosto";
        System.out.println(mes);
    }else if (numeroMes == 9){
        mes = "Setembro";
        System.out.println(mes);
    }else if (numeroMes == 10){
        mes = "Outubro";
        System.out.println(mes);
    }else if (numeroMes == 11){
        mes = "Novembro";
        System.out.println(mes);
    }else if (numeroMes == 12){
        mes = "Dezembro";
        System.out.println(mes);
    }else{
        System.out.println("Número que não é de um mês");
    }
    /*if((numeroMes == 1) || (numeroMes == 7) || (numeroMes == 12)){
        System.out.println("Férias");
    }*/

    switch (numeroMes) {
        case 1:
        case 7:
        case 12:
            System.out.println("Férias");
            break;
    }
}
}


