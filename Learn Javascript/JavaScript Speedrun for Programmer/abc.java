// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] arr =new int[n];
        for(int i =0;i<n;i++)
        {
        arr[i]=sc.nextInt();
        }
        int [] res=new int[2*n];
        
        for (int i=0;i<2*n;i++){
            res[i]=arr[i%n];
        }
        
        System.out.println(Arrays.toString(res));
    }
}