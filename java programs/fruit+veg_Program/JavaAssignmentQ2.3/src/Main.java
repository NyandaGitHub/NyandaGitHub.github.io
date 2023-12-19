import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        boolean loop = true;
        int TOTAL = 0;
       while (loop)
       {

           Scanner Obj1 = new Scanner(System.in);
           System.out.println("Please enter product (fruit/veg) name:");
           String name = Obj1.nextLine();

           Scanner Obj2 = new Scanner(System.in);
           System.out.println("Please enter the price per quantity of this product (R):");
           String price = Obj2.nextLine();

           int Price = Integer.parseInt(price);

           Scanner Obj3 = new Scanner(System.in);
           System.out.println("Please enter the quantity of the product being purchased:");
           String quanitiy = Obj3.nextLine();
           int Quantity = Integer.parseInt(quanitiy);

           Scanner Obj4 = new Scanner(System.in);
           System.out.println("Would you like to add another product? (yes/no):");
           String choice = Obj4.nextLine();

           if(choice.equalsIgnoreCase("yes"))
           {
               loop=true;
               int totalprice = Price*Quantity;
               TOTAL+=totalprice;
           }
           else if (choice.equalsIgnoreCase("no"))
           {
               loop=false;
               int totalprice = Price*Quantity;
               TOTAL+=totalprice;

               System.out.println("The total price is going to be R" + TOTAL);
           }

       }

    }
}