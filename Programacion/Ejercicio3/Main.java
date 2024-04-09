package Programacion.Unidad8.Ejercicios.Ejercicio3;

import Programacion.Unidad8.Ejercicios.Ejercicio3.clases.Curso;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Curso> cursos = new ArrayList<>();
        cursos.add(new Curso("Cursos profesional de Java", 6.5f, 50, 200 ));
        cursos.add(new Curso("Cursos profesional de Python", 8.5f, 60, 800 ));
        cursos.add(new Curso("Cursos profesional de DB", 4.5f, 70, 700 ));
        cursos.add(new Curso("Cursos profesional de Android", 7.5f, 10, 400 ));
        cursos.add(new Curso("Cursos profesional de Escritura", 1.5f, 10, 300 ));

        //Obtener la cantidad de cursos con una duración mayor a 5 horas.
        long cursosMas5Horas = cursos.stream().filter(curso-> curso.getDuracion() > 5).count();
        System.out.println("Cursos con mas de 5 horas: " + cursosMas5Horas);
        //Obtener la cantidad de cursos con una duración menor a 2 horas.
        long cursosMenos2Horas = cursos.stream().filter(curso-> curso.getDuracion() < 2).count();
        System.out.println("Cursos con menos de 2 horas: " + cursosMenos2Horas);
        //Listar el título de todos aquellos cursos con una cantidad de vídeos mayor a 50.
        List<Curso> mas50Videos = cursos.stream().filter(curso -> curso.getVideos() > 50).toList();
        System.out.println("\nCursos con más de 50 videos: ");
        mas50Videos.forEach(curso->{
            System.out.println(curso.getTitulo());
        });
        //Mostrar en consola el título de los 3 cursos con mayor duración.
        Comparator<Curso> comparator = Comparator.comparing(curso -> curso.getDuracion());
        List<Curso> cursosMasLargos = cursos.stream().sorted(comparator.reversed()).limit(3).toList();

        System.out.println("\nCursos mas largos:");
        cursosMasLargos.forEach(curso->{
            System.out.println(curso.getTitulo());
        });
        //Mostrar en consola la duración total de todos los cursos.
        double total = 0;
        /*for (Curso curso:cursos){
            total += curso.getDuracion();
        }
        System.out.println("\nDuracion total cursos: " + total);*/
        double suma = cursos.stream().mapToDouble(curso->curso.getDuracion()).sum();
        System.out.println("\nDuracion total cursos: " + suma);
        //Mostrar en consola todos aquellos libros que superen el promedio en cuanto a duración se refiere.
        double media = suma/cursos.stream().count();
        List<Curso> masMedia = cursos.stream().filter(curso -> curso.getDuracion() > media).toList();
        System.out.println("\nCursos con duración superior a la media: ");
        masMedia.forEach(curso->{
            System.out.println(curso.getTitulo());
        });
        //Mostrar en consola la duración de todos aquellos cursos que tengan una cantidad de alumnos inscritos menor a 500.
        List<Curso> menosDe500Alumnos = cursos.stream().filter(curso -> curso.getAlumnos() < 500).toList();
        menosDe500Alumnos.forEach(curso -> {
            System.out.println(curso.getTitulo());
        });
        //Obtener el curso con mayor duración
        Curso cursoMasLargo = (Curso) cursos.stream().max(Comparator.comparing(c->c.getDuracion())).get();
        System.out.println("\nCurso más largo: " + cursoMasLargo.getTitulo());
        //Crear una lista de Strings con todos los titulos de los cursos.
        List<String> listaString = new ArrayList<>();
        cursos.forEach(curso -> {
            listaString.add(curso.getTitulo());
        });
        System.out.println("Lista de Strings: " + listaString);
    }
}
