//***Interfaces supports functionality of multiple inheritance***
//***Multiple inheritance is when there are two Base classes and one derived class Parent_1,Parent_2=>Deriveds***/
//All fields of interfaces are public static and final by default
//All functions are public and abstract by default 
//Interfaces supports functionality of multiple inheritance
//A class that implementsinterfaces must inplemenet all the functions of the interfaces 
//We cannot use interfaces Directly
interface Animal{
    
    int eyes=2;
    void eyes(int eyes);
    void Walk();

}
interface herbivorus{

    void eats();

}
class Horse implements Animal , herbivorus {

    public void Walk()
    {
        System.out.println("Horse walks on Four legs");
    }

    public void eats()
    {
        System.out.println("Horse eats grass");
    }
    
    public void eyes(int eyes)
    {
        System.out.println("Horse has " + eyes + " eyes");
    }

}
public class OOPS_Interfaces {

    public static void main(String args[])
    {
        Horse horse = new Horse();
        horse.Walk();
        horse.eats();
        horse.eyes(2);
    }
    
}
