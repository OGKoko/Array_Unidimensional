package com.company;

import java.util.Scanner;

/**
 * Created by 25374183P on 03/11/2016.
 */
public class Ex04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int contplus=0;
        int contsub=0;


        System.out.println("¿Cuantas alturas deseas introducir?");
            int num= scanner.nextInt();
        System.out.println("Dame "+num+" Alturas");

        int[] Array = new int[num];


        for (int i = 0; i < Array.length; i++) {
            System.out.println("Introduce la altura numero " + (i + 1));
            Array[i] = scanner.nextInt();
        }

        for(int i =0; i < Array.length; i++){
            if(Array[i]<num/Array[i]){
                contsub++;
            }else if(Array[i]>num/Array[i]){
                contplus++;
            }

        }
        System.out.println("Hay "+contplus+" numeros superiores a la media y "+contsub+" numeros inferiores a la media");
    }
}
