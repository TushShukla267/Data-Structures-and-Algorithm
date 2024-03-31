//Acess modifiers
//public anyone having this keyword can be acessed by any class in the package or outside the package
//default this is given when no other acess modifier is specified
//protected this can be accesed by the class in which it is present and its subclasses
//private this can only be accessed by the class in which it is present for setting and getting private things
//we have setter function and getter function which is user defined 
//Encapsulation is basically Achieved by the use of classes , interfaces and acess modifiers
/*Data hiding is possible using acess modifiers , Data hiding is the process of protecting memebers of classes
from unintented(unwanted) changes */
/*Abstraction is Achieved by using interfaces or using abstract keyword in the classes Abstraction is hiding implementation details
and only showing useful parts of th eprogram tio the user */
package bank;

class Account{

    public String name;
    public int age;
    protected String email;
    protected String Address;
    private String User_ID;
    private int password;

    public void Print_name_age()
    {
        System.out.println("The name is:" + this.name);
        System.out.println("The age is:" + this.age);
    }

    public void Print_Email_Address()
    {
        System.out.println("The email is:" + this.email);
        System.out.println("The Address is:" + this.Address);
    }

    //we have to make Separate function for setting and getting the ID and Password of the user
    //basically if cannot use object.property and then this.property to set and get the value have to prepare special functions

    public void User_ID(String User_ID)
    {
        this.User_ID=User_ID;
        System.out.println("The User ID is" + User_ID);;
    }

    public void Password(int password)
    {
        this.password=password;
        System.out.println("The password is:" + password);
    }
}
public class OOPS_Packes {

    public static void main(String args[])
    {
        Account Account1 = new Account();
        Account1.name="Tushar";
        Account1.age=19;
        Account1.email="tusharshukla267@gmail.com";
        Account1.Address="Kashish Park LBS Marg Near Tip Top Hotel Thane west TH-400604";
        Account1.Print_name_age();
        Account1.Print_Email_Address();

        Account1.User_ID("Tushar");
        Account1.Password(22272);
    }
    
}
