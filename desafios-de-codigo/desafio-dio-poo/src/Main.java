import br.com.dio.desafio.dominio.*;

import java.time.LocalDate;

public class Main {
  public static void main(String[] args) {
    Curso curso1 = new Curso();
    curso1.setTitulo("Curso Java");
    curso1.setDescricao("Descrição do Curso Java");
    curso1.setCargaHoraria(8);
    //    System.out.println(curso1);

    Curso curso2 = new Curso();
    curso2.setTitulo("Curso Java 2");
    curso2.setDescricao("Descrição do Curso Java 2");
    curso2.setCargaHoraria(10);
    //    System.out.println(curso2);

    Mentoria mentoria = new Mentoria();
    mentoria.setTitulo("Mentoria de Java");
    mentoria.setDescricao("Descrição da Mentoria de Java");
    mentoria.setData(LocalDate.now());
    //    System.out.println(mentoria);

    Conteudo mentoria2 = new Mentoria();
    mentoria2.setTitulo("Mentoria de Java (Polimorfismo)");
    mentoria2.setDescricao("Descrição da Mentoria de Java (Polimorfismo)");
    //    System.out.println(mentoria2);

    Bootcamp bootcamp = new Bootcamp();
    bootcamp.setNome("Orange Tech Backend Java");
    bootcamp.setDescricao("Descrição do Orange Tech Backend Java");
    bootcamp.getConteudos().add(curso1);
    bootcamp.getConteudos().add(curso2);
    bootcamp.getConteudos().add(mentoria);

    Dev dev = new Dev();
    dev.setNome("Angélica");
    dev.inscreverBootcamp(bootcamp);

    System.out.printf(
        "Conteúdos inscritos de %s ", dev.getNome() + "\n" + dev.getConteudosIncritos());
    dev.progredir();
    System.out.printf(
        "Conteúdos concluídos de %s ", dev.getNome() + "\n" + dev.getConteudosConcluidos());
    dev.progredir();
    System.out.printf(
        "Conteúdos inscritos de %s ", dev.getNome() + "\n" + dev.getConteudosIncritos());

    System.out.println("\nXP: " + dev.calcularXp());
  }
}
