import java.util.*;
class Arrays01 {
   public static void main(String[] args) {
    
    Scanner obj = new Scanner(System.in);
    String[] names= new String[4];
    
    System.out.println("Enter 4 names in one line:");
    String temp =obj.nextLine();
    names = temp.split("\\s+");
    /*
    \\s+ is a regular expression (regex) that’s commonly used in Java (and other languages) 
    to split a string by one or more whitespace characters.
    BASICALLY IT IS THE WHITESPACE CHARACTER SO IT WILL SPLIT THE STRING BY WHITESPACE
    THEN EVEN IF THE USER ENTERS MULTIPLE SPACES BETWEEN NAMES,
    IT WILL STILL WORK AS IT WILL SPLIT BY ONE OR MORE WHITESPACE CHARACTERS.
    WHICH WOULD NOT HAVE BEEN THE CASE IF WE HADE USED ("") IN ITS PLACE.
    */ 
    obj.close();
    System.out.println(" ");
    System.out.println(" ");
    System.out.println(" ");
    
    System.out.println("Names entered are:");
    for(int i = 0; i < names.length; i++) {
        System.out.println(names[i]);
    }
    obj.close();  

}
}