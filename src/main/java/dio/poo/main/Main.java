package dio.poo.main;

import dio.poo.domain.Curso;
import dio.poo.domain.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }

        Curso curso1 = new Curso("Java", "Curso Java", 70);
        Curso curso2 = new Curso("JS", "Curso JS", 50);
        Mentoria mentoria1 = new Mentoria("Mentoria Java", "Mentoria Java", LocalDate.now());
}