//there are 4 types of inheritance in java as follows

//single-level inheritance in this there is one base/parent class and one derived class

//multilevel inheritance in this there one parent class derived class then derived class has another derived class 
//and so on parent->derived_1->derived_2

//Hierarchical inheritance in which one parent class have many derived classes parent=>derived_1,derived_2

//Hybrid inheritance one parent class hasmany derived classes and those derived classes also have derived classes
//combination of the multilevel and Hierarchical parent=>derived_1->derived_3,derived_2->derived_4

//the entire example is Hybrid

//abstract basically means a concept not a real thing it has no use but it is used to from other classes 
//absraction is use to hide unecessary or useless information from the user 
//abstract classes can have abstract function as well as static functions 
//it can also have constructors 
abstract class Shape {

    double area;

    abstract void printArea();
}
//example is single level inheritance 
class Triangle extends Shape {

    float b;
    float h;

    public void setDimensions(float b, float h) {
        this.b = b;
        this.h = h;
        area = 0.5 * b * h;
    }

    public void printArea() {
        System.out.println("The Area is:" + area);
    }
}
//example of heirarchical inheritance
class Circle extends Shape {

    float r;

    public void setDimensions(float radius)
    {
        this.r=radius;
        area=3.14*r*r;
    }

    public void PrintArea(){
        System.out.println("The Area of the circle is:" + area);
    }
}
//example of multilevel inheritance
class EquilateralTriangle extends Shape{

    float b;
    float h;

    public void setDimensions(float b) {
        this.b = b;
        this.h = b;
        area = 0.5 * b * h;
    }

    public void printArea() {
        System.out.println("The Area is:" + area);
    }
}

public class OOPS_inheritence {

    public static void main(String args[]) {
        Triangle triangle = new Triangle();
        triangle.setDimensions(4, 5);
        triangle.printArea();

        Triangle triangle1 = new Triangle();
        triangle1.setDimensions(56, 10);
        triangle1.printArea();

        Circle circle = new Circle();
        circle.setDimensions(20);
        circle.PrintArea();

        EquilateralTriangle equilateralTriangle = new EquilateralTriangle();
        equilateralTriangle.setDimensions(10);
        equilateralTriangle.printArea();
        
    }
}
