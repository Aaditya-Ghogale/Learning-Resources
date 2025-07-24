import java.util.*;

class Demopro{
    public static void main(String[] args) {
        int a,b,c,result=0;
        Scanner adi=new Scanner(System.in);
        System.out.println("Enter two numbers:");
        a=adi.nextInt();
        b=adi.nextInt();
        System.out.println("Array me se konsa index chahiye??");
        c=adi.nextInt();
        int arr[]={1,2,3,4,5};

        try{
        result =a/b;    
        System.out.println(arr[c]);
        if(result ==0){
            throw new ArithmeticException();
            }
        System.out.println("Iss sawal ka uttar hai : "+ result);
        }
        catch(ArithmeticException e){
            System.out.println("No division by zero....");
            System.out.println("Hamare yaha aisa hi hota hai...Samjhe?");
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Hamare wale array ke size isse kam hai.....index 0-4 me se daalo.");
        }

        
        
    }
}