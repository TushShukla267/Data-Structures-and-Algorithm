/* & bitwise AND , | bitwise OR , ^ binary XOR , ~ binary ones complement , << binary left shift , >> binary right shift*/ 
import java.util.Scanner;

public class Bit_manipulatuon {

    public static void main(String arg[])
    {
                              
                                    //Get bit

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number:");
        int num=sc.nextInt();//5
        Scanner sc1 = new Scanner(System.in);
        System.out.print("Enter the position:");
        int position=sc1.nextInt();//2
        
        int Bit_Mask=1<<position;

        if(( Bit_Mask & num) == 0)
        {
            System.out.println("The bit is zero");
        }
        else
        {
            System.out.println("The bit is one");
        }

                
                                         //Set bit

        Scanner sc2 = new Scanner(System.in);
        System.out.print("Enter the number:");
        int num1=sc2.nextInt();//5
        Scanner sc3 = new Scanner(System.in);
        System.out.print("Enter the position:");
        int position1=sc3.nextInt();//1
        
        int Bit_Mask1=1<<position1;

        int New_Num=Bit_Mask1 | num1;

        System.out.println("The new number is:" + New_Num);
        
        
                                     //Clear bit                               

        Scanner sc4 = new Scanner(System.in);
        System.out.print("Enter the number:");
        int num2=sc4.nextInt();//5
        Scanner sc5 = new Scanner(System.in);
        System.out.print("Enter the position:");
        int position2=sc5.nextInt();//2

        int Bit_Mask2=1<<position2;

        int Not_Bit_Mask=~(Bit_Mask2);

        int New_Num2=Not_Bit_Mask & num2;

        System.out.println("The clear bit output is:" + New_Num2);
    

    }
    
}
