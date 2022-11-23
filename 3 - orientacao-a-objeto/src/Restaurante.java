import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;


public class Restaurante {
    private Long id;
    private String nomeFantasia;
    private String cnpj;
    private List<Produtos> cardapio = new ArrayList<>();
    private Endereco endereco;

    public void setId(Long id) {
        this.id = id;
    }
    public void setNomeFantasia(String nomeFantasia){
        this.nomeFantasia = nomeFantasia;
    }
    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }
    public void setEndereco(Endereco endereco){
        this.endereco = endereco;
    }
    @Override
    public String toString(){
        return "id- '" + id + "', nome- '" + nomeFantasia + "', cnpj- '" + cnpj + "', endereco- " + endereco + "'.\n";
    }
    
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            Restaurante restaurante = new Restaurante();
            
            System.out.println("CADASTRO PARA RESTAURANTE");

            System.out.print("\nInsira o nome desejado do seu restaurante: ");
            restaurante.setNomeFantasia(scanner.next());
            System.out.print("Insira seu CNPJ: ");
            restaurante.setCnpj(scanner.next());
            System.out.println("Agora você vai preencher seu cardápio, quantos itens seu cardápio terá? ");
            int quantidade = scanner.nextInt();
            
            for (int i = 0; i < quantidade; i++) {
                System.out.println("Preencha o id, nome, se está disponível, e o valor unitário, respectivamente:");
                restaurante.cardapio.add(new Produtos(scanner.nextLong(), scanner.next(), scanner.nextBoolean(), scanner.nextBigDecimal()));
            }
            System.out.println("Seu cardápio é: "+ restaurante.cardapio);

            System.out.println("Agora escreva o endereço do seu restaurante (CEP e um complemento adicional):");
            Endereco enderecoR1 = new Endereco(scanner.next(), scanner.next());
            restaurante.setEndereco(enderecoR1);
            Random random = new Random();
            restaurante.setId(random.nextLong());

            System.out.println("Seu restaurante está cadastrado como: " + restaurante);
        }
    }
}
class Endereco{
    private String cep;
    private String complemento;

    public Endereco(String cep, String complemento){
        this.cep = cep;
        this.complemento = complemento;
    }
    public Endereco(){
    }
    @Override
    public String toString(){
        return "cep- '" + cep + "', complemento- '" + complemento + "'.";
    }
}
class Produtos{
    private Long id;
    private String nome;
    private Boolean disponivel;
    private BigDecimal valorUnitario;
    //private Restaurante restaurante;

    public Produtos(Long id, String nome, Boolean disponivel, BigDecimal valorUnitario){
        this.id = id;
        this.nome = nome;
        this.disponivel = disponivel;
        this.valorUnitario = valorUnitario;
        //this.restaurante = restaurante;
    }
    @Override
    public String toString(){
        return "\nnome- '" + nome + "' id- '" +  id + "', disponível- '" + disponivel + "', valor unitário- " + valorUnitario+ "'.\n";
    }
}
