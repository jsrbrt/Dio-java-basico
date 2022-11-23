import java.util.Scanner;

public class Calculadora {
    double primeiroNumero;
    double segundoNumero;
    String operacao;
    double resultado;
    String artigo;
    Scanner scanner = new Scanner(System.in);

    public void DecidirOperacao () {

      switch(operacao){
      case "+":
        Somar();
        break;
      case "-":
        Subtrair();
        break;
      case "*":
        Multiplicar();
        break;
      case "/":
        Dividir();
        break;
      case "%":
        Porcentagem();
        break;
      case "elevado":
        Elevar();
        break;
      default:
        System.out.println("Operação desconhecida");
        break;
      }
    }
    public double Somar () {
      System.out.println("O resultado é : "+ resultado);
      return resultado = primeiroNumero + segundoNumero;
      }
      public double Subtrair () {
        System.out.println("O resultado é : "+ resultado);
        return resultado = primeiroNumero - segundoNumero;
      }
      public double Multiplicar () {
        System.out.println("O resultado é : "+ resultado);
        return resultado = primeiroNumero * segundoNumero;
      }
      public double Dividir () {
        System.out.println("O resultado é : "+ resultado);
        return resultado = primeiroNumero / segundoNumero;
      }
      public double Porcentagem (){
        System.out.println("O resultado é : "+ resultado);
        return resultado = (primeiroNumero * segundoNumero) / 100;
      }
      public double Elevar (){
        System.out.println("O resultado é : "+ resultado);
        return resultado = Math.pow(primeiroNumero, segundoNumero);
      }
      /*public double ResolverRaiz (){
        return resultado = Math.sqrt(primeiroNumero);
      }*/

}
