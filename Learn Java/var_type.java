class var_type {

    public static void main(String[] args) {
        // Variable types in Java
        // 1. Primitive Data Types
        int age = 25;  // Integer type
        double salary = 50000.50;  // Floating-point type
        char grade = 'A';  // Character type
        boolean isEmployed = true;  // Boolean type
        byte smallNumber = 100;  // Byte type
        short shortNumber = 30000;  // Short type
    

        long largeNumber = 100000L;  // Long type
        float pi = 3.14f; // Float type

        System.out.println(age + " " + salary + " " + grade + " " + isEmployed + " " + smallNumber + " " + shortNumber + " " + largeNumber + " " + pi);
        
        show(); // Call the function to show something

    }

    //Lets also make some functions.
    public static void show(){
        System.out.println("This is a function to show something.");
    }


}
