import java.util.Scanner;

public class Solution {

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

         int j=0;
         if(j == n)
    {
        while(Array[j] != 0)
        {
            j=j+Array[j];
        }
    }

        if(j == n)
        {
            System.out.println("The array end is reached");
        }
        else
        {
             System.out.println("The array end can not be reached");
        }
        
    }
}