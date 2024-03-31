/**
 * The Insertion_Sort_Algo class takes user input for an array, sorts it in ascending and descending
 * order using the insertion sort algorithm, and then prints the sorted arrays.
 */
import java.util.Scanner;

public class Insertion_Sort_Algo {

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

        int j;
        int temp;
        for(i=1;i<n;i++)
        {
            temp=Array[i];
            j=i-1;
            while(j>=0 && Array[j]>temp)
            {
                Array[j+1]=Array[j];
                j--;
            }
            Array[j+1]=temp;
        }
        System.out.println("The Elements of the Sorted Array in Accending order is are as follows");
        for(i=0;i<n;i++)
        {
            System.out.println(Array[i]);
        }

        for(i=1;i<n;i++)
        {
            temp=Array[i];
            j=i-1;
            while(j>=0 && Array[j]<temp)
            {
                Array[j+1]=Array[j];
                j--;
            }
            Array[j+1]=temp;
        }
        
        System.out.println("The Elements of the Sorted Array in Decending  order is are as follows");
        for(i=0;i<n;i++)
        {
            System.out.println(Array[i]);
        }
    }
    
}
