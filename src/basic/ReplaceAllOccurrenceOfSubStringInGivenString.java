package basic;

import java.util.Scanner;

public class ReplaceAllOccurrenceOfSubStringInGivenString
{
    public static void main(String[] args)
        {
            Scanner sc= new Scanner(System.in);
            System.out.println("Enter string:");
            String inputString= sc.nextLine();
            System.out.println("Enter word to be replaced from:");
            String from= sc.nextLine();
            System.out.println("Enter word to replaced to:");
            String to= sc.nextLine();
            System.out.println("Input string: "+inputString);
            System.out.println("Word to be replaced from: "+from);
            System.out.println("Word to be replaced to: "+to);
            String replacedString = replaceMethod(inputString, from, to);
            System.out.println(replacedString);
        }

        static String replaceMethod(String str, String from, String to)
        {
                // We will split string array using wordToBeReplaced. Splitter word will not be stored.
            String[] arr = str.split(from);

            StringBuilder output = new StringBuilder();

                //Concatenating new word in last of word of each index except last index
                // We can not add new word for last indexed word as we are not sure we need to add or not.

            int i = 0;
            for (; i < arr.length - 1; i++)
            {
                output.append(arr[i]).append(to);
            }

            output.append(arr[i]);


                // Verifying if last word of given string is similar to word to be replaced/
                // If yes, then append new word otherwise don't.
            if(str.substring((str.length()-from.length()),str.length()).equals(from))
            {
                output.append(to);
            }

            return output.toString();
        }

    }
