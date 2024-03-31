import java.util.*;
public class AdvRecursion_PrintPermutationString {

    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the String with Duplicate characters:   ");
        String str = sc.nextLine();

        String Permutation="";
        int index=0;
    }

    public static void PrintPermutationsString(String str , int index , String Permutation)
    {
        if(index == str.length())
        {
            System.out.println(Permutation);
            return;
        }
        int i;
        for(i=0;i<str.length();i++)
        {
            
        }
    }

}