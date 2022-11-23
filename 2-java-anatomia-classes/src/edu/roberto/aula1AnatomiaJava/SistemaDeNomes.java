public class SistemaDeNomes {
    public static void main(String[] args) {
        String primeiroNome = "José";
        String segundoNome = "Roberto";
        String nomeCompleto = nomeCompleto(primeiroNome, segundoNome);
        System.out.println(nomeCompleto);
        System.out.print("Pulou a linha.");
    }
    public static String nomeCompleto (String primeiroNome, String segundoNome){
        return "Seu nome completo é: " + primeiroNome + (" ") + segundoNome;
    }
}