import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
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

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp java developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devRoberto = new Dev();
        devRoberto.setNome("Roberto");
        devRoberto.inscreverBootcamp(bootcamp);
        System.out.printf("\nConteúdos inscritos (%s): %s", devRoberto.getNome(), devRoberto.getConteudosInscritos());
        System.out.printf("\nConteúdos concluídos (%s): %s", devRoberto.getNome(), devRoberto.getConteudosConcluidos());
        System.out.println("\nXP: " + devRoberto.calcularTotalXp());

        devRoberto.progredirBootcamp();
        System.out.println("\nProgressão");
        System.out.printf("\nConteúdos inscritos (%s): %s", devRoberto.getNome(), devRoberto.getConteudosInscritos());
        System.out.printf("\nConteúdos concluídos (%s): %s", devRoberto.getNome(), devRoberto.getConteudosConcluidos());
        System.out.println("\nXP: " + devRoberto.calcularTotalXp());

        devRoberto.progredirBootcamp();
        System.out.println("\nProgressão");
        System.out.printf("\nConteúdos inscritos (%s): %s", devRoberto.getNome(), devRoberto.getConteudosInscritos());
        System.out.printf("\nConteúdos concluídos (%s): %s", devRoberto.getNome(), devRoberto.getConteudosConcluidos());
        System.out.println("\nXP: " + devRoberto.calcularTotalXp());

        devRoberto.progredirBootcamp();
        System.out.println("\nProgressão");
        System.out.printf("\nConteúdos inscritos (%s): %s", devRoberto.getNome(), devRoberto.getConteudosInscritos());
        System.out.printf("\nConteúdos concluídos (%s): %s", devRoberto.getNome(), devRoberto.getConteudosConcluidos());
        System.out.println("\nXP: " + devRoberto.calcularTotalXp());


        Dev devLucas = new Dev();
        devLucas.setNome("Lucas");
        devLucas.progredirBootcamp();
        System.out.println("\nProgressão");
        System.out.printf("\nConteúdos inscritos (%s): %s", devLucas.getNome(), devLucas.getConteudosInscritos());
        System.out.printf("\nConteúdos concluídos (%s): %s", devLucas.getNome(), devLucas.getConteudosConcluidos());
        System.out.println("\nXP: " + devLucas.calcularTotalXp());
        devLucas.inscreverBootcamp(bootcamp);

        devLucas.progredirBootcamp();
        System.out.println("\nProgressão");
        System.out.printf("\nConteúdos inscritos (%s): %s", devLucas.getNome(), devLucas.getConteudosInscritos());
        System.out.printf("\nConteúdos concluídos (%s): %s", devLucas.getNome(), devLucas.getConteudosConcluidos());
        System.out.println("\nXP: " + devLucas.calcularTotalXp());
    }
}
