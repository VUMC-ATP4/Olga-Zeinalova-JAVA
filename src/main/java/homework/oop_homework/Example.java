package homework.oop_homework;

import java.util.Date;

public class Example {
    public static void main(String[] args) {


        Customer klients1 = new Customer("Olga");
        klients1.setMember(true);
        klients1.getMemberType("Premium");
        System.out.println(klients1.toString());

        Customer klients2 = new Customer("Zane");
        klients2.setMember(true);
        klients2.setMemberType("Gold");
        System.out.println(klients2.toString());

        Customer klients3 = new Customer("Baiba");
        klients3.setMember(true);
        klients3.setMemberType("Silver");
        System.out.println(klients3.toString());

        Customer klients4 = new Customer("Nauris");
        klients4.setMember(false);
        System.out.println(klients4.toString());


        Visit apmeklejums1 = new Visit(klients1, new Date());
        Visit apmeklejums2 = new Visit(klients2, new Date());
        Visit apmeklejums3 = new Visit(klients3, new Date());
        Visit apmeklejums4 = new Visit(klients4, new Date());

    apmeklejums1.setServiceExpense(20);
    apmeklejums2.setProductExpense(10);
        System.out.println(apmeklejums1.getTotalExpense());

        apmeklejums2.setServiceExpense(20);
        apmeklejums2.setProductExpense(10);
        System.out.println(apmeklejums2.getTotalExpense());

        apmeklejums3.setServiceExpense(20);
        apmeklejums3.setProductExpense(10);
        System.out.println(apmeklejums3.getTotalExpense());

        apmeklejums4.setServiceExpense(20);
        apmeklejums4.setProductExpense(10);
        System.out.println(apmeklejums4.getTotalExpense());

        System.out.println(apmeklejums1);
        System.out.println(apmeklejums2.toString());
        System.out.println(apmeklejums3.toString());
        System.out.println(apmeklejums4.toString());

    }

}
