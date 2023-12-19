import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        boolean loop = true;

        int totalhours = 0;
        while (loop) {
            Scanner Obj1 = new Scanner(System.in);
            System.out.println("Enter a number (1-7) representing a day of the week:");

            String Day = Obj1.nextLine();  // Read user input
            String day;
            switch (Day) {
                case "1":
                    System.out.println("You selected: Monday");
                    day = "Monday";
                    break;
                case "2":
                    System.out.println("You selected: Tuesday");
                    day = "Tuesday";
                    break;
                case "3":
                    System.out.println("You selected: Wednesday");
                    day = "Wednesday";
                    break;
                case "4":
                    System.out.println("You selected: Thursday");
                    day = "Thursday";
                    break;
                case "5":
                    System.out.println("You selected: Friday");
                    day = "Friday";
                    break;
                case "6":
                    System.out.println("You selected: Saturday");
                    day = "Saturday";
                    break;
                case "7":
                    System.out.println("You selected: Sunday");
                    day = "Sunday";
                    break;
                default:
                    day = "that particular day";
                    break;

            }

            Scanner Obj2 = new Scanner(System.in);
            System.out.println("Enter the number of hours you worked on " + day +":");

            String hours = Obj2.nextLine();  // Read user input
            double a = Integer.parseInt(hours);
            System.out.println("On " + day + ", you worked " + a + " hours");
            totalhours += Integer.parseInt(hours);

            double b = totalhours;
            System.out.println("Total hours worked so far: " + b);

            Scanner Obj3 = new Scanner(System.in);
            System.out.println("Do you want to check another day? (y/n): ");

            String check = Obj3.nextLine();  // Read user input

            switch (check)
            {
                case "Y", "y":
                    loop=true;
                    break;
                case "N", "n":
                    loop=false;
                    System.out.println("The program is exiting...");
                    break;
                default:
                    loop=false;
                    System.out.println("The program is exiting...");
                    System.exit(0);
                    break;
            }
        }
    }
}