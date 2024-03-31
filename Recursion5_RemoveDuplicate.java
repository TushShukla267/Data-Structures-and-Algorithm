import java.util.Scanner;

//for removing duplicate we have to create a lenght 25 Array of boolean type if character has occured it would be true 
//else it would be false the index coressponds to character and it is accesed by currentchar - 'a' to find index of the currentchar
//example 'z'-'a'=25 so z will be at 25 index so it would turn true

public class Recursion5_RemoveDuplicate {

    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the String with Duplicate characters");
        String str = sc.nextLine();

        String New_str="";
        int index=0;

        RemoveDuplicate(str, index, New_str);
    }

    public static boolean[] Alphabet_map = new boolean[26];

    public static void RemoveDuplicate(String str , int index , String New_str)
    {
        //printing the new string in which no duplicate characters are there
        if(index == str.length())
        {
            System.out.println("The String with no Duplicate Characters:" + New_str);
            return;
        }
        
        //To check if the character has occured
        char currentchar = str.charAt(index);
        
        if(Alphabet_map[currentchar - 'a'])
        {
                RemoveDuplicate(str, index+1, New_str);
        }
        else
        {
            New_str = New_str + currentchar;
            Alphabet_map[currentchar - 'a'] = true;
            RemoveDuplicate(str, index+1, New_str);
        }
    }
    
}
