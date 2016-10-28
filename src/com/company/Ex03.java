package com.company;

import java.util.Scanner;

/**
 * Created by 25374183P on 28/10/2016.
 */
public class Ex03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int contPos = 0;
        int contNeg = 0;
        int operacionPos=0;
        int operacionNeg=0;


        int[] Array = new int[10];

        System.out.println("Dame 10 num: ");
        for (int i = 0; i < Array.length; i++) {
            System.out.println("Introduce el num " + (i + 1));
            Array[i] = scanner.nextInt();
        }

        for(int i =0; i < Array.length; i++){

            if (Array[i]>0){
                operacionPos = Array[i]+operacionPos;
                contPos++;
            }else if(Array[i]<0){
                operacionNeg = Array[i]+operacionNeg;
                contNeg++;
            }

        }
        System.out.println(operacionNeg/contNeg+" Ha sido la media de numeros negativos introducidos");
        System.out.println(operacionPos/contPos+" Ha sido la media de numeros positivos introducido");
    }
}
