import java.util.*;
class Arrays{
    public static void main(String[] args) {
    
    Scanner obj = new Scanner(System.in);
    String[] names= new String[3];
     
     for(int i=0;i<names.length;i++){
        names[i]=obj.nextLine();
     }
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