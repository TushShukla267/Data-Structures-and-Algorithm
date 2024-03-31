/**
 * The Recursion class contains methods to perform various recursive operations such as printing
 * numbers in reverse, printing numbers within a range, calculating the sum of numbers, calculating the
 * factorial of a number, printing the Fibonacci series, and calculating the power of a number.
 */
import java.util.Scanner;

public class Recursion {

    public static void main(String arg[])
    {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the number:");
        int num=sc.nextInt();

        Print_Num(num);


        Scanner sc1= new Scanner(System.in);
        System.out.print("Enter the number from which you want to print:");
        int num1=sc1.nextInt();
        Scanner sc2= new Scanner(System.in);
        System.out.print("Enter the number upto which you want to print:");
        int num2=sc2.nextInt();

        Print_Num1(num1 , num2);


        int i=0;
        Scanner sc3 = new Scanner(System.in);
        System.out.print("Enter the number upto which you wnat to find sum:");
        int n=sc3.nextInt();
        int sum=0;

        Print_sum_num(i , n ,sum);


        int j=1;
        Scanner sc4 = new Scanner(System.in);
        System.out.print("Enter the number of which you want to find factorial of:");
        int n1=sc4.nextInt();
        int factorial=1;

        Print_Factorial_num(j , n1 ,factorial);


        int a=0;
        int b= 1;
        Scanner sc5 = new Scanner(System.in);
        System.out.print("Enter the number upto which you want to print the fibonacci series");
        int n2=sc5.nextInt();

        System.out.println(a);
        System.out.println(b);

        Print_fibonacci(a , b ,n2-2);


        Scanner sc6 = new Scanner(System.in);
        System.out.print("Enter the degree of n:");
        int n3 = sc6.nextInt();
        Scanner sc7 = new Scanner(System.in);
        System.out.print("Enter the number:");
        int x = sc7.nextInt();
        

        Print_PowerOF_X(n3 , x);
        
        int answer=Print_PowerOF_X(n3, x);

        System.out.println("This is the answer:" + answer );
        
        int answer1 =CalPower(x, n3);
        System.out.println("This is the answer:" + answer1);


    }
     // to print numbers in reverse direction
    public static void Print_Num(int num)
    {
        if(num==0)
        {
            return;
        }
        else
        {
            System.out.println(num);

            Print_Num(num-1);
        }
    }

     //to print numbers form num1 to num2
    public static void Print_Num1(int num1 , int num2)
    {
        if(num1==num2)
        {
            return;
        }
        else
        {
            System.out.println(num1);

            Print_Num1(num1+1 , num2);
        }

    }

     //to printsum of numbers upto n
    public static void Print_sum_num(int i , int n , int sum)
    {
        if(i==n)
        {
            sum=sum+i;
            System.out.println(sum);
            return;
        }
        else
        {
            sum=sum+i;

            Print_sum_num(i+1 , n , sum);
        }
    }

     //to print the Factorial of the given number
    public static void Print_Factorial_num(int j , int n1 ,int factorial)
    {
        if(j==n1)
        {
            factorial=(factorial*j);
            System.out.println(factorial);
            return;
        }
        else
        {
            factorial=(factorial*j);

            Print_Factorial_num(j+1 , n1 , factorial);
        }
    }

    //to print Fibonacci series
    public static void Print_fibonacci(int a , int b , int n2)
    {
        if(n2 == 0)
        {
            return;
        }

        int c = a + b;
        System.out.println(c);

        Print_fibonacci(b , c , n2-1);

    }



    public static int Print_PowerOF_X(int n3 , int x)
    {
        if(n3 == 0)
        {
            return 1;
        }
        if(x == 0)
        {
            return 0;
        }

        int XpowerN1=Print_PowerOF_X(n3-1, x);
        int XpowerN= x*XpowerN1;

        return XpowerN;
        
    }



    public static int CalPower(int x , int n3)
    {
        if(n3 == 0)
        {
            return 1;
        }
        else if(x ==0)
        {
            return 0;
        }
        else if(n3 % 2 ==0)
        {
           return CalPower(x, n3/2) * CalPower(x, n3/2);
        }
        else
        {
            return CalPower(x, n3/2) * CalPower(x, n3/2) * x;
        }
        
        
    }

}
