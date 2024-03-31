import java.util.Scanner;

public class Recursion4_FistLastOccurance {
    
    public static void main(String args[])
    {
        Scanner sc1 = new Scanner(System.in);
        System.out.println("Enter the String with repeated characters:");
        String str = sc1.nextLine();
        int index1 = 0;
        Scanner sc2 = new Scanner(System.in);
        System.out.println("Enter the character you want to find First and Last occurance of:");
        char str1 = sc2.next().charAt(0);

        int First=-1;
        int Last=-1;
        
        Find_Occurance(str , str1 ,index1 , First , Last);
    }

    

     //code to find first occurance and last occurance in the string   
     public static void Find_Occurance(String str , char str1 , int index1 , int First , int Last) 
     {
         if(index1 == str.length())
         {
             System.out.println(First);
             System.out.println(Last);
             return;
         }
         char CurrChar = str.charAt(index1);
         if(CurrChar == str1)
         {
             if(First == -1)
             {
                 First=index1;
             }
             else
             {
                 Last=index1;
             }
         }
         Find_Occurance(str, str1, index1+1 , First , Last);
     }
}
