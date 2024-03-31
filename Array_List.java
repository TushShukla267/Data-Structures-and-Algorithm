import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Array_List {

    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the lenght of the intial Arraylist:");
        int n=sc.nextInt();
        ArrayList<Integer> List = new ArrayList<Integer>();
        ArrayList<Integer> List1 = new ArrayList<>();

        int i;
        for(i=0;i<n;i++)
        {
            Scanner sc1 = new Scanner(System.in);
            System.out.print("Enter the element you want to enter in the Arraylist:");
            int element=sc1.nextInt();
            List.add(i ,element);
        }

        System.out.println("The element in the ArrayList is:");
        for(i=0;i<List.size();i++)
        {
            System.out.println(List.get(i));
        }

        List1.addAll(List);

        System.out.println("The element after using set");
        List.set(0 , 0);
        System.out.println(List);

        System.out.println("The List after the Sort:");
        Collections.sort(List);
        System.out.println(List);

        List.remove(4);
        System.out.println("The LisT after Deleting the elements is:");
        System.out.println(List);

        System.out.println("Emptying the List");
        List.clear();
        System.out.println(List);

        System.out.println("Copying one list to the other");
        List.addAll(List1);
        System.out.println(List);

        System.out.println("The size of the ArrayList is:" + List.size());
    }
    
}
