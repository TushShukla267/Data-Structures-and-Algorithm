import java.util.Scanner;
//this is pen class
class Pen{

    String color;
    String type;
//this is method in Pen class
    public static void Write()
    {
        System.out.println("Hello this is Your new pen object");
    }

    public void Print_Color_Type(String color , String type)
    {
        System.out.println("The pen is of color " + this.color + " Which is of type " + this.type);
    }
}
//this is student class
class Student{

    String name;
    int age;
    int Roll_no;
    String Address;
    String college;
    String Department;
//this is method in student class
    public void Print_Info(String name , int age , int Roll_no , String Address)
    {
        System.out.println("The name is:" + this.name);
        System.out.println("The age is:" + this.age);
        System.out.println("The Roll no is:" + this.Roll_no);
        System.out.println("The Address is:" + this.Address);
    }
//this is constructor in student class constructors can have parameters or can not have parameters there are also copy constructor which 
//copy one object to the other
    Student(String college , String Department)
    {
        System.out.println("The Student Details are as Follows:");
        this.college=college;
        this.Department=Department;

        System.out.println(college);
        System.out.println(Department);
    }
}

public class OOPS_classes_constructors {

    public static void main(String args[])
    {
        // to use class and create object we write them in format class_name object_name is equal to new Constructor of the class 
        Pen pen1 = new Pen(); 

        Pen pen2 = new Pen();

        pen1.color="black";
        pen1.type="Ballpoint pen";
        
        pen2.color="blue";
        pen2.type="gel";

        pen1.Write();

        pen1.Print_Color_Type(null, null);

        pen2.Write();

        pen2.Print_Color_Type(null, null);

        Student student = new Student("KJ SOMAIYA COLLEGE OF ENGG" , "Information Technology");

        student.name="Tushar J Shukla";
        student.age=19;
        student.Roll_no=22272;
        student.Address="Kashish Park LBS Marg Near Tip Top Hotel Thane west TH-400604";

        student.Print_Info(null, 0, 0, null);

        //we dont write distructor(ones who are respponsible for distroying unused variables) as in java we have garbage collectors
    }
}

