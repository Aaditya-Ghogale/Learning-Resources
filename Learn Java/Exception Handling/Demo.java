import java.util.*;

class Demo{
    public static void main(String[] args) {
        int a,b,result=0;
        Scanner adi=new Scanner(System.in);
        System.out.println("Enter two numbers:");
        a=adi.nextInt();
        b=adi.nextInt();

        try{
        result =a/b;    
        }
        catch(Exception e){
            System.out.println("No division by zero....");
            System.out.println("Hamare yaha aisa hi hota hai...Samjhe?");
        }

        System.out.println("Iss sawal ka uttar hai : "+ result);
        adi.close();
    }
}