package Must_Practice;

public class SumofDigits {
    public static void main(String[] args) {
        int n = 12345;
        int sum = sumOfDigits(n);
        System.out.println("Sum of digits: " + sum);
    }

    public static int sumOfDigits(int n) {
        int sum = 0;
        while (n != 0) {
            sum += n % 10;
            n /= 10;
        }
        
        return sum;
    }
}
