package homework;

import java.util.Scanner;

public class HomeWorkTwoo {
    public static void main(String[] args) {
        System.out.println("This is homework twoo.");

// Uzdevums 1.
        System.out.println("Uzdevums Nr.1");
        int x = 8;
        System.out.println(x > 0);
        System.out.println(x < 0);
        System.out.println(x > 5 && x <= 10);
        System.out.println(!(x <= 5) && x < 10);
        System.out.println(x == 0 || x == 10);
        System.out.println(x * x > 10);


// Uzdevums 2.
        System.out.println("Uzdevums Nr.2");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ievadi mēneša numuru");
        int month = scanner.nextInt();
        switch (month) {

            case 1:
                System.out.println("Janvāris");
                break;
            case 2:
                System.out.println("Februāris");
                break;
            case 3:
                System.out.println("Marts");
                break;
            case 4:
                System.out.println("Aprīlis");
                break;
            case 5:
                System.out.println("Maijs");
                break;
            case 6:
                System.out.println("Jūnijs");
                break;
            case 7:
                System.out.println("Jūlijs");
                break;
            case 8:
                System.out.println("Augusts");
                break;
            case 9:
                System.out.println("Septembris");
                break;
            case 10:
                System.out.println("Oktobris");
                break;
            case 11:
                System.out.println("Novembris");
                break;
            case 12:
                System.out.println("Decembris");
                break;
            default:
                System.out.println("Mēnesis " + month + " nav definēts");


        }

// Uzdevums 3.
        System.out.printf("Uzdevums Nr.3");
        Scanner scanner1 = new Scanner(System.in);

        int a;
        int b;
        int c;

        System.out.println(" Ievadi pirmo skaitli");
        a = scanner1.nextInt();
        System.out.println("Ievadi otro skaitli");
        b = scanner1.nextInt();
        System.out.println("Ievadi trešo skaitli");
        c = scanner1.nextInt();

        if (a > b && a > c) {
            System.out.println("Lielākais skaitlis ir a");
        } else if (b > a && b > c) {
            System.out.println("Lielākais skiaitlis ir b");
        } else {
            System.out.println("Lielākais skaitlis ir c");
        }

// Uzdevums 4.
        System.out.println("Uzdevums Nr.4");

        Scanner luksofors = new Scanner(System.in);
        System.out.println("Kāda luksoforā krāsa?");
        String krasa = luksofors.nextLine();
        if (krasa.equals("Sarkana")) {
            System.out.println("Stāvi!");
        } else if (krasa.equals("Dzeltena")) {
            System.out.println("Gaidi!");
        } else if (krasa.equals("Zaļa")) {
            System.out.println("Dodies!");
        } else {
            System.out.println("Tādas krāsas nav luksoforā!");
        }



// Uzdevums 5.

        System.out.println("Uzdevums Nr.5 " );
        printBusinessCard();
        printBusinessCard();
        printBusinessCard();

// Uzdevums 6.

        System.out.println("Uzdevums Nr.6");
        printBusinessCardTwo("Jānis", "Bērziņš", "+371 23456708", 1989);
        printBusinessCardTwo("Līga", "Kalniņa", "+371 34345667", 1978 );
// Uzdevums 7.

        System.out.println("Uzdevums Nr.7");
        int sum = summa(5,8);
        System.out.println(sum);

 // Uzdevums 8.

        System.out.println("Uzdevums Nr.8");
        System.out.println(average(7, 3, 6));
    }
static void printBusinessCard(){
    System.out.println("Vizītkarte");
    System.out.println("##########");
    System.out.println("Vārds: Līga");
    System.out.println("Uzvārds: Liepiņa");
    System.out.println("Telefona numurs: +371 12345");
    System.out.println("Dzimšanas gads: 1985");
    System.out.println("##########");
}
static void printBusinessCardTwo(String name , String surname, String telephone, int dateOfBirth){
    System.out.println("Vizītkarte");
    System.out.println("##########");
    System.out.println("Vārds: " + name);
    System.out.println("Uzvārds: " + surname);
    System.out.println("Telefona numurs: " + telephone);
    System.out.println("Dzimšanas gads: " + dateOfBirth);
    System.out.println("##########");
}

static int summa(int a, int b){
        return a+b;
}
static double average(double a, double b, double c){
        return (a + b + c) / 3;
}

}




