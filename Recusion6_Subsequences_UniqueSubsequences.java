import java.util.HashSet;
import java.util.Scanner;

//Subsequences are basically substrings but in order like subsequences of the string abc will be a , b , c , ab , ac , abc and so on
//Unique Subsequences , if given subsequence is aaa the unique subsequence will be aaa , aa , a

public class Recusion6_Subsequences_UniqueSubsequences {

    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the String with Duplicate characters:   ");
        String str = sc.nextLine();

        String New_str="";
        int index=0;
        
        System.out.println("The subsequences is:");
        Subsequences(str, index, New_str);

        HashSet<String> set = new HashSet<String>();
        System.out.println("The Unique subsequences is:");
        UniqueSubsequences(str, index, New_str, set);

    }

    public static void Subsequences(String str , int index , String New_str)
    {
    //basically while adding a character in a subsequence it has two choices first it will be a part of the subsequence or it will not be
        if(index == str.length())
        {
            System.err.println(New_str);
            return;
        } 
       
        // to be part of the subsequence
        char current_char = str.charAt(index);
        Subsequences(str, index+1, New_str + current_char);

        // not to be part of 
        Subsequences(str, index+1, New_str);
    }
    
    public static void UniqueSubsequences(String str , int index , String New_str , HashSet<String> set)
    {
         if(index == str.length())
        {
            if(set.contains(New_str))
            {
                return;
            }
            else
            {
                System.out.println(New_str);
                set.add(New_str);
                return;
            }
        } 
       
        char current_char = str.charAt(index);

        UniqueSubsequences(str, index+1, New_str + current_char, set);

        UniqueSubsequences(str, index+1, New_str, set);
    }
}
