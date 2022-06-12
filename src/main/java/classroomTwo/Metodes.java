package classroomTwo;

import java.util.Scanner;

public class Metodes {

    public static void main(String[] args) {
        System.out.println("Sākās koda izpilde");
        printetTekstu();
        System.out.println("beidzās koda izpidle");
        switchPiemers();
        checkPersonAge();
        checkPersonAge();
        checkPersonAge();
        int a =10;
        int b = 50;
        int laukums =  calculateArea(a,b);
        System.out.println(laukums);
        loginInPage("Juris123","parole123");


    }

    static void loginInPage(String username, String password){
        System.out.println("Īevcadām lietotaja vardu" + username);
        System.out.println("Īevcadām parole " + password);
    }

    static int calculateArea(int a, int b){
        return a*b;
    }



    static void checkPersonAge(){
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
    }


    static void switchPiemers(){
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
    }

    static void printetTekstu(){
        System.out.println("šī ir mana metode sākums");
        System.out.println("Es izsaucu šo metodi beigas");
    }


}