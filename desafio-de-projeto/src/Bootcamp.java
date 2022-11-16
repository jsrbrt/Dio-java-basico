import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Bootcamp {
    private String nome;
    private String descricao;
    private LocalDate dataInicial;
    private LocalDate dataFinal;
    private Dev dev;
    private Mentoria mentorias;
    private Curso curso;
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setCargaHoraria(8);
        curso1.setDescricao("Descrição curso java.");
        curso1.setTitulo("Curso java");

        Curso curso2 = new Curso();
        curso2.setCargaHoraria(4);
        curso2.setDescricao("Descrição curso javascript.");
        curso2.setTitulo("Curso javascript");

        Mentoria mentoria = new Mentoria();
        mentoria.setData(LocalDate.now());
        mentoria.setDescricao("Descrição mentoria.");
        mentoria.setTitulo("Mentoria");

        System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria);
    }
}
