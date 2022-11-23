public class Carro {
    //Associação - estrutural, atributos da classe usadas por metodos ou objetos da classe que podem ser agregação(usa a outra, relacionamento mais fraco) 
    //e composição(ligada à existência da outra) focada em reuso
    String cor;
    String modelo;
    int litrosTanque;

    //Um pra cada maneira de chamar no exercicio abaixo
    Carro(){}
    Carro(String cor, String modelo, int litrosTanque){
        this.cor = cor;
        this.modelo = modelo;
        this.litrosTanque = litrosTanque;
    }
    void setCor(String cor){
        this.cor = cor;
    }
    String getCor(){
        return cor;
    }
    void setModelo(String modelo){
        this.modelo = modelo;
    }
    String getModelo(){
        return modelo;
    }
    void setLitrosTanque(int litrosTanque){
        this.litrosTanque = litrosTanque;
    }
    int getLitrosTanque(){
        return litrosTanque;
    }

    public double calcularValor(double valorGasolina) {
        return litrosTanque * valorGasolina;
    }
    public static void main(String[] args) {
        Carro carro = new Carro();
            carro.setCor("Azul");
            carro.setModelo("Fusca");
            carro.setLitrosTanque(30);
        
            System.out.println("O carro selecionado foi um " + carro.getModelo() + " " + carro.getCor() + " com " + carro.getLitrosTanque() + " litros de capacidade de gasolina.");
            System.out.println("De acordo com o preço da gasolina, para encher o tanque desse carro será necessário, aproximadamente R$" + carro.calcularValor(4.56));

        Carro carro2 = new Carro("Vermelho", "Ferrari" , 69);
            System.out.println("O carro selecionado foi uma " + carro2.getModelo() + " " + carro2.getCor() + " com " + carro2.getLitrosTanque() + " litros de capacidade de gasolina.");
            System.out.println("De acordo com o preço da gasolina, para encher o tanque desse carro será necessário, aproximadamente R$" + carro2.calcularValor(4.56));
    }
}
