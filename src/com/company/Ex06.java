package com.company;

import java.util.Scanner;

/**
 * Created by 25374183p on 29/11/2016.
 */
public class Ex06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double contpar = 0;
        double sumapares = 0;

        int[] numeros = new int[10];


        for (int i = 0; i <numeros.length; i++) {
            System.out.println("dame el numero num: "+i+1);

            numeros[i] = scanner.nextInt();

        if(numeros[i]%2==0){
            sumapares=sumapares+i;
            contpar++;
            }
        }
        System.out.println("la media de los numeros pares es: "+sumapares/contpar);

    }
}
