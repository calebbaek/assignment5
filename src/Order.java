import java.util.*;

public class Order implements Calculate
{
    private int orderNumber;
    private ArrayList<OrderItem> orderItems;

    public Order(ArrayList<OrderItem> oi, int on){
        orderItems = oi;
        orderNumber = on;
    }

    public String summarize(){
        for (int i=0; i < orderItems.size(); i++) {
            System.out.println("Order " + (i+1) + ": " + orderItems.get(i));
        }

        //get the profit or loss amount of the order
        int profit = 0; //calculation

        for (int i = 0; i < orderItems.size(); i++){
            Product p = orderItems.get(i).getProduct();
            int q= orderItems.get(i).getQuantity();
            profit += p.getPrice()*q - p.getCost()*q;
        }

        //return a statement that describes the profit or loss
        if (profit > 0)
            return "The company has made a profit of " + profit + " dollars";
        else
            return "The company has lost " + (-profit) + " dollars";
    }
}