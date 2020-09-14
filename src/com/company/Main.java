package com.company;

public class Main {

    public static void main(String[] args) {
    //Exemple de comentarii
        // Un tip de comentariu
        System.out.println("Salutare!");

        /* Al doilea tip de comentarii ce poate fi utilizat
        cind avem mai multe linii de comentat  */
        System.out.println("Sa aveti o buna dispozitie");

    // Exemple de variabile
        int iner = 10;
        long l = 20L;
        short s = 12480;
        char c = 'C';
        float f = 6.F;
        double d = 25D;
        boolean b = true;
        byte bit = 22;

    // Alte exemple de variabile
        int student = 19;
        long  funie=100L;
        char A = 'A';
        char E = '/';
        double test=20.5d;
        boolean prezent = true;
        boolean absent=false;

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

    //Exemplu de string
        String[] fructe={"mere","pere","banane","prune"};
        for(String str:fructe){
            System.out.println(str);
        }

    // Exemple cu diferite tipuri de operatori

        // Operatori aritmetici
        int nrA = 5;
        int nrB = 10;
        int nrC = 15;

        System.out.println("Rezultatul adunării nrA + b = " + (nrA + nrB ));
        System.out.println("Rezultatul scaderii nrA - b = " + (nrA - nrB ));
        System.out.println("Rezutatul inmultirii nrA* b = " + (nrA * nrB ));
        System.out.println("Rezultatul impartirii nrB  / nrA = " + (nrB  /nrA));
        System.out.println("Rezultatul modulului nrB % nrA = " + (nrB  % nrA));
        System.out.println("Rezultatul modlului nrC % nrA = " + (nrC % nrA));
        System.out.println("Rezultatul incrementarii nrA++ = " + (nrA++));
        System.out.println("Rezultatul decrementarii nrB -- = " + (nrA--));


        // Operatori de comparere
        int p_nr = 10;
        int d_nr = 20;
        System.out.println("Rezultatul egalitatii p_nr == d_nr = " + (p_nr == d_nr) );
        System.out.println("Rezultatul inegalitatii p_nr!= d_nr= " + (p_nr!= d_nr) );
        System.out.println("Compararea numerelor cu semnul mai mare p_nr > d_nr = " + (p_nr > d_nr) );
        System.out.println("Compararea numerelor cu semnul mai mic  p_nr< d_nr= " + (p_nr< d_nr) );
        System.out.println("Mai mare sau egal d_nr>= p_nr = " + (d_nr >= p_nr) );
        System.out.println("Mai mic sau egal d_nr <= p_nr= " + (d_nr <= p_nr) );

        // Operatori logici
            // && Logical and
        int h = 5;
        System.out.println( h > 3 && h< 10);

            // || Logical or
        int o = 10;
        System.out.println(o > 8 || o < 9);

            // ! Logical not
        int m = 5;
        System.out.println(!(m > 3 && m < 10));


    }
}
