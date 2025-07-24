import java.util.Scanner;
public class finallybloc {

    public static void main(String[] args) {
        int a=0,b=0,c,d;
        Scanner adi=new Scanner(System.in);

        try{
        System.out.println("Enter two numbers:");
        a=adi.nextInt();    
        b=adi.nextInt();
        c=a/b;
        System.out.println("Division result: " + c);
    }
        finally{
            d=a+b;
            System.out.println("Sum of the two numbers: " + d);
            adi.close();
        }
        //Error during writing the code, so the finally block will not execute.
        //NOTE : The finally block is executed regardless of whether an exception occurs or not.
        // But it must be always be preceeded by try block.

    }
}
