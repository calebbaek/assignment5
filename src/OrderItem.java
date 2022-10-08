//generic Order Item
// you need to make subclasses which extend this (e.g. Backpack, Hiking Boots)

public class OrderItem{
    // Instance variables
    public Product product;
    public int quantity;

    // constructor with arguments
    public OrderItem(Product p, int q)  {
        product = p;
        quantity = q;
    }

    //getter method for product
    public Product getProduct(){
        return product;
    }

    //getter method for quantity
    public int getQuantity(){
        return quantity;
    }

    //toString - returns string representation of product
    public String toString(){
        return "Product: " + product.getProductName() + "\tQuantity: " + quantity;
    }
}

