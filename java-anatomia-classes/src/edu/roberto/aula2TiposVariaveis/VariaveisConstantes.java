package edu.roberto.aula2TiposVariaveis;

public class VariaveisConstantes {

    public static void main(String[] args) {
        
        //long cpf = 987123456787885469l;
    
        final int NUMERO = 0;
        //int numero = 0;
        //numero = 5;
        //numero = 0;
        //numero = 2;
        int soma = 785412365;
        int resultado =  NUMERO + soma;
        System.out.println(resultado);
        if (NUMERO==0){
            System.out.println(resultado);
        }
        else
            System.out.println("maior que zero");
        //Dead code pq quando a variaveel é final ou o else ou o if nunca serão usado pq a variável é imutável

    }
}
