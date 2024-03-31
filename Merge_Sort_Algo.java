import java.util.Scanner;

public class Merge_Sort_Algo {

    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the lenght of the Array:");
        int n=sc.nextInt();

        int Array[] = new int[n];

        int i;
        for(i=0;i<n;i++)
        {
            System.out.print("Enter the element in the Array:");
            Array[i]=sc.nextInt();
        }

        int lower_bound=0;
        int upper_bound=n-1;

        Merge_Sort(Array , lower_bound , upper_bound , n);

        System.out.println("The sorted Array is:");
        for(i=0;i<n;i++)
        {
            System.out.println(Array[i]);
        }
    }

    public static void Merge_Sort(int[] Array, int lower_bound, int upper_bound , int n) {
        if (lower_bound < upper_bound) {
            int mid = (lower_bound + upper_bound) / 2;
    
            Merge_Sort(Array, lower_bound, mid , n);
            Merge_Sort(Array, mid + 1, upper_bound , n);
    
            Merge(Array, lower_bound, mid, upper_bound , n);
        }
    }
    

    public static void Merge(int[] Array , int lower_bound , int mid , int upper_bound , int n)
    {
        int Array1[] = new int [n];

        int i=lower_bound;
        int j=mid+1;
        int k=lower_bound;

        while(i<=mid && j<=upper_bound)
        {
            if(Array[i] < Array[j])
            {
                Array1[k]=Array[i];
                i++;
            }
            else
            {
                Array1[k]=Array[j];
                j++;
            }
            k++;
        }
        if(i<=mid)
        {
            while(j<=upper_bound)
            {
                Array1[k]=Array[j];
                j++;
                k++;
            }
        }
        else
        {
            while(i<=mid)
            {
                Array1[k]=Array[i];
                i++;
                k++;
            }
        }
        
        for(k=lower_bound;k<=upper_bound;k++)
        {
            Array[k]=Array1[k];
        }
    }
    
}
