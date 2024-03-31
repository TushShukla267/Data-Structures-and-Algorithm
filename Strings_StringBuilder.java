import java.util.*;

public class Strings_StringBuilder {

      public static void main(String[] args)
    {
                                    //taking string input and checking lenght and index

      Scanner sc =new Scanner(System.in);
      System.out.print("Enter your name:");
      String name=sc.nextLine();
        
      Scanner sc0= new Scanner(System.in);
      System.out.print("Enter your age:");
      float age=sc0.nextFloat();

      System.out.println("Hello," + name + " And your age is:" + age);

      System.out.println();

      System.out.println("The length of your name entered is:" + name.length());

      int i;
      for(i=0;i<name.length();i++)
      {
        System.out.println(name.charAt(i));
      }

                                   //comparing two strings

      Scanner sc1=new Scanner(System.in);
      System.out.print("Enter the second name:");
      String sb=sc1.nextLine();
      if(name.compareTo(sb)>0)
      {
        System.out.println("String 1 is bigger than string 2");
      }
      else if(name.compareTo(sb)==0)
      {
        System.out.println("Both the Strings are equal");
      }
      else
      {
        System.out.println("String 1 is smaller than String 2");
      }

                                         //creating substrings 

      Scanner sc2=new Scanner(System.in);
      System.out.print("Enter the first index value:");
      int index=sc2.nextInt();
      Scanner sc3=new Scanner(System.in);
      System.out.print("Enter the second index value:");
      int index1=sc3.nextInt();
      
      System.out.println("The substring reuired is:" + name.substring(index,index1));

 
                      //String bulider,replacing letter,inserting leters,deleting letters,append        

      StringBuilder s =new StringBuilder(name); 
      System.out.println(name);

      s.setCharAt(7,'M');
      System.out.println(s);
      s.setCharAt(7,'J');
      System.out.println(s);

     System.out.println(s.insert(6,"Manju"));

     System.out.println(s.delete(6,11));

     System.out.println(s.append(" Manju"));


                                     //Reversing the string

     Scanner sc4= new Scanner(System.in);
     System.out.println("Enter the string you want to reverse:");
     String name2=sc4.nextLine();
     StringBuilder sb1 = new StringBuilder(name2);

     for(i=0;i<=sb1.length()/2;i++)
     {
      int front_index=i;
      int back_index=sb1.length() - 1 - i;


      char front_char=sb1.charAt(front_index);
      char back_char=sb1.charAt(back_index);

      sb1.setCharAt(front_index,back_char);
      sb1.setCharAt(back_index, front_char);
     }

     System.out.println(sb1);
     
    }
  }
