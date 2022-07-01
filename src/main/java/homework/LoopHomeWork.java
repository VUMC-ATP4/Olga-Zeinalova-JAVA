package homework;

import java.util.Scanner;

public class LoopHomeWork {
    public static void main(String[] args) {
        skaitlisLidzSimts();
        primeNumber();
        masivi1();
        paraskaitli();
        faktorials();
        pinKods();



    }


    //Uzdevums 1.
    public static void skaitlisLidzSimts() {
        System.out.println("Uzdevums Nr.1");

        Scanner scanner = new Scanner(System.in);
        int skaitlis = 0;
        while (skaitlis <= 100) {
            System.out.println("Ievadi skaitli");
            skaitlis += scanner.nextInt();
            System.out.println("Summa ir " + skaitlis);
        }
        System.out.println("Gatavs.");
    }

    //Uzdevums 2.
    public static void primeNumber() {

        System.out.println("Uzdevums Nr.2");
        Scanner scanner = new Scanner(System.in);
        int veselsSkaitlis;
        System.out.println("Ievadi veselu skaitli: ");
        veselsSkaitlis = scanner.nextInt();
        boolean pirmsSkaitlis = true;

        for (int i = 2; i <= veselsSkaitlis / 2; i++) {

            if (veselsSkaitlis % i == 0) {
                pirmsSkaitlis = false;
                break;
            }
        }
        if (pirmsSkaitlis)
            System.out.println(veselsSkaitlis + " ir pirmsskaitlis.");
        else
            System.out.println(veselsSkaitlis + " nav pirmsskaitlis.");
    }
    // Uzdevums 3.

    public static void masivi1() {


        System.out.println("Uzdevums Nr.3");

        int[] randomNumbers = {0, 1, 2, 3, 4, 5};
        String[] month = {"janvāris", "februāris", "marts", "aprīlis"};
        char[] randomLetters = {'A', 'B', 'C' };

        int skaitli = 0;
        while (skaitli < randomNumbers.length) {
            System.out.println(randomNumbers[skaitli]);
            skaitli++;
        }

        int menesis = 0;
        while (menesis < month.length) {
            System.out.println(month[menesis]);
            menesis++;
        }

        int burts = 0;
        while (burts < randomLetters.length) {
            System.out.println(randomLetters[burts]);
            burts++;
        }
        System.out.println("**********");


        int c = 0;
        do {
            System.out.println(randomNumbers[c]);
            c++;
        }
        while (c < randomNumbers.length);

        int d = 0;
        do {
            System.out.println(month[d]);
            d++;
        }
        while (d < month.length);

        int e = 0;
        do {
            System.out.println(randomLetters[e]);
            e++;
        }
        while (e < randomLetters.length);

        System.out.println("**********");

        for (int randomNumber : randomNumbers) {
            System.out.println(randomNumber);
        }
        for (String s : month) {
            System.out.println(s);
        }
        for (char randomLetter : randomLetters) {
            System.out.println(randomLetter);
        }

        System.out.println("**********");


        for (int i : randomNumbers) {
            System.out.println(i);
        }
        for (String strTemp : month) {
            System.out.println(strTemp);
        }
        for (char j : randomLetters) {
            System.out.println(j);
        }
    }
    // Uzdevums 4.

    static void paraskaitli() {
        System.out.println("Uzdevums Nr.4");

        int masivs[] = new int[100];
        for (int paraSkaitli = 0; paraSkaitli < masivs.length; paraSkaitli++) {
            masivs[paraSkaitli] = paraSkaitli;
            if (paraSkaitli % 2 == 0)
                System.out.println(paraSkaitli + ";");
        }
    }
    // Uzdevums 5.

    static void faktorials() {
        System.out.println("Uzdevums Nr.5");

        int result = factorial(4);
        System.out.println(result);
    }

    public static int factorial(int k) {

        if (k <= 0)
            return 0;
        int fact = 1;
        for (int j = 1; j <= k; j++) {
            fact = fact * j;
        }
        return fact;

    }
    // Uzdevums 6.
    static void pinKods() {
        System.out.println("Uzdevums Nr.6");

        Scanner scan = new Scanner(System.in);

        final int pin = 0000;
        int attemps = 0;

        while (attemps <= 2) {
            System.out.println("Ievadi PIN: ");
            if (pin == scan.nextInt()) {
                System.out.println("PIN ir pieņemts, laipni lūdzam atpakaļ! ");
                break;

            }

            if (attemps == 2) {
                System.out.println("Atvainojiet, bet jūs esat bloķēts! ");
                break;
            }

            else {
                System.out.println("Nepareizs PIN, mēģiniet vēlreiz! ");
            }
            attemps++;
        }
    }
}


