import java.util.Scanner;

public class ProductofArrayExceptSelf {

    public static int[] PAES(int nums[]){
        int n = nums.length;
        int result[] = new int[n];
        // prefix product
        result[0] =1;
        for(int i = 1; i<n; i++){
            result[i] = result[i-1]*nums[i-1];
        }

        // suffix product
        int product = 1;
        for(int i  = n-1; i>=0; i++){
            result[i] = result[i]*product;
            product*=nums[i];
        }
        return result;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int nums[] = new int[n];
        for(int i = 0; i<n;i++){
            nums[i] = sc.nextInt();
        }
        int answer[] = PAES(nums);
        for(int i = 0; i<n; i++){
            System.out.print(answer[i]+" ");
        }
    }
}


// check for better understanding 
// input array [1,2,3,4]
//prefix product array [1,1,2,6]
//suffix product array [24,12,4,1]
//final out put product of prefix and suffix array as index wise [24,12,8,6]
