//to check if Array is Strictly increasing or decreasing or not
import java.util.Scanner;

public class Recursion2_StrictlyIncDecArray {

    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length of the Array:");
        int n=sc.nextInt();
        int index=0;
        int Array[] = new int[n];

        int i;
        for(i=0;i<n;i++)
        {
            System.out.print("Enter the Element in the Array:");
            Array[i]=sc.nextInt();
        }
        
        System.out.println("The entered Array is:");
        for(i=0;i<n;i++)
        {
            System.out.println(Array[i]);
        }

        if(Srictly_increasing(Array , index))
        {
            System.out.println("The Array is Strictly increasing");
            System.out.println("The Array is sorted in strictly incresing");
        }

        else if(Strictly_decreasing(Array , index))
        {
            System.out.println("The Array is Strictly decreasing");
            System.out.println("The Array is sorted in strictly decreasing");
        }
        else
        {
            System.out.println("Array is either Strictly increasing nor is it Strictly decreasing");
        }
        
    }
//function to check if Array is Strictly increasing 
    public static boolean Srictly_increasing(int Array[] , int index)
    {
        if(index == Array.length-1)
        {
            return true;
        }
        if(Array[index] < Array[index+1])
        {
            return Srictly_increasing(Array, index+1);
        }
        else
        {
            System.out.println("The Array is Strictly increasing upto " + (index-1));
            return false;
        }
    }
//function to check if Array is strictly decreasing 
    public static boolean Strictly_decreasing(int Array[] , int index)
    {
        if(index == Array.length-1)
        {
            return true;
        }
        if(Array[index] > Array[index+1])
        {
            return Strictly_decreasing(Array, index+1);
        }
        else
        {
            System.out.println("The Array is Strictly decreasing upto " + (index-1));
            return false;
        }
    }
    
}
