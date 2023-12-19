import java.util.Scanner;
import java.io.File;
import java.io.IOException;
import java.io.FileWriter;
import java.io.FileNotFoundException;
public class Main {
    public static void main(String[] args) {
        boolean loop=true;
        while(loop) {

            Scanner Obj1 = new Scanner(System.in);
            System.out.println("Welcome dear user! Please choose an option from the list in the menu below(a/b/c):");
            System.out.println("a) Enter your age");
            System.out.println("b) Enter numbers into an array and send to text file");
            System.out.println("c) Print text file");
            System.out.println("Enter your choice here:");
            String choice = Obj1.nextLine();  // Read user input


            switch (choice) {
                case "a", "A", "b", "B", "c", "C":
                    System.out.println("You chose " + choice);
                    break;
                default:
                    System.out.println("INVALID INPUT! Try again...");
                    break;

            }

            if(choice.equals("a") || choice.equals("A"))
            {
                Scanner Obj2 = new Scanner(System.in);
                System.out.println("Please enter in your age:");
                String age = Obj2.nextLine();
                int Age = Integer.parseInt(age);
                if(Age<18)
                {
                    System.out.println("You are too young!");
                }

            }
            else if (choice.equals("b") || choice.equals("B"))
            {
                Scanner Obj3 = new Scanner(System.in);
                System.out.println("Please enter the number of elements you want in the array:");
                String number = Obj3.nextLine();

                int Number = Integer.parseInt(number);

                int [] randomnumbers = new int[Number];

                for (int i=0;i< randomnumbers.length; i++)
                {
                    Scanner Obj4 = new Scanner(System.in);
                    System.out.println("Please enter in an element:");
                    String element = Obj4.nextLine();

                    int Element = Integer.parseInt(element);
                    randomnumbers[i] = Element;
                }

                try {
                    File myObj = new File("ArrayValues.txt");
                    if (myObj.createNewFile()) {
                        System.out.println("File created: " + myObj.getName());
                    } else {
                        System.out.println("File already exists.");
                    }
                } catch (IOException e) {
                    System.out.println("An error occurred.");
                    e.printStackTrace();
                }

                try {
                    FileWriter myWriter = new FileWriter("ArrayValues.txt");
                    for (int i =0; i< randomnumbers.length; i++)
                            {   if(i== randomnumbers.length-1)
                                {
                                    myWriter.write(randomnumbers[i] + " ");
                                }
                                else
                            {myWriter.write(randomnumbers[i] + "; ");}

                            }
                    myWriter.close();
                    System.out.println("Successfully wrote to the file.");
                } catch (IOException e) {
                    System.out.println("An error occurred.");
                    e.printStackTrace();
                }

            }
            else if(choice.equals("c") || choice.equals("C"))
            {
                try {
                    File myObj = new File("ArrayValues.txt");
                    Scanner myReader = new Scanner(myObj);
                    while (myReader.hasNextLine()) {
                        String data = myReader.nextLine();
                        System.out.println(data);
                    }
                    myReader.close();
                } catch (FileNotFoundException e) {
                    System.out.println("An error occurred.");
                    e.printStackTrace();
                }
            }

            Scanner Obj5 = new Scanner(System.in);
            System.out.println("Would you like to go again? (Yes/No):");
            String CarryOn = Obj5.nextLine();


            if(CarryOn.equalsIgnoreCase("yes"))
            {
                loop = true;
            }
            else if(CarryOn.equalsIgnoreCase("no"))
            {
                loop = false;
            }
            else{
                System.out.println("INVALID INPUT! System exiting...");
                loop =  false;
            }
        }

    }
}