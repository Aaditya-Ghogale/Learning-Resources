public class loops {

    public static void main(String[] args) {
        forLoop();
        System.out.println("for loop completed");
        whileLoop();
        System.out.println("while loop completed");
        doWhileLoop();
        System.out.println("do-while loop completed");
        // You can also call the methods directly without the main method
        // forLoop();
        // whileLoop();
        // doWhileLoop();
        foreachloop();
        System.out.println("foreach loop completed");
        // The above code demonstrates different types of loops in Java.
        // The for loop iterates a fixed number of times.
    }

    public static void forLoop() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Iteration: " + i);
        }
    }

    public static void foreachloop(){
        int a[]={1,2,3,4,5,6,7,8,9,101};
        for(int num:a){
            System.out.println("Number: " + num);
        }
        //what this does that a num variable is created which will take the value of each element in the array a one by one
        //and then print it
        //this is called enhanced for loop or for each loop
        //this is a very useful loop when you want to iterate over an array or a collection 

        //it is more readable and less error-prone than a traditional for loop
        //it is also called for-each loop

        String[] names = {"Aaditya", "Aryan", "Anas", "Siddhesh", "Sagar", "Arpit"};
        for(String name: names){
            System.out.println("NAAM hai:"+name);
        }
        }
    
    public static void whileLoop() {
        int i = 0;
        while (i < 5) {
            System.out.println("Iteration: " + i);
            i++;
        }
    }

    public static void doWhileLoop() {
        int i = 0;
        do {
            System.out.println("Iteration: " + i);
            i++;
        } while (i < 5);
    }
    
}
