package classroomThree;


import java.util.Scanner;

public class Masivi {

    public static void main(String[] args) {

        String[] gaidalaiki = {"Pavasaris", "Varasa", "Rudens", "Ziema"};
        int[] fibonacciNumbers = {0, 1, 1, 2, 3, 5, 8, 13, 21, 34};
        double[] randomSkaitli = {21.3, 323.23, 412.32};

        System.out.println("Masīva garums ir: " + gaidalaiki.length);


        System.out.println(gaidalaiki[0]);
        System.out.println(gaidalaiki[1]);
        System.out.println(gaidalaiki[2]);
        System.out.println(gaidalaiki[3]);
        System.out.println(fibonacciNumbers[4]);

        gaidalaiki[1] = "JURIS";
        System.out.println(gaidalaiki[1]);


        //Masīvs ar cilvēku vārdiem
        String[] cilvēki = {"Juris", "Pēteris", "Anna"};
        int[] vecums = {33, 40, 28};
        System.out.println("Vārds:" + cilvēki[0] + "\n" + "Vecums: " + vecums[0]);


        String[] germanCars = new String[4];
        germanCars[0] = "Mercedes";
        germanCars[1] = "Audi";
        germanCars[2] = "BMW";
        germanCars[3] = "Opel";

        int iterators = 0;
        while (iterators < germanCars.length) {
            System.out.println(germanCars[iterators]);
            iterators++;
        }
        printStringArray(germanCars);


        System.out.println(germanCars[3]);
        //Ievadi skaitli 1, ievadi skaitli 2, ievadi skaitli 3
        //int[] mansMasivs = generateArray();
        //System.out.println(mansMasivs[0] + "" + mansMasivs[1] + "" + mansMasivs[2]);

        int[] majasdarbuIesniegumi = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11};
        printIntArray(majasdarbuIesniegumi);

        int i = 0;

        while (i <= 5) {
            System.out.println("I ir : " + i);
            i++; // tas pats kas i = i +1;
        }
        System.out.println("Cikla izeja");

        int q = 10;
        while (q > 1) {
            System.out.println("Q ir: " + q);
            q--; // tas pats kas q = q-1;
        }

        int[] bingoLotoLaimigiSkaitli = {3, 5, 48, 7, 6, 31};
        printIntArray(bingoLotoLaimigiSkaitli);

        String[] kartis = {"Pīķa dūzis", "Ercena kalps", "Kārava dāma"};
        int karts = 0;
        System.out.println(String.format("Man rokā ir %s kārtis ", kartis.length));
        while (karts < kartis.length) {
            System.out.println(kartis[karts]);
            karts++;
        }

        // sumPositiveNumbers();

        Scanner scanner = new Scanner(System.in);
//        String parole = "Parole123";
//        String lietotajaParole;
//        do {
//            System.out.println("Ievadi paroli");
//            lietotajaParole = scanner.nextLine(); //Parole123
//            System.out.println("Pārbaudām paroli");
//        } while (!lietotajaParole.equals(parole));
//        System.out.println("Pareiza parole");

//        for (int j = 0; j < 10 ; j++) {
//            System.out.println(j);
//        }


//        for (int j = 2; j <=1000 ; j=j+2) {
//            System.out.println(j);
//        }

        for (int j = 0; j < gaidalaiki.length; j++) {
            System.out.println(gaidalaiki[j]);
        }

//        for (int j = 0; j < 1000; j++) {
//            System.out.println("es esmu labs students");
//        }

        // Šobrīd ciematā ir iespēja iegādāties mājas ar mājas numuriem no 1 līdz 50.
        // Pircējs  vēlas iegādāties māju ciematā, bet viņš nevēlas māju, kuras numurs dalās ar 3 vai 5.
        // Cik māju numuri atbilst prasībām?

        for (int j = 1; j <= 50; j++) {
            if ((j % 3 == 0) || (j % 5 == 0)) {
                System.out.println("Šis numurs mums neder " + j);
            } else {
                System.out.println("Šis numurs mums der " + j);
            }
        }

        int[] skaitlos = {1, 3, 4, 6, 1, 2, 3, 5, 1, 2, 5};
        int summa =0;
        //for each
        for (int skaitlis : skaitlos) {
            summa = summa + skaitlis;
        }
        System.out.println(summa);

        String[] vardi = {"ābols","bumbieris","Burkāns"};
        for (String vards : vardi ){
            System.out.println(vards);
        }

        for (int j = 0; j < 10 ; j++) {
            if(j==5){
                break;
            }
            System.out.println(j);
        }
        System.out.println("=========================================");
        int[] skaitluMasivs = {1,2,3,4,5,6,7,2,3,4,5,6,-3,5,4};

        for (int j = 0; j < skaitluMasivs.length; j++) {
            if(skaitluMasivs[j]==-3){
                System.out.println(skaitluMasivs[j]);
                break;
            }
            System.out.println(skaitluMasivs[j]);
        }

        System.out.println("=========================================");
        System.out.println("=========================================");
        for (int j = 0; j <=10 ; j++) {
            if(j>4 && j<8){
                continue;
            }
            System.out.println(j);
        }



    }


    static int sumPositiveNumbers() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ieraksti skaitli");
        int number = scanner.nextInt();
        int summa = 0;
        while (number >= 0) {
            summa = summa + number;
            System.out.println("Ieraksti skaitli");
            number = scanner.nextInt();
        }
        System.out.println("Pozitīvo skaitļu summa ir: " + summa);
        return summa;
    }

    static void printIntArray(int[] randomMasivs) {
        int counter = 0;
        while (counter < randomMasivs.length) {
            System.out.println(randomMasivs[counter]);
            counter++;
        }
    }

    static void printStringArray(String[] randomMasivs) {
        int counter = 0;
        while (counter < randomMasivs.length) {
            System.out.println(randomMasivs[counter]);
            counter++;
        }
    }

    static int[] generateArray() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ievadi pirmo skaitli...");
        int a = scanner.nextInt();
        System.out.println("Ievadi otro skaitli...");
        int b = scanner.nextInt();
        System.out.println("Ievadi trešo skaitli...");
        int c = scanner.nextInt();
        int[] skaitluMasivs = {a, b, c};
        return skaitluMasivs;
    }


    static void printCilveks(String[] humans, int[] ages, int index) {
        System.out.println("Vārds:" + humans[index] + "\n" + "Vecums: " + ages[index]);
    }


}
