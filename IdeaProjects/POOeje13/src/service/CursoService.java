package service;

import entidad.Curso;
import java.util.Scanner;

public class CursoService {

    private String[] cargarAlumnos() {

        String[] alumnos = new String[5];
        Scanner read = new Scanner(System.in);

        System.out.println("Ingrese los nombres de cada alumno que asiste al curso!");
        for (int i=0; i<5; i++){
            System.out.print("\nAlumno "+(i+1)+": ");
            alumnos[i] = read.nextLine();
        }

        return alumnos;
    }

    public Curso crearCurso() {

        Scanner read = new Scanner(System.in);
        Curso c1 = new Curso();

        System.out.print("\nNombre del curso: ");
        c1.setNombreCurso(read.nextLine());

        System.out.print("\nDe cuantas horas es el curso por dia: ");
        c1.setCantidadHorasPorDia(read.nextInt());

        System.out.print("\nDe cuantos dias es el curso a la semana: ");
        c1.setCantidadDiasPorSemana(read.nextInt());

        System.out.print("\nEl turno es M(mañana) o T(tarde): ");
        Character resp = read.next().charAt(0);
        respuestaTurno(resp,c1);

        System.out.print("\nCuanto es el precio por hora del curso: ");
        c1.setPrecioPorHora(read.nextInt());

        c1.setAlumnos(cargarAlumnos());

        return c1;
    }

    private Character respuestaTurno(Character resp, Curso c1) {

        boolean respuestaCorrecta = false;
        Scanner read = new Scanner(System.in);

        if (resp.equals('M') || resp.equals('T') || resp.equals('m') || resp.equals('t')){
            c1.setTurno(resp);
        } else {
            while (!respuestaCorrecta) {
                System.out.println("Opcion no valida. Ingrese nuevamente M por mañana o T por tarde");
                resp = read.next().charAt(0);
                if (resp.equals('M') || resp.equals('T') || resp.equals('m') || resp.equals('t')){
                    respuestaCorrecta = true;
                }
            }
        }
        return resp;
    }

    public double calcularGananciaSemanal(Curso curso){

        return (double) (curso.getCantidadHorasPorDia() * curso.getPrecioPorHora() * curso.getAlumnos().length * curso.getCantidadDiasPorSemana());

    }
}
