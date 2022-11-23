public class SistemaDeNotas {
    public static void main (String [] args){
        double mediaFinal = .5;
        if (mediaFinal < 6)
            System.out.println("REPROVADO" + mediaFinal);
        else if (mediaFinal == 6)
            System.out.println("RECUPERAÇÃO");
        else 
            System.out.println("APROVADO");
    }
    
}
