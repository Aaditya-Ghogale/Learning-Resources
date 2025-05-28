 // The four pillars of OOP are encapsulation, abstraction, inheritance, and polymorphism.
    // These principles help in designing and implementing object-oriented programs effectively.

    // 1. Encapsulation: Bundling data and methods together, restricting direct access to an object's data.
    // 2. Abstraction: Hiding complex implementation details, showing only necessary parts to the user.
    // 3. Inheritance: Allowing a new class to inherit properties and methods from an existing class.
    // 4. Polymorphism: Treating objects of different classes as objects of a common superclass.

    // These principles work together to create a structured and organized approach to programming.

 class car {

    // int speed=100;
    // String color="Rang Birngangi";

    // now we will try other constructor 

    private int speed; // speed of the car in km/h
    private String color; // color of the car


    // makeing the var private ensures that they cannot be accessed directly from outside the class.
    // This is a constructor, which is a special method that is called when an object of the class is created.
    public car(){
        speed = 100; // default speed // this speed is a instance variable, which is specific to each object of the class.
        color = "Rang Birngangi"; // default color
    }

    //NOW WE WILL MAKE GETTERS AND SETTERS FOR THE INSTANCE VARIABLES

    // public void setterspeed(int speed) { // this speed here is a parameter, which is a local variable.
    //     this.speed = speed; // as setter was used to set the speed of the car, we use this.speed to tell that we are referring  to the instance variable. 
    //  }

    // this is how setter was made but in an IDE we can right click after making a constructor and select generate getters and setters.

    


    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }





    public void start(){
        System.out.println("Vroom Vroom Vroooooooooom ...........The"+color+" car is starting and speed is "+speed+" km/h");
    }

    public void stop(){
        System.out.println("Kat kat katatatta................The "+color+" car is stopping from a speed of "+speed+" km/h");
    }
    
}


class sportscar extends car{

    // This class inherits from the car class.
    // It can have additional properties or methods specific to a sports car.
    // For example, it could have a method to boost speed or change color.
    public void superspeed(){
        String customcolor = getColor(); // using the getter to access the color of the car

        System.out.println("The "+ customcolor +" sports car is going at a super speed of "+ (getSpeed() +50) + " km/h");
        customcolor="Red";
        System.out.println("The "+ customcolor +" sports car is going at a super speed of "+ (getSpeed() +150) + " km/h");
      
    }
    //as we can see we have bimplemented the getters in the above method to access the instance variables of the car class.
    // This method uses the inherited getSpeed() and getColor() methods to access the properties of the car class.
    // This is an example of inheritance, where the sportscar class inherits properties and methods from the car class.
    //this is a example of encapsulation, where we are using getters to access the private instance variables of the car class.
    // We can also override the start method to provide a specific implementation for sports cars.
}

 class Main1{
    public static void main(String[] args) {
        // int num =40;
        System.out.println("This main class is used to demonstrate the 3 concepts of OOP in Java.: Encapsulation, Inheritance and Abstraction.[car.java]");
        System.out.println("");
        System.out.println("");
        
        car obj;
        obj= new car();// see how when the object is created, the constructor of the class is called.
        // The constructor initializes the instance variables of the class.
        // In this case, the speed is set to 100 and color is set to "Rang Birngangi".
        // The object is created in the heap memory.
        // The object is a reference to the car class.
        // The object can access the methods and properties of the car class.
        // The object can also access the methods and properties of the supercar class, since it inherits from the car class.

        obj.start();
        obj.stop();
        
        

        sportscar obj1;
        obj1 = new sportscar();

        obj1.superspeed();
        
        // The color and speed properties are inherited from the car class.
        // The start and stop methods are also inherited from the car class.
        
        
        // obj1.color = "Red";
        // obj1.speed = 200;
        //correct in earlier versions where variables were public but now we cannot access the instance variables directly as they are private.
        
        
        obj1.start();
    }
}


//let us do polymorphism later.....