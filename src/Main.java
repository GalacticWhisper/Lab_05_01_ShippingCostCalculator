//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner; //With this line, you've imported the Scanner class! Placed before the class.
public class Main { // This is your Main class.
    public static void main(String[] args)
    {
        // Scanner in = new Scanner(System.in);
        // double = itemPrice; // This is the value that the user will provide.
        // double TAX_RATE = 0.02; // The tax rate is 2%. Thus, we need a constant value of 0.02.
        // String trash = ""; // This variable is for non-double input. Will be read as a string.
        // System.out.print("Enter the price of your item: ");
            //if(in.hasNextDouble()) //This is our if/else statement. If the user provided a double, the input is safe and will be processed accordingly. Otherwise, the program will stop.
        //{
            //itemPrice = in.nextDouble();
            //in.nextLine();
            //if (itemPrice >= 100)
                //{
                    //System.out.print("You entered a value greater than or equal to 100. Hooray for free shipping!")
                //}
            //else
                //{
                    //Calculate the shipping cost for the value, display it, and add it to the itemPrice variable.
        //}
        //else
        //{
        // if the user didn't provide a double, the following code will be executed.
        //trash = in.nextLine(); //This input will be interpreted as a string.
        //System.out.println("The input you provided is " + trash + ", which is not a valid input. Please run the program again and enter a valid number."
        //}

        Scanner in = new Scanner(System.in); //This line creates a new scanner to read from the console.
        double itemPrice; // This is the price value that the user will provide.
        double TAX_RATE = 0.02; //This is the constant tax rate.
        double shippingCost;
        double finalTotal;
        String trash; //If the user provides input that isn't a double, the program will interpret this "trash" variable instead.
            System.out.print("Enter the price of your item: ");
            if(in.hasNextDouble())
            {
                itemPrice = in.nextDouble();
                if(itemPrice >= 100)
                {
                    System.out.print("The price you entered was equal to or over $100, which means shipping is free. Your total is " + itemPrice + ".");
                }
                else
                {
                    shippingCost = itemPrice * TAX_RATE;
                    finalTotal = itemPrice + shippingCost;
                    System.out.print("The shipping cost is 2% of your total, amounting to " + shippingCost + ". Your final total is " + finalTotal + ".");
                }
            }
            else
            {
                trash = in.nextLine();
                System.out.println("The input you provided was " + trash + ", which is not a valid price. Please run the program again and enter a valid price.");
            }

    }
}