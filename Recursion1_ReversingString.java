import java.util.Scanner;

public class Recursion1_ReversingString {

    public static void main(String arg[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter you name:");
        String name = sc.nextLine();
        int index = name.length()-1;

        Print_rev_name(name, index);
    }

     //to print String in reverse
    public static void Print_rev_name(String name , int index)
    {
        if(index == 0)
        {
            System.out.print(name.charAt(index));
            return;
        }
        System.out.print(name.charAt(index));

        Print_rev_name(name, index-1);
    }
}
