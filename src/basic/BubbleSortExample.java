package basic;

public class BubbleSortExample
{
    static void bubbleSort(int[] arr)
    {
        int n = arr.length;
        System.out.println("Array length n ="+n);
        int temp = 0;
        for(int i=0; i < n; i++)
        {
            System.out.println("0.i ="+i);
            for(int j=1; j < (n-i); j++)
            {
                int k=n-i;
                System.out.println("1.j = "+ j);
                System.out.println("2.n-i = "+k);
                if(arr[j-1] > arr[j])
                {
                    System.out.println("3.arr[j-1] ="+arr[j-1]);
                    System.out.println("4.arr[j] ="+j);

                    //swap elements
                    temp = arr[j-1];
                    System.out.println("5.temp ="+temp);
                    System.out.println("6.arr[j-1]"+arr[j-1]);

                    arr[j-1] = arr[j];
                    System.out.println("7.arr[j-1]"+arr[j-1]);
                    System.out.println("8.arr[j] ="+j);

                    arr[j] = temp;
                    System.out.println("9.arr[j] ="+j);
                    System.out.println("10.temp ="+temp);

                    System.out.println();
                    System.out.println("-------------------------------");

                }

            }
        }

    }
    public static void main(String[] args)
    {
        int arr[] ={3,60,35,2,45,320,5};

        System.out.println("Array Before Bubble Sort");
        for(int i=0; i < arr.length; i++)
        {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        bubbleSort(arr);//sorting array elements using bubble sort

        System.out.println("Array After Bubble Sort");
        for(int i=0; i < arr.length; i++)
        {
            System.out.print(arr[i] + " ");
        }

    }

}
