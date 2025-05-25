class Demo{
    public static void main(String args[]){
        /*
        main method is the entry point of any Java program.
        It is where the program starts executing.
        a proj can have 100 class and n number of methods,
        but the main method is the starting point.
        jvm finds the main method and starts executing the code from there.

        The main method must be declared as public, static, and void.
        
        public: It can be accessed from anywhere.

        static: It can be called without creating an instance of the class.
        void: It does not return any value.
        String args[]: It is an array of strings that can be used to pass command line arguments to the program.

        The main method must be declared as public static void main(String args[]).


         */

        System.out.println("Hello World");
    }

}

/*
sout is a shortcut for System.out.println() in some IDEs like IntelliJ IDEA.
sout("Hello World") is equivalent to System.out.println("Hello World");

now to compile code, we need to save the file as Demo.java
To compile the code, we need to use the command:
javac Demo.java 
To run the code, we need to use the command:
java Demo

 */