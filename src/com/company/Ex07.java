package com.company;

import java.util.Scanner;

/**
 * Created by 25374183p on 29/11/2016.
 */
public class Ex07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double notaz;

        System.out.println("cuantos alumnos hay?");
        int alumnos = scanner.nextInt();

        int[] notas = new int[alumnos];


        for (int i = 0; i < notas.length; i++) {
            System.out.println("dame la nota del alumno numero " + i);
            notaz = scanner.nextDouble();

        }
        for (int i = 0; i < notas.length; i++) {
            if (notas[i] > alumnos / notas[i]) {
                System.out.println("el alumno "+notas[i]+" tiene una nota mas alta de la media" );
            }
        }
    }
}
