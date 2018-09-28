package basic;
import java.util.Scanner;

public class PalindromeNumber
{
    public static void main(String[] args)
        {
                // Taking input from user
            Scanner sc = new Scanner(System.in);
            System.out.println("Please input the number to find if it is  palindrome or not:");
            int inputByUser = sc.nextInt();
            System.out.println("Input Number to be checked for palindrome: " + inputByUser);

                // Closing input stream
            sc.close();

                // Copy input number to a temporary variable to keep original value intact
            int temp = inputByUser;
            int revNumber = 0;

                 // checking if number is negative
            if (inputByUser < 0)
            {
                System.out.println("Negative number.Enter positive number.");
                System.exit(1);
            }
                // checking if number is single digit only
            else
                if (inputByUser >= 0 && inputByUser <= 9)
                {
                System.out.println(inputByUser + " is palindrome as it is single digit number.");
                System.exit(1);
                }
            else {
                while (temp > 0)
                {
                    // extracting last digit of number
                    int rem = temp % 10;
                    // forming number
                    revNumber = revNumber * 10 + rem;
                    // removing last digit from number
                    temp = temp / 10;
                }

                System.out.println("Input By User:" + inputByUser);
                System.out.println("Reverse number:" + revNumber);

                // Comparing if input number and reversed number are same
                if (inputByUser == revNumber)
                {
                    System.out.println(inputByUser + " is a Palindrome Number");
                }
                else {
                    System.out.println(inputByUser + " is not a Palindrome Number");
                }
            }
        }
    }


