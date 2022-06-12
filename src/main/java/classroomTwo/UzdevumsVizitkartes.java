package classroomTwo;

import java.util.Scanner;

public class UzdevumsVizitkartes {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(printBuisnessCardTwo("adsasd", "asdasd", "adas", 1990));
        String annasVizitkarte  = printBuisnessCardTwo("Anna", "Doe", "+371 12312312", 1990);
        System.out.println(annasVizitkarte);
        luksaforsDivi();

//        luksafors(scanner.nextLine());
//        luksafors(scanner.nextLine());
//        luksafors(scanner.nextLine());
        int summa = 18;
        int summa2 = sum(5, 3, 10);
        System.out.println(sum(5, 3, 10));

    }



    //Metode kas pieņem 3 veselus skaitlus un atgriez so skaitlu summu
    static int sum(int asdasd, int xcvxcvcx, int dasfdasdf) {
        return asdasd + xcvxcvcx + dasfdasdf;
    }

    public static void luksafors(String krasa) {
        if (krasa.equals("sarkana")) {
            System.out.println("STOP. STĀVI!");
        } else if (krasa.equals("zaļa")) {
            System.out.println("EJ.");
        } else if (krasa.equals("dzeltena")) {
            System.out.println("GATAVOJIES. UZMANIBU");
        } else {
            System.out.println("Tāda krāsa nav luksaforā!");
        }
    }


    static void luksaforsDivi() {
        Scanner scanner = new Scanner(System.in);
        String zals = "zaļš";
        String dzeltens = "Dzeltens";
        String sarkans = "Sarkans";

        System.out.println("Lūdzu ievadi kādu no luksafora krāsām!");
        String krasa = scanner.nextLine();

        boolean isGreen = zals.equals(krasa);
        boolean isYellow = dzeltens.equals(krasa);
        boolean isRed = sarkans.equals(krasa);

        if (isGreen) {
            System.out.println("Ejam");
        } else if (isYellow) {
            System.out.println("Gatvajoamies");
        } else if (isRed) {
            System.out.println("Stāvam");
        } else {
            System.out.println("Luksoforā nav tāda krāsaz");
        }
    }

    static String printBuisnessCardTwo(String name, String surname, String telephone, int dateOfBirth) {
        return "########\nVizītkarte\nVārds: "
                + name +
                "\nUzvārds: "
                + surname +
                "\nTelefona nr: "
                + telephone + "\nDzimšanas gads: "
                + dateOfBirth + "\n##########";
    }


}