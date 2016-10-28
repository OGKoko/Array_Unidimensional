package com.company;

/**
 * Created by 25374183P on 28/10/2016.
 */
import java.util.Scanner;

public class Ex02 {
    public static void main(String[] args){
     Scanner scanner = new Scanner(System.in);

        int contPos=0;
        int contNeg=0;
        int contZero=0;

        int[] Array = new int[10];

        for (int i = 0; i < Array.length; i++) {
         Array [i] = scanner.nextInt();

            if(i>0){

                contPos++;

            }if(i<0){

                contNeg++;

            }if(i==0){

                contZero++;

            }

        }
    }
}