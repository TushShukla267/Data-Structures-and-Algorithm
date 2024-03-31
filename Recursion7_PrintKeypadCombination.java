import java.util.Scanner;

//Keypad means the keypad we used in old phones

public class Recursion7_PrintKeypadCombination {

    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the String with Duplicate characters:   ");
        String str = sc.nextLine();

        String Combination="";
        int index=0;

        PrintKeypadCombination(str, index, Combination);
    }

    public static String Keypad[] ={"." ,"abc" , "def" , "ghi" , "jkl" , "mno" , "pqrs" , "tu" , "vwx" , "yz"};

    public static void PrintKeypadCombination(String str , int index , String Combination)
    {
        if(index == str.length())
        {
            System.out.println(Combination);
            return;
        }

        char current_char = str.charAt(index);

        String mappString = Keypad[current_char - '0']; 
        int i;
        for(i=0;i<mappString.length();i++)
        {
            PrintKeypadCombination(mappString, index+1, Combination + mappString.charAt(i));
        }
    }
    
}
