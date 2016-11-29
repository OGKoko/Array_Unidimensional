package com.company;
import java.util.Scanner;
/**
 * Created by 25374183p on 29/11/2016.
 */
public class Ex08 {


        public static void main(String[] args) {

            int numero;
            int exp=0;
            int digito;
            double binario=0;
            Scanner scanner = new Scanner(System.in);


                System.out.print("Introduceme un numero: ");
                numero = scanner.nextInt();



            while(numero!=0){
                digito = numero % 2;
                binario = binario + digito * Math.pow(10, exp);
                exp++;
                numero = numero/2;
            }
            System.out.printf("Binario: %.0f %n", binario);
        }
    }

