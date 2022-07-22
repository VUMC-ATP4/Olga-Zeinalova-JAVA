package homework.oop_homework;

public class DiscountRate {
    private double serviceDiscountPremium = 0.2;
    private double serviceDiscountGold = 0.15;
    private double serviceDiscountSilver = 0.1;

    private double productDiscountPremium = 0.1;
    private double productDiscountGold = 0.1;
    private double productDiscountSilver = 0.1;

    public double getServiceDiscountRate(String type){
        switch (type.toUpperCase()){
            case "Premium" : return serviceDiscountPremium;
            case "Gold" : return serviceDiscountGold;
            case "Silver" : return serviceDiscountSilver;
        }
        return 0;

    }

    public double getProductsDiscountRate(String type){
        switch (type.toUpperCase()){
            case "Premium" : return productDiscountPremium;
            case "Gold" : return productDiscountGold;
            case "Silver" : return productDiscountSilver;
        }
        return 0;
    }

}
