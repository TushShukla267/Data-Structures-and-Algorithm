import java.util.Scanner;
import java.util.Stack;

public class Static_Stack {

    public static int Capacity=5;

    public static int Stack[] = new int[Capacity];

    public static void main(String args[])
    {
        int Top=0;

        int i=0;
         
        while(i<10)
        {
            System.out.println("Press 1 to Push an element");
            System.out.println("Press 2 to pop an element");
            System.out.println("Press 3 To display the element on to of the stack");
            System.out.println("Press 4 to Display all the elements");

            Scanner sc = new Scanner(System.in);
            System.out.print("Enter Your Choice:");
            int ch=sc.nextInt();

            switch(ch)
            {
                case 1:Push(Stack, Top , Capacity);
                       break;

                // case 2:Pop() ;
                //        break;
                       
                // case 3:Peek();
                //        break;
                       
                case 4:Display(Stack, Top);
                       break;     
            }
        }
    }

    public static int IsFull(int Top , int Capacity)
    {
        if(Top == Capacity-1)
        {
            System.out.println("The Stack is Full");
            return 1;
        }

        else
        {
           return 0;
        }
    }
    public static int IsEmpty(int Top)
    {
        if(Top == 0)
        {
            System.out.println("The Stack is Empty");
            return 1;
        }

        else
        {
           return 0;
        }
    }
    public static void Push(int [] Stack , int Top , int Capacity)
    {
        if(Top == Capacity-1)
        {
            System.out.println("The Stack is Full");
        }
        else
        {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter the element You want to Enter in the Stack:");
            int element=sc.nextInt();
            Top++;
            Stack[Top]=element;
        }
    }
    public static void Pop()
    {

    }
    public static void Peek()
    {

    }
    public static void Display(int [] Stack , int Top)
    {
        if(Top == 0)
        {
            System.out.println("The Stack is Empty");
        }
        else
        {
            int i;
            for(i=0;i<Top;i++)
            {
                System.out.println(Stack[i]);
            }
        }
    }
    
}
