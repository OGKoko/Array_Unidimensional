package com.company;

/**
 * Created by 25374183P on 28/10/2016.
 */

import java.util.Scanner;

public class Ex02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int contPos = 0;
        int contNeg = 0;
        int contZero = 0;

        int[] Array = new int[10];

        //introduce datos en el array
        System.out.println("Dame 10 num: ");
        for (int i = 0; i < Array.length; i++) {
            System.out.println("Introduce el num " + (i + 1));
            Array[i] = scanner.nextInt();

        }
        //recorre para ver si hay uno de los valores introducidos
        for (int i = 0; i < Array.length; i++) {

            if (Array[i] > 0) {

                contPos++;

            }
            if (Array[i] < 0) {

                contNeg++;

            }
            if (Array[i] == 0) {

                contZero++;

            }
        }
        System.out.println("Hay " + contPos + " numeros positivos\n" + contNeg + " Numeros negativos\nY " + contZero + " Ceros");


    }
}