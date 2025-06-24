public class polymorph {

    public  int area(){
        int area = 0;
        System.out.println("Area of the shape is not defined. Printed by the parent class polymorph.");
        return area;

    }
    // Rectangle area
    // Formula: Area = length * breadth
    public  int area(int l, int b){
        int area = l*b;
        return area;
    }
    // Circle area
    // Formula: Area = π * r^2
    public  int area(int r){
        return (int)(3.14)*r*r; // Assuming 22/7 is used for π 
    }
    //Trapezium area
    // Formula: Area = 1/2 * (a + b) * h
    public  int area(int a, int b, int h){

        return (int)((0.5)*(a+b)*h);
    }

    //REFER THESE FOR EXPLAINATION FROM THE PROCESS FROM LINE 84
    // public void PrintOverriddenMethod(){
    //     System.out.println("Let us try to call the overridden method from the arent class"+area()); 
    // }
    
    /*
    this was a type of polymorphism 
    there are 2 types of polymorphism in java:
    1. Compile - time polymorphism (also known as static polymorphism) because it  is resolved during compile time.
    2. Runtime polymorphism (also known as dynamic polymorphism) because it is resolved during the runtime 
    Above is an example of compile-time polymorphism, also known as method overloading.
    here the methods are of same name but with different parameters.
    */
}

class Area extends polymorph{
    @Override
    public  int area(){
        System.out.println("Area of the shape is not defined. Printed by the child class polymorph Area.");
        return 0000;
    }
    // This method overrides the area method in the polymorph class.

    public void PrintOverriddenMethod(){
        System.out.println("Let us try to call the overridden method from the arent class"+ super.area()); 
    }

    public static void main(String[] args) {
        Area area =new Area();
        System.out.println("Area of the rectangle is: " + area.area(5, 10)); // Rectangle area
        System.out.println("Area of the circle is: " + area.area(7)); // Circle area
        System.out.println("Area of the trapezium is: " + area.area(3, 4, 5)); // Trapezium area
        System.out.println("Area of the shape is: " + area.area()); // Default area method
    
        polymorph obj =new Area();
        System.out.println("Area of the shape is: " + obj.area()); // Default area method from polymorph class
        // This demonstrates runtime polymorphism: 
        // The method in the Area class overrides the one in the polymorph class, 
        // and is called even though the reference is of type polymorph.


        area.PrintOverriddenMethod(); // Calling the overridden method from the parent class
        // This will print the area of the shape as defined in the parent class polymorph.



        /*
         * Now during learning i tried to call the overridden parent class method from the child class
         * 
         * i did that by using the super keyword
         * i tried to print using super.area() in the child class
         * but it did not work as expected
         * it did not work as the suprr keyword cannot be used in a static context
         * 
         * 
         * 
         * 
         * after that  i declareed this method in parent class polymorph and 
         * it still called the child class method
         * this happened because the method is overridden in the child class
         * overriding is a feature of runtime polymorphism
         * so the method in the child class is called even though the reference is of type polymorph
         * 
         * 
         * 
         * Finally i pasted that meethod to the child class and it worked
         * 
         * DONE........
         * A SMALL VIcTORY FOR ME FOR BEING CURIOUS AND TRYING TO UNDERSTAND THE CONCEPTS
         */
    }
}

/*
 * 
 * 
 *This is the result when ran with and without the @Override annotation:

PS D:\Learning Resources\Learn Java> java Area
Area of the rectangle is: 50
Area of the circle is: 147
Area of the trapezium is: 17
Area of the shape is not defined. Printed by the child class polymorph Area.
Area of the shape is: 0
Area of the shape is not defined. Printed by the child class polymorph Area.
Area of the shape is: 0
PS D:\Learning Resources\Learn Java> javac .\polymorph.java
PS D:\Learning Resources\Learn Java> java Area
Area of the rectangle is: 50
Area of the circle is: 147
Area of the trapezium is: 17
Area of the shape is not defined. Printed by the child class polymorph Area.
Area of the shape is: 0
Area of the shape is not defined. Printed by the child class polymorph Area.
Area of the shape is: 0
PS D:\Learning Resources\Learn Java>


SO THE PRESENCE OF THE @Override ANNOTATION DOES NOT CHANGE THE OUTPUT, BUT IT IS A GOOD PRACTICE TO USE IT AS IT HELPS IN CODE READABILITY AND MAINTENANCE.
🔒 With @Override, you're protected against:
Typos

Wrong parameter lists

Mistakes in inheritance

Bugs that are hard to track down

 */




