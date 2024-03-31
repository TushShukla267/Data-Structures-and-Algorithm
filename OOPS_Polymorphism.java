//code is correct but is not working in vs code and use online complier

class Student{

    String name;
    int age;
    int Roll_no;
    String Address;
    String college;
    String Department;
     
    Student(String college , String Department)
    {
        System.out.println("The Student Details are as Follows:");
        this.college=college;
        this.Department=Department;

        System.out.println(college);
        System.out.println(Department);
    }
//this is compily time polymorphism    
//the following are examples of Polymorphism mutiple functions of the same name having different number of arguments or return types 
//this is called Function Overloading
    public void Print_Info(String name , int age , int Roll_no , String Address)
    {
        this.name=name;
        this.age=age;
        this.Roll_no=Roll_no;
        this.Address=Address;
        System.out.println("The name is:" + name);
        System.out.println("The age is:" + age);
        System.out.println("The Roll no is:" + Roll_no);
        System.out.println("The Address is:" +Address);
    }

 public void Print_Info(String name)
    {
        this.name=name;
        System.out.println("The name is:" + name);
    }   

public void Print_Info(String name , int age , int Roll_no)
    {
        this.name=name;
        this.age=age;
        this.Roll_no=Roll_no;
        System.out.println("The name is:" + name);
        System.out.println("The age is:" + age);
        System.out.println("The Roll no is:" + Roll_no);
    }

public void Print_Info(int age , int Roll_no)
    {
        this.age=age;
        this.Roll_no=Roll_no;
        System.out.println("The age is:" + age);
        System.out.println("The Roll no is:" + Roll_no);
    }
}

public class OOPS_Polymorphism {

    public static void main(String args[]) {
        
        Student student = new Student("KJ SOMAIYA COLLEGE OF ENGG", "Information Technology");

        student.Print_Info("Tushar J Shukla", 19, 22272, "Kashish Park LBS Marg Near Tip Top Hotel Thane west TH-400604");
        student.Print_Info("Tushar J Shukla");
        student.Print_Info(19, 22272);
        student.Print_Info("Tushar J Shukla", 19, 22272);
    }
}

