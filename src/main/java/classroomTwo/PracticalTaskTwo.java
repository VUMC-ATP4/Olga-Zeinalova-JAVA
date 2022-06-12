package classroomTwo;

import java.util.Scanner;

public class PracticalTaskTwo {

    public static void main(String[] args) {


        //tips  nosauku   deklaracija
        Scanner scanner = new Scanner(System.in);
        int vecums;
        boolean canVote = false;
        System.out.println("Paskaties cilvēka pasē?");
        vecums = scanner.nextInt();

        if (vecums >= 18) {
            canVote = true;
        }

        if (canVote) {
            System.out.println("Cilveks var balsot");
        } else {
            System.out.println("Cilveks nevar balsot");
        }

        int month = 5;

        switch (month) {
            case 1:
                System.out.println("Janvāris");
                break;
            case 2:
                System.out.println("Februāris");
                break;
            case 12:
                System.out.println("Decembris");
            default:
                System.out.println("Mēnesis " + month + " nav definets");
        }


        int x = 10;
        int y = 20;

        if (y > x && x > 5) {
            System.out.println("y ir lielāks par x un lielāks par 5");
        }

        if (y > x || y > 25) {
            System.out.println("sis izpildas!");
        }


        int skaitlis = 0;

        if (skaitlis > 0) {
            System.out.println(skaitlis + " ir pozitivs!");
        } else if (skaitlis < 0) {
            System.out.println(skaitlis + " ir negativs!");
        } else {
            System.out.println(skaitlis + " ir NULLE!");
        }


        System.out.println("Ievadi savu vārdu");

        String vards = scanner.nextLine();

        System.out.println("Labdien " + vards + "!");

        System.out.println("Esi sveicināts kalkulatora programmā!");
        int a;
        int b;
        int summa;
        System.out.println("Ievadi skaitli a");
        a = scanner.nextInt();
        System.out.println("Ievadi skaitli b");
        b = scanner.nextInt();
        System.out.println(a > b);
        System.out.println("Šeit jābūt nepatiesam: " + (5 > 10));
        System.out.println((5 < 10));
        System.out.println(6 == 5); //false
        System.out.println(5 == 5);   //true
        System.out.println(6 != 5); //true
        System.out.println(5 != 5); //false
        int vecumsJauns = 18;
        System.out.println(vecumsJauns >= 18);
        int bernaVecums = 5;
        System.out.println(bernaVecums <= 5);
        System.out.println(vecumsJauns > bernaVecums);
        boolean isEligibleToVote = vecumsJauns >= 18;
        System.out.println("Vai cilvēks drīkst balsot ? " + isEligibleToVote);

        String name = "Juris";
        String nameTwo = "Juris";
        System.out.println(name.equals(nameTwo));
        System.out.println(true == true);

        System.out.println("Ievadi X");
        int k = 4;
        int summaDivi = 10;
        System.out.println(summaDivi);
        boolean vaiIrPatiess = ((k < 5) && (k < 10)); //true
        x = 5;
        System.out.println((k < 5 && k < 10)); //false
        System.out.println((k < 5 || k < 10)); //true
        System.out.println(vaiIrPatiess);

        summaDivi = a + b;
        System.out.println(String.format("%s, %s + %s = %s", vards, a, b, summaDivi));


        System.out.println("Šī ir otrā Java lekcija");
        String teksts;

        String nameDivi = "Juris";
        String surname = "Kreilis";
        String role = "Pasniedzējs";
        double videjaAtzime = 7.3214;

        String concatTeikums = "Mani sauc " + nameDivi + " Mans uzvārds ir " + surname + " Es esmu " + role;
        String teikums = String.format("Mani sauc %s. Mans uzvārds ir %s. Es esmu %s. Mana vid atz ir %.1f", nameDivi, surname, role, videjaAtzime);

        System.out.println(teikums);
        System.out.println(concatTeikums);

        int z = 10;
        int e = 20;
        int c = 20;
        int d = 0;
        System.out.println((z < e) && (b == c));
        System.out.println(z > e || c == d);

        System.out.println(!(a > b));

        int skaitlisB = 343;

        switch (skaitlisB) {
            case 10:
                System.out.println("Skaitlis  = 10");
                break;
            case 15:
                System.out.println("Skaitlis = 15");
                break;
            case 20:
                System.out.println("skaitlis = 20");
                break;
            default:
                System.out.println("Skaitlis nezināms");
        }


        if (skaitlisB == 10) {
            System.out.println("Skaitlis  = 10");
        } else if (skaitlisB == 15) {
            System.out.println("Skaitlis = 15");
        } else if (skaitlisB == 20) {
            System.out.println("skaitlis = 20");
        } else {
            System.out.println("Skaitlis nezināms");
        }

        int q = 10;

        if (q > 0) {
            System.out.println("Skaitlis ir lielaks par nulli");
        }


        int cilvekaVecums = 60;
        char dzimums = 'S';
        boolean drikstDoties = false;

        if (dzimums == 'V' && cilvekaVecums >= 65) {
            drikstDoties = true;
        } else if (dzimums == 'S' && cilvekaVecums >= 60) {
            drikstDoties = true;
        }


        System.out.println("Cilveks drikst doties pensija " + drikstDoties);

        int diena = 7;
        switch (diena) {
            case 1:
                System.out.println("Pirmdiena");
                break;
            case 2:
        }

        //12 % 2 = 0
        //13 % 2 = 1
        //15 % 2 = 1

        int skaitlisX = 14;

        if (skaitlisX % 2 == 0) {
            System.out.println("Skaitlis ir pāra");
        } else {
            System.out.println("Skaitlis ir nepāra");
        }


    }

}