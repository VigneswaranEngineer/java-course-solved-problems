/* Create a program to manage different shapes. Define an interface Shape' with a method calculate Area(). 

Implement a superclass 'AbstractShape' with a method 'displayDetails()' that provides a generic display for shapes. 

Implement subclasses (e.g., 'Circle', 'Rectangle") that extend 'AbstractShape' and implement 'Shape'. Add a method 'initialize()' 
in the 'AbstractShape' class. Implement subclasses to initialize specific attributes when an object is created.

Add a method 'initialize()' in the 'AbstractShape' class to set default values.

- Implement subclasses that extend 'AbstractShape' and implement "Shape".

- Access the superclass constructor and the 'initialize() method to set attributes when an object is created.

Demonstrate how the subclasses utilize both superclass constructors and initialization methods. */


interface Shape{
    void calculateArea();
}





public class AbstractShape{
    double length;
    double breadth;
    double height;
    double radius;


    void initialize(double length , double breadth , double height){
        this.length = length;
        this.breadth = breadth;
        this.height = height;

    }
    void initialize(double radius){
        this.radius = radius;
    }

    void displayDetails(){
        System.out.println("the length is : "+length);
        System.out.println("the breadth is : "+breadth);
        System.out.println("the height is : "+height);

    }

    public static void main(String[] args) {
        Circle c1 = new Circle();
        c1.calculateArea();
    }
    
}

class Circle extends AbstractShape implements Shape{
    Circle(){
        super();
    }
    double area;

    public void calculateArea(){
        area = 3.14*radius*radius;
        System.out.println("the area is : "+area);
    }
}

class Rectangle extends AbstractShape implements Shape{
    Rectangle(){
        super();
    }
    double area;

    public void calculateArea(){
        area = length*breadth;
        System.out.println("the area is :"+area);
    }
}
