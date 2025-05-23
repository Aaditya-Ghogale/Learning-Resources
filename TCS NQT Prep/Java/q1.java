// import java.util.*;
// class q1{

//     public static void main(String [] args){
//         System.out.print("Enter the number : ");
//         Scanner sc = new Scanner(System.in);
//         int n=sc.nextInt();
//         int sum = Natural_Prod_Sum(n);
//         System.out.println("the  sum of product of 1st 10 natural numbers with the given number is "+sum); 
//         sc.close();
//     }
//     public static int Natural_Prod_Sum(int m){
//         int sum=0;
//         for(int i=1;i<=10;i++){
//             sum+=m*i;
//         }
//         return sum;
//     }
// }

//time complexity of this code is O(1) as it is not dependent on the input size. The space complexity is O(1) as we are using only a few variables.



import java.util.*;
class q1{

    public static void main(String [] args){
        System.out.print("Enter the number : ");
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int sum = n*55;
        System.out.println("the  sum of product of 1st 10 natural numbers with the given number is "+sum); 
        sc.close();
    }
}

// The time complexity of this code is O(1) as it is not dependent on the input size. The space complexity is O(1) as we are using only a few variables.