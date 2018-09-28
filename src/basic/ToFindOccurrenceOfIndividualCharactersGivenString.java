package basic;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;


public class ToFindOccurrenceOfIndividualCharactersGivenString
{

        /**
         * @param inputString
         * @return Map<Character, Integer>
         * This method will save all char in a Map.
         */

        public Map<Character, Integer> getCountOfChar(String inputString)
        {
            Map<Character, Integer> charDictionary = new HashMap<Character, Integer>();

                 // converting given string in to lower case
            String inoutCharInLowerCase=inputString.toLowerCase();

                // Converting string in to char array
            char[] chrsInString = inoutCharInLowerCase.toCharArray();

                // iterating char array
            /*
             * Map stores as key and value pairs where key should be unique.
             * We will consider character as a key. If key does not exists, we will add
             * in to key with value 1. If key exists, we will just increment the value by one.
             */
            for(Character ch:chrsInString){
                if(charDictionary.containsKey(ch)){
                    charDictionary.put(ch, charDictionary.get(ch)+1);
                } else {
                    charDictionary.put(ch, 1);
                }
            }
            return charDictionary;

        }

         /**
         * @param charCountMap
         * This method will print all characters with number of occurrence in a string.
         * If char is white space, it will be shown as "White space".
         */
        public void printCharWithCount(Map<Character,Integer> charCountMap)
        {
            Set<Character> keys = charCountMap.keySet();
            for(Character ch:keys)
            {
                if(ch==' ')
                {
                    System.out.println("White space" +" = "+charCountMap.get(ch));
                }
                else
                {
                    System.out.println(ch +" = "+charCountMap.get(ch));
                }
            }
        }

        /**
         * @param charCountMap
         * This method can be used to print duplicate characters in a given string.
         */
        public void printDuplicateCharsWithOccurance(Map<Character,Integer> charCountMap)
        {
            System.out.println("Duplicate characters are:");
            Set<Character> keys = charCountMap.keySet();
            for(Character ch:keys)
            {
                if(!(ch==' '))
                {
                    if(charCountMap.get(ch) > 1)
                    {
                        System.out.println(ch);
                    }
                }
            }

        }

        public static void main(String a[])
        {
            Scanner sc= new Scanner(System.in);
            System.out.println("Please provide a string to get count of characters: ");
            String inputString= sc.nextLine();
            ToFindOccurrenceOfIndividualCharactersGivenString object = new ToFindOccurrenceOfIndividualCharactersGivenString();
            Map<Character, Integer> map= object.getCountOfChar(inputString);
            object.printCharWithCount(map);
            object.printDuplicateCharsWithOccurance(map);
        }
}

