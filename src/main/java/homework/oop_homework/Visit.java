package homework.oop_homework;

import java.util.Date;

public class Visit {
    private Customer customer;
    private Date date;
    private double serviceExpense;
    private double productExpense;


    public Visit(Customer customer, Date date){
        this.customer = customer;
        this.date = date;

    }
    public String getName(){
        return customer.getName();

    }

    public double getServiceExpense(){
        return serviceExpense;

    }
    public double getProductExpense(){
        return productExpense;

    }

    public void setServiceExpense (double serviceExpense){
        this.serviceExpense = serviceExpense;

    }

    public void setProductExpense (double productExpense){
        this.productExpense = productExpense;

    }

    public double getTotalExpense(){
        return getProductExpense() + getServiceExpense();

    }

    @Override

    public  String toString(){
        return "Visit{" +
                ",Customer = " + customer.getName() +
                ",date = " + date +
                ",serviceExpense = " + serviceExpense +
                ",productExpense = " + productExpense +
                '}';

    }

}
