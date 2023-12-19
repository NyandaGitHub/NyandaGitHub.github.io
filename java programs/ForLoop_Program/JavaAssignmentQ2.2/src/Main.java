import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

         int totalvalue = 0;

     for (int i=1; i<7;i++) {
         Scanner Obj1 = new Scanner(System.in);
         System.out.println("Please input a value between 2 and 10:");
         String value = Obj1.nextLine();  // Read user input

         int Value = Integer.parseInt(value);
         totalvalue += Value;

         totalvalue = totalvalue * i;

         System.out.println("The total value for this iteration is " + totalvalue);
         System.out.println("             ");



     }


    }
}