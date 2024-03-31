/**
 * The above class allows the user to create an array, traverse the array, replace an element at a
 * specific index, and delete an element at a specific index.
 */
import java.util.Scanner;

public class Arrays {

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
        System.out.println("The Array has been entered");

        while(i<10)
        {
            System.out.println("1.Press 1 to Traverse the Array");
            System.out.println("2.Press 2 to Replaced the element at the particular index ");
            System.out.println("3.Press 3 to Delete the element at the particular index");
            System.out.print("Enter Your choice here:");
            Scanner sc2 = new Scanner(System.in);
            int ch=sc2.nextInt();
            switch(ch)
           {
            case 1:Traverse(Array , i , n);
                   break;
                
            case 2:Replaced(Array);
                   break;
                   
            case 3:Delete(Array , i , n);   
                   break;

            }
        }
    }

    public static void Traverse(int [] Array , int i , int n)
    {
        System.out.println("The Elements of the Array are as follows");
        for(i=0;i<n;i++)
        {
            System.out.println(Array[i]);
        }
    }

    public static void Replaced(int [] Array)
    {
        Scanner sc3 = new Scanner(System.in);
        System.out.print("Enter the index at which you want to Replaced the element:");
        int element_index=sc3.nextInt();

        Scanner sc4 = new Scanner(System.in);
        System.out.print("Enter the element you want to Replaced:");
        int element=sc4.nextInt();

        Array[element_index]=element;

        System.out.println("The element has been Replaced");
    }

    public static void Delete(int [] Array , int i , int n)
    {
        Scanner sc3 = new Scanner(System.in);
        System.out.println("Enter the index at which you want to Delete the element:");
        int element_index=sc3.nextInt();
        System.out.println("The element " + Array[element_index] + " will be Deleted ");
        for(i=element_index;i<n-1;i++)
        {
            Array[i]=Array[i+1];
        }
        
    }
    
}
