package homework.classHomework;

public class Main {
    public static void main(String[] args) {

        Triangle triangle1 = new Triangle();
        triangle1.a = 3;
        triangle1.b = 5;
        triangle1.c = 3;

        System.out.println("Trīsstūra laukums ir: " + triangle1.Area());
        System.out.println("Vai trīsstūris ir vienādmalu? "+ triangle1.isEquilateral());
        System.out.println("Vai trīsstūris ir vienādsānu? " + triangle1.isEquilateral());


        System.out.println("\n");
        Triangle triangle2 = new Triangle(4,4,4);
        System.out.println("Vai trīsstūris ir vienādmalu? " + triangle2.isEquilateral());
        System.out.println("Vai trīsstūris ir vienādsānu? " + triangle2.isIsosceles());
    }

}
