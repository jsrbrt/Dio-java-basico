
import java.util.Scanner;

public class OperadoresLogicos {
    public static void main(String[] args) {

        OperadoresLogicos operadoresLogicos = new OperadoresLogicos();

        boolean b1 = true;
        boolean b2 = false;
            System.out.println(!b1);
            System.out.println(!b2);

        //Opção que tem os valores fixos (mais simples)
        operadoresLogicos.recebeAuxilio();

        //Opção que o usuario pode escolher o salario e dependentes
        operadoresLogicos.recebeAuxilio2();

        //Opção de verificar cota simples
        operadoresLogicos.verificarCota();

        //Opção de verificar cota com mais complexo
        operadoresLogicos.verificarCota2();

    }
    public void recebeAuxilio() {
        try (Scanner scanner = new Scanner(System.in)) {

            //Opção que tem os valores fixos (mais simples)

            //boolean recebeAuxilio = (salarioMensal < mediaSalario) && (quantidadeDependentes >= mediaDependentes);
            double salarioMensal = 1000;
            int quantidadeDependentes = 2;
            double mediaSalario = 1200;
            int mediaDependentes = 2;
            boolean salarioBaixo = (salarioMensal < mediaSalario);
            boolean muitosDependentes = (quantidadeDependentes >= mediaDependentes);
            boolean recebeAuxilio = (salarioBaixo) && (muitosDependentes);
            
            if (recebeAuxilio) {
                System.out.println("Você recebe o auxilio.");
            }else{
                System.out.println("Você não recebe o auxilio.");
            }
        }
    }
    public void recebeAuxilio2() {
        try (Scanner scanner = new Scanner(System.in)) {

        double salarioMensal;
        double mediaSalario = 1200;
        int quantidadeDependentes;
        int mediaDependentes = 2;
            
        System.out.println("Insira seu salário:");
            salarioMensal = scanner.nextDouble();
        System.out.println("Insira a quantidade de dependentes em sua casa:");
        quantidadeDependentes = scanner.nextInt();
            boolean salarioBaixo = (salarioMensal < mediaSalario);
            boolean muitosDependentes = (quantidadeDependentes >= mediaDependentes);
            boolean recebeAuxilio = (salarioBaixo) && (muitosDependentes);

        if (recebeAuxilio) {
            System.out.println("Você recebe o auxilio.");
        }else{
            System.out.println("Você não recebe o auxilio.");
        }
        }
    }
    public void verificarCota() {
            boolean deficiente = false;
            boolean negro = false;
            boolean recebeCota = (deficiente) || (negro);

            System.out.println("Você tem cota? " + (recebeCota));
    }
    public void verificarCota2() {
        try (Scanner scanner = new Scanner(System.in)) {
            boolean baixaRenda;
            boolean deficiente;
            boolean negro;

            System.out.println("Você é deficiente? ");
                deficiente = scanner.nextBoolean(); 
            System.out.println("Você é negro? ");
                negro = scanner.nextBoolean(); 
                boolean recebeCota = (deficiente) || (negro);
                System.out.println("Você tem cota? " + (recebeCota));   

            if(recebeCota == false){
                System.out.println("Você é baixa renda? ");
                baixaRenda = scanner.nextBoolean(); 
                boolean recebeCotaSegundaFase = recebeCota ^ baixaRenda;
                System.out.println("Você tem cota pela segunda fase? " + (recebeCotaSegundaFase));
            }
        }
    }
}
        
    

