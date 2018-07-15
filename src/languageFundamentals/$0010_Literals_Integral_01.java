package languageFundamentals;

public class $0010_Literals_Integral_01
{
    public static void main(String...args)
    {
        System.out.println("New Example -- 0");

        int x=10;
        System.out.println(x);//10

        //int y= 0786;  //CTE:- integer number too large: 0786
        //octal decimal only allows till 0 to 7 integer

        int z=0777; //  This is octal decimal Form
        System.out.println(z);//511

        int w=0XFace;// This is hexa-decimal Form
        System.out.println(w);//64206

        int u=0XBeef;// This is hexa-decimal Form
        System.out.println(u);//48879

        //int v=0XBeer;// CTE:- ';' expected. Cannot resolve symbol 'r'.
                    // Hexa-decimal will accept only 0 - 9 and a to f characters only
       // System.out.println(v);

        System.out.println("New Example -- 02");

        int i=10;//Decimal Form

        int j=010;//Octal Form 

        int k=0X10;//Hexa-decimal Form

        System.out.println(i+"..."+j+"..."+k);
        //Output:- 10...8...16


        // Programmer having a option to specify in decimal, octal and Hexa-decimal form, but while printing JVM will print in decimal form




    }
}
