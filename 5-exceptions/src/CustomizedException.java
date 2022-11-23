import javax.swing.*;
import java.io.*;

public class CustomizedException {
    public static void main(String[] args) {
            String nomeDoArquivo = JOptionPane.showInputDialog("Insira o nome do arquivo:");
            imprimirArquivoNoConsole(nomeDoArquivo);


        System.out.println("\nIndependente da exception ou não o código continua.");
    }

    public static void imprimirArquivoNoConsole(String nomeDoArquivo) {

        try {
            BufferedReader br = lerArquivo(nomeDoArquivo);
            String line = br.readLine();
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
            do {
                bw.write(line);
                bw.newLine();
                line = br.readLine();
            } while (line != null);
            bw.flush();
            br.close();
        } catch (ImpossivelAbrirArquivoException e) {
            //e.printStackTrace();
            JOptionPane.showMessageDialog(null, e.getMessage());
        } catch (IOException e) {
            //e.printStackTrace();
            JOptionPane.showMessageDialog(null,
                    "Ocorreu um erro inesperado. Entre em contato com o suporte." + e.getMessage());
        } finally {
            System.out.println("Chegou no finally");
        }
    }
    public static BufferedReader lerArquivo(String nomeDoArquivo) throws ImpossivelAbrirArquivoException {
        File file = new File(nomeDoArquivo);
        try {
            return new BufferedReader(new FileReader(nomeDoArquivo));
        } catch (FileNotFoundException e) {
            throw new ImpossivelAbrirArquivoException(file.getName(), file.getPath());
        }
    }
} class ImpossivelAbrirArquivoException extends Exception{
    private String nomeDoArquivo;
    private String diretorio;

    public ImpossivelAbrirArquivoException(String nomeDoArquivo, String diretorio) {
        super("O arquivo " + nomeDoArquivo + " não foi encontrado no diretório " + diretorio);
        this.nomeDoArquivo = nomeDoArquivo;
        this.diretorio = diretorio;
    }

    @Override
    public String toString() {
        return "ImpossivelAbrirArquivoException{" +
                "nomeDoArquivo='" + nomeDoArquivo + '\'' +
                ", diretorio='" + diretorio + '\'' +
                '}';
    }
}
