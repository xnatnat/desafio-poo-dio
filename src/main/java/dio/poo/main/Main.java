package dio.poo.main;

import dio.poo.domain.Bootcamp;
import dio.poo.domain.Curso;
import dio.poo.domain.Dev;
import dio.poo.domain.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Curso curso1 = new Curso();
        curso1.setTitulo("Java");
        curso1.setDescricao("Curso Java");
        curso1.setCargaHoraria(70);

        Curso curso2 = new Curso();
        curso2.setTitulo("JS");
        curso2.setDescricao("Curso JS");
        curso2.setCargaHoraria(75);

        Mentoria mentoria1 = new Mentoria();
        mentoria1.setTitulo("Mentoria Java");
        mentoria1.setDescricao("Mentoria Java");
        mentoria1.setData(LocalDate.now());

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("BootCamp Java Developer");
        bootcamp.setDescricao("BootCamp Java Dev");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria1);

        Dev dev1 = new Dev();
        dev1.setNome("Maria");
        dev1.inscreverBootCamp(bootcamp);
        System.out.println("Conteúdos Inscritos Maria: " + dev1.getConteudosInscritos());
        dev1.progredir();
        dev1.progredir();
        System.out.println("Conteúdos Inscritos Maria: " + dev1.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos Maria: " + dev1.getConteudosConcluidos());
        System.out.println("XP: " + dev1.calcularTotalXp());

        Dev dev2 = new Dev();
        dev2.setNome("João");
        dev2.inscreverBootCamp(bootcamp);
        System.out.println("Conteúdos Inscritos João: " + dev2.getConteudosInscritos());
        dev2.progredir();
        System.out.println("Conteúdos Inscritos João: " + dev2.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos João: " + dev2.getConteudosConcluidos());
        System.out.println("XP: " + dev2.calcularTotalXp());

    }
}