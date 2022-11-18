package one.digitalinnovation.gof.strategy;

public class Robo {
    private Comportamento comportamento;

    public void setComportamento(Comportamento comportamento) {
        this.comportamento = comportamento;
    }

    public Comportamento getComportamento() {
        return comportamento;
    }

    public void mover() {
        comportamento.mover();
    }

    @Override
    public String toString() {
        return "Robô\n" +
                "Comportamento = " + comportamento;
    }
}
