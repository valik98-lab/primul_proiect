package com.company;

public class Main {

    public static void main(String[] args) {
        // Exemple de variabile
        int iner = 10;
        long l = 20L;
        short s = 12480;
        char c = 'C';
        float f = 6.F;
        double d = 25D;
        boolean b = true;
        byte bit = 22;

        //Exemple de conditionale
        // Conditia if
        if (24 > 10) {
            System.out.println("24 este mai mare ca 10");

            // Conditia if else
            int number = 20;
            if (number < 10) {
                System.out.println("Am numarul 20.");
            } else {
                System.out.println("Am numarul 10 ");
            }
        }
        // Conditia if   elese if   else
        int number = 24;
        if (number < 12) {
            System.out.println("Buna");
        } else if (number < 22) {
            System.out.println("Saluare");
        } else {
            System.out.println("Pa pa ");
        }
        // Conditia switch
        int ziua = 6;
        switch (ziua) {
            case 1:
                System.out.println("Luni");
                break;
            case 2:
                System.out.println("Marti");
                break;
            case 3:
                System.out.println("Miercuri");
                break;
            case 4:
                System.out.println("Joi");
                break;
            case 5:
                System.out.println("Vineri");
                break;
            case 6:
                System.out.println("Simbata");
                break;
            case 7:
                System.out.println("Duminica");
                break;
        }
        // Instructiunea for
        for (int i = 1; i <= 15; i = i + 2) {
            System.out.println(i);
        }
        // Instructiunea while
        int j = 1;
        while (j < 10) {
            System.out.println(j);
            j++;
        }
        //  Instructiunea do while
        int a = 1;
        do {
            System.out.println(a);
            a++;
        }
        while (a < 7);
    }
}
