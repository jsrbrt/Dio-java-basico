

public class CalcularDivida {
    public double CalcularDividaExponecial() {
        double parcela = 50.0;
        double montante = 0.0;
        for(int x=1; x<=5; x++){
            double valorCalculado = parcela * x;
            montante = montante + valorCalculado;
        }
        return montante;
    }
}
