public class Product{
    // Instance variables
    private String productName;
    private double price;
    private double cost;

    // constructor with arguments
    public Product(String pn, double p, double c)  {
        productName = pn;
        price = p;
        cost = c;
    }

    //put in getPrice, getCost
    public double getPrice(){
        return price;
    }
    public void setPrice(double p){
        price = p;
    }
    public double getCost(){
        return cost;
    }
    public void setCost(double c){
        cost = c;
    }

    public String getProductName(){
        return productName;
    }

    // toString method to return company information as a String
    public String toString(){
        return "Order: " + productName;
    }
}
