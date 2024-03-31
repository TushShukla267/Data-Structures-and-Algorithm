/**
 * The Binary_Search_Algo class implements a binary search algorithm to search for an element in a
 * sorted array.
 */
import java.util.Scanner;

public class Binary_Search_Algo {

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
        for(i=0;i<n-1;i++)
        {
            for(j=0;j<n-i-1;j++)
            {
                if(Array[j]>Array[j+1])
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

        Scanner sc2 = new Scanner(System.in);
        System.out.print("Enter the element you want to find:");
        int element=sc2.nextInt();
        int found=0;
        int low=0;
        int high=n-1;
        while(low<=high)
        {
            int mid;
            mid=(high+low)/2;
            if(element < Array[mid])
            {
                high=mid-1;
            }
            else if(element > Array[mid])
            {
                low=mid+1;
            }
            else if(element == Array[mid])
            {
                System.out.println("The element is found at index:" + mid);
                found=1;
                break;
            }
        }
        if(found == 0)
            {
                System.out.println("The element is not present in the arrray");
                for(i=0;i<n;i++)
                {
                    if(element<Array[i])
                    {
                        System.out.println("The element if it was present would be at index:" + i);
                        break;
                    }
                }
                if(i>=n)
                {
                    System.out.println("The element if it was present would be at index:" + n);
                }
            }
    }
    
}
