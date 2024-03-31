/**
 * The Bubble_Sor_Algo class implements the bubble sort algorithm to sort an array of integers in
 * ascending and descending order.
 */
import java.util.Scanner;

public class Bubble_Sor_Algo {

    public static void main(String args[])
    {
        //Taking the lenght of the Array as input from the user 
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
        int flag;
        for(i=0;i<n-1;i++)
        {
            flag=0;
            for(j=0;j<n-i-1;j++)
            {
                if(Array[j]>Array[j+1])
                {
                   temp=Array[j];
                   Array[j]=Array[j+1];
                   Array[j+1]=temp;
                   flag=1;
                }
                if(flag ==0)
                {
                    break;
                }
            }
        }

        System.out.println("The Elements of the Sorted Array in Accending order is are as follows");
        for(i=0;i<n;i++)
        {
            System.out.println(Array[i]);
        }

        for(i=0;i<n-1;i++)
        {
            for(j=0;j<n-i-1;j++)
            {
                if(Array[j]<Array[j+1])
                {
                   temp=Array[j];
                   Array[j]=Array[j+1];
                   Array[j+1]=temp;
                }
            }
        }

        System.out.println("The Elements of the Sorted Array in Accending order is are as follows");
        for(i=0;i<n;i++)
        {
            System.out.println(Array[i]);
        }
    }
    
}

