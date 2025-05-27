public class loops {

    public static void main(String[] args) {
        forLoop();
        System.out.println("for loop completed");
        whileLoop();
        System.out.println("while loop completed");
        doWhileLoop();
        System.out.println("do-while loop completed");
    }

    public static void forLoop() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Iteration: " + i);
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
