import java.util.Scanner;

public class Palindrome {
    public static boolean isPalindrome(int num){
        //checking negative number
        if(num<0){
            return false;
        }
        int original = num;
        int reverse = 0;
        while(num != 0){
            int digit = num % 10;
            reverse = reverse * 10 + digit;
            num = num/10;
        }
        return original == reverse;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(isPalindrome(n));
        sc.close();
    }
}
