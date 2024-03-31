/**
 * The above Java class implements a linear search algorithm to find a given element in an array.
 */
import java.util.Scanner;

public class Linear_Searching_Algo {

    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the length of the Array:");
        int n=sc.nextInt();

        int Array[]=new int[n];
        int i;
        for(i=0;i<n;i++)
        {
            System.out.print("Enter the element of the array:");
            Scanner sc1=new Scanner(System.in);
            Array[i]=sc1.nextInt();
        }
        System.out.println("The Elements of the Array are as follows:");
        for(i=0;i<n;i++)
        {
            System.out.println(Array[i]);
        }

        Scanner sc2=new Scanner(System.in);
        System.out.println("Enter the number you want to find in the array:");
        int element=sc2.nextInt();
        int found=0;
        for(i=0;i<n;i++)
        {
            if(Array[i] == element)
            {
                System.out.println("Element found at index:" + i);
                found=1;
            }
        }
         if(found != 1)
            {
                System.out.println("The element was not found in the array");
            }

    }
    
}
