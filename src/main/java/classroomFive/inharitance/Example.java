
package clasroomFive.inheritance;

public class Example {
    public static void main(String[] args) {
        Dog dog1 = new Dog(4, "Reksis");
        Animal dog2 = new Dog(4,"Lesija");


        Octopus octopus1 = new Octopus(8, "Astoņkājis");

        dog1.printLegCount();
        octopus1.printLegCount();

        Chicken vista = new Chicken(2, "Baltā vista");
        Chicken vistaArVienuKaju = new Chicken(1, "Melnā vista ar vienu kāju");

        vista.printLegCount();
        vistaArVienuKaju.printLegCount();
        Animal dzivnieks = new Animal(4,"Dzīvnieks");
        System.out.println(octopus1.waterType);
        octopus1.printWaterType();
        dzivnieks.printLegCount();

        Fox lapsa = new Fox("Kūmiņš",4);

        int[] ieluNumuri = {1, 2, 3, 4, 5, 6};
        Animal[] dzivnieki = {dog1, octopus1, vista, vistaArVienuKaju,dzivnieks};

        for (int i = 0; i < dzivnieki.length; i++) {
            dzivnieki[i].printLegCount();
        }

        dog1.makeSound();
        vista.makeSound();
        octopus1.makeSound();

    }
}