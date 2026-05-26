import java.util.Scanner;

public class ValidTriangle {
    public boolean isValidTriangle(int a, int b, int c) {
        return (a + b > c) &&
               (a + c > b) &&
               (b + c > a);
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        ValidTriangle obj = new ValidTriangle();

        if (obj.isValidTriangle(a, b, c)) {
            System.out.println("Valid");
        } else {
            System.out.println("Invalid");
        }

        sc.close();
    }
}