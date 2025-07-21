abstract class Animal {
    String name;
    int age;
    public abstract void makeNoise();
    public void printName() {
        System.out.println("Human, I am the Great " + name);
        System.out.println("Bow down to me, I am " + age + " years old");
    }
}

class Cat extends Animal {

    @Override
    public void makeNoise() {
        // TODO Auto-generated method stub
        //Made using source-action feature
        System.out.println("hey Human, fetch me some fish");        
    }
    public Cat(String name, int age){
        this.name= name;
        this.age= age;
    }

    }

class AbstractClasses{
    public static void main(String[] args) {
    
    // Animal a = new Animal();   // Abstract class cannot be instantiated
    // But while Abstract class cannot be initiated its child classes can be instantiated
    Cat c = new Cat("Tom", 50000000);
    c.makeNoise();
    c.printName();
    System.out.println("----------------------------------");
    System.out.println("----------------------------------");
    System.out.println("----------------------------------");
    System.out.println("This is just one class, We can have many more classes extending the Animal class and the fun part they will have similar structure.");

    }
}