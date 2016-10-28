package com.company;

public class Ex01 {

    public static void main(String[] args) {
        int cont = 2;

        int[] Array = new int[20];
        for (int i = 0; i < Array.length; i++) {

            Array[i] = cont;
            cont += 2;
        }

        //printar el array
        for (int i = 0; i < Array.length; i++) {
            System.out.println(Array[i]);
        }
    }
}
