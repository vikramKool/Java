package basic;

import java.util.Scanner;

public class FindDivisorLogic3
{
         // A method of finding and printing divisor
    static void findAndPrintDivisors(int n)
    {
        int maxD = (int)Math.sqrt(n);
        for (int i=1; i<=maxD; i++)
        {
            if (n%i==0)
            {
                // If divisors are equal, print only one
                if (n/i == i)
                    System.out.print(i);

                    // Otherwise print both
                else
                {
                    System.out.print(i +" ");
                    System.out.print(n/i+" ");
                }
            }
        }
    }


    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Please enter the number greater than zero:");
        int num= sc.nextInt();
        System.out.println("The divisors of "+num+" are: ");
        findAndPrintDivisors(num);
    }
}
