package com.company;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by 25374183P on 03/11/2016.
 */
public class Ex05 {
    public static void main(String[] args) {

     Scanner scanner = new Scanner(System.in);

        String NombreRico;
        int SueldoRico;
        int i = 0;

        String[] Nombre = new String[20];
        int[] Sueldos = new int[20];

        System.out.println("Dame el nombre y sueldo de los empleados: ");
            System.out.print("Empleado " + (i + 1) + ": ");
                Nombre[i] = scanner.nextLine();
            System.out.print("Sueldo: ");
                Sueldos[i] = scanner.nextInt();

       //igualar el maximo para inciar su valor
        SueldoRico = Sueldos[i];
        NombreRico = Nombre[i];

        for (i = 1; i < Nombre.length; i++) {
            scanner.nextLine(); //limpiar los valores

            System.out.print("Empleado " + (i + 1) + ": ");
            Nombre[i] = scanner.nextLine();
            System.out.print("Sueldo: ");
            Sueldos[i] = scanner.nextInt();

            if (Sueldos[i] > SueldoRico) {
                SueldoRico = Sueldos[i];
                NombreRico = Nombre[i];
            }
        }


        System.out.println("Empleado con mayor sueldo: " + NombreRico );
        System.out.println("Sueldo: " + SueldoRico);
    }


    }

