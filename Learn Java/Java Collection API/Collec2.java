import java.util.*;
class Collec2{
    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<Integer>();  
        nums.add(4);
        nums.add(5);
        nums.add(59);
        nums.add(5500);
        // nums.add("aaditya");

        // for(int n: nums){
        //     System.out.println(n);
        // }

        for(int i = 0; i < nums.size(); i++){
            if(nums.get(i)%2==0){
                System.out.println(nums.get(i));
            }
        }
        // System.out.println(nums);
    }
}