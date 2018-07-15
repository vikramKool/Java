package languageFundamentals;

public class $0007_Data_Types_Boolean
{
    public static void main(String...args)
    {
        boolean a=true;

        //boolean b=0; //CTE-->Incompatible types. Found: 'int', required: 'boolean'

        //boolean c=True; //CTE-->Cannot resolve symbol 'True'
                            //symbol:Variable True
                            //location:Class $07_Data_Types_Boolean

        //boolean d="true"; //CTE-->Incompatible types. Found: 'java.lang.String', required: 'boolean'

        /*-------------------New Example-------------------



        int x=0;

        if (x) //CTE:- Incompatible types. Found: 'int', required: 'boolean'
        {
            System.out.print("Hello");
        }
        else
        {
            System.out.print("Hi");
        }

        */

        /*-------------------New Example-------------------

        while (1)//CTE:- Incompatible types. Found: 'int', required: 'boolean'
        {
            System.out.print("Hello");
        }

        */


    }
}
