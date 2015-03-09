

package classeslab;

public class Product {
    private String name;
    private double price;
    public Product(String nam, double pri){
        name = nam;
        price = pri;
    }
    public String getName(String nam){
        return nam;
    }
    public double getPrice(double pri){
        return pri;
    }
    public double reducePrice(){
        return price - 5;
    }
}