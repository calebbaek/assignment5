import java.util.*;

public class Main //CompanyDriver
{

    public static int ordersNum = 0;

    public static void main(String[] args)
    {
        //declare Scanner
        Scanner scanner = new Scanner(System.in);

        //Prompt for prices of items
        System.out.print("Welcome to the profit and loss calculator \nConfigure Hiking Boots: \nSelling price:80.00\nCost to company:60.00\n\nConfigure Back Packs:\nSelling price:50.00\nCost to company:40.00\n\nConfigure Water Bottles:\nSelling price:20.00\nCost to company:10.00\n");

        //Prompt for number of employees
        System.out.print("How many orders will you be entering?  ");

        ordersNum = scanner.nextInt();

        scanner.nextLine();

        ArrayList<OrderItem> items = new ArrayList<OrderItem>();

        for (int i=1; i <= ordersNum; i++){

            System.out.println("Order " + i + " - which product?");
            String productName = scanner.nextLine();

            System.out.println("Order " + i + " - quantity?");
            int quantity = scanner.nextInt();

            scanner.nextLine();

            //if the user enters "backpack"
            if (productName.equals("backpack")){
                OrderItem oi = new OrderItem(new BackPack("back pack"), quantity);
                items.add(oi);
            }

            //else if the user enters "water bottle"
            else if (productName.equals("water bottle")){
                OrderItem oi = new OrderItem(new WaterBottle("water bottle"), quantity);
                items.add(oi);
            }

            //if the user enters "hiking boots"
            if (productName.equals("hiking boots")){
                OrderItem oi = new OrderItem(new HikingBoot("hiking boots"), quantity);
                items.add(oi);
            }
        }

        Order o = new Order(items, 0);
        System.out.println(o.summarize());
    }
}