package Tablice;

import java.util.Arrays;
import java.util.Random;

public class Zadanie2 {
    public static void main(String[] args) {
        Random r = new Random();
        int[] tablica = new int[100];

        Arrays.sort(tablica);


        for (int e : tablica) {
            e = r.nextInt(100);
            System.out.println(e + " ");

        }

        int suma = 0;
        for (int e : tablica) {
            suma += e;

        }
        System.out.println();
        System.out.println("Suma: " + suma);
        System.out.println("Srednia: " + suma / tablica.length);

        System.out.println();
        for (int i = 0; i < tablica.length; i++) {
            tablica[i] = r.nextInt(100);
            System.out.println(i);
        }

        System.out.println();
        for (int e : tablica) {
            if (e % 2 == 0) {
                System.out.println(e + " ");
            }
        }
//        double mediana;
//        for (tablica.length % 2) {
//            if (int )


        }

    }

//}
