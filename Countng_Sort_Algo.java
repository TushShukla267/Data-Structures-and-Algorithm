import java.util.Scanner;

public class Countng_Sort_Algo {

    public static void main(String args[])
    {
        int i;
        int j;
        int max;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Length of the array:");
        int n=sc.nextInt();

        int Array[]= new int [n];

        
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


        for(i=0;i<n;i++)
        {
            max=i;

            for(j=i+1;j<n;j++)
            {
                if(Array[j] > Array[max])
                {
                    max=j;
                }
            }
        }
        System.out.println(max);
    }

    public static void Counting_Sort(int [] Array , int max)
    {
        int Count[] = new int [max+1];
    }
    
}
