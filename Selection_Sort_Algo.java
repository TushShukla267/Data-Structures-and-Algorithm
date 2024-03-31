/**
 * The Selection_Sort_Algo class implements the selection sort algorithm to sort an array of integers
 * in ascending and descending order.
 */
import java.util.Scanner;

public class Selection_Sort_Algo {

    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Length of the array:");
        int n=sc.nextInt();

        int Array[]= new int [n];

        int i;
        for(i=0;i<n;i++)
        {
            Scanner sc1 = new Scanner(System.in);
            System.out.print("Enter the element of the array:");
            Array[i] =sc1.nextInt();
        }
        System.out.println("The Elements of the Array are as follows");
        for(i=0;i<n;i++)
        {
            System.out.println(Array[i]);
        }
        System.out.println("Following is the Sorted Array in Accending Order:");

        Selection_Sort_Asc(Array , n);

        System.out.println("Following is the Sorted Array in Decending Order:");

        Selection_sort_Dec(Array , n);

    }
    
    public static void Selection_Sort_Asc(int [] Array , int n)
    {
        int i;
        int j;
        int min;
        int temp;
        for(i=0;i<n-1;i++)
        {
            min=i;

            for(j=i+1;j<n;j++)
            {
                if(Array[j]<Array[min])
                {
                    min=j;
                }
            }
            if(i != min)
            {
                temp=Array[i];
                Array[i]=Array[min];
                Array[min]=temp;
            }
        }

        for(i=0;i<n;i++)
        {
            System.out.println(Array[i]);
        }
    }

    public static void Selection_sort_Dec(int [] Array , int n)
    {
        int i;
        int j;
        int max;
        int temp;

        for(i=0;i<n-1;i++)
        {
            max=i;

            for(j=i+1;j<n;j++)
            {
                if(Array[j] > Array[max])
                {
                    max=j;
                }
                if(i != max)
                {
                    temp=Array[i];
                    Array[i]=Array[max];
                    Array[max]=temp;
                }
            }
        }

        for(i=0;i<n;i++)
        {
            System.out.println(Array[i]);
        }
    }
}
