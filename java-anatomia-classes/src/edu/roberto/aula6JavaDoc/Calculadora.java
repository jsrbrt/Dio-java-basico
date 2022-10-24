package edu.roberto.aula6JavaDoc;

public class Calculadora {
    double primeiroNumero;
    double segundoNumero;
    String operacao;
    double resultado;

    public void DecidirOperacao () {
        if(operacao.equals("+")){
            Somar();
        }else if(operacao.equals("-")){
            Subtrair();
        }else if(operacao.equals("*")){
            Multiplicar();
        }else if(operacao.equals("/")){
            Dividir();
        }else if(operacao.equals("%")){
          Porcentagem();
        }else if(operacao.equals("elevado")){
          Elevar();
        }/*else if(operacao.equalsIgnoreCase("raiz")){
          ResolverRaiz();
        }*/
        else{
            System.out.println("Operação desconhecida");
        }
      }
    public double Somar () {
        return resultado = primeiroNumero + segundoNumero;
      }
      public double Subtrair () {
        return resultado = primeiroNumero - segundoNumero;
      }
      public double Multiplicar () {
        return resultado = primeiroNumero * segundoNumero;
      }
      public double Dividir () {
        return resultado = primeiroNumero / segundoNumero;
      }
      public double Porcentagem (){
        return resultado = (primeiroNumero * segundoNumero) / 100;
      }
      public double Elevar (){
        return resultado = Math.pow(primeiroNumero, segundoNumero);
      }
      /*public double ResolverRaiz (){
        return resultado = Math.sqrt(primeiroNumero);
      }*/

}
