package Must_Practice;

import java.util.ArrayList;

public class EvenOdd {
    public static void main(String[] args) {
        int nums[] = {1,2,3,4,5,6,7,8,9};
        // even 
        ArrayList<Integer> even = new ArrayList<>();
        // odd
        ArrayList<Integer> odd = new ArrayList<>();
        for(int num : nums){
            if(num%2==0){
                even.add(num);
            }
            else{
                odd.add(num);
            }
        }
        System.out.println("Even Integer: "+even);
        System.out.println("Odd Integer: "+odd);
    }
}
