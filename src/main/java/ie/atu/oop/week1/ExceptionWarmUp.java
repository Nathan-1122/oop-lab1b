package ie.atu.oop.week1;


import java.util.Scanner;

public class ExceptionWarmUp
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        boolean valid = false;

        while (!valid)
        {
            System.out.print("Enter a pagecount: ");
            String text = scan.nextLine();
            try
            {
                int pagecount = Integer.parseInt(text);
                System.out.print("You entered: " + text);
                valid = true;
            } catch (NumberFormatException error)
            {
                System.out.println("Invalid input " + error.getMessage());
            }
        }
    }
}
