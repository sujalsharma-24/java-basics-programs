import java.util.Scanner;
public class PerfectSquare{
    public boolean isPerfectSquare(int num){
        if(num<0){
            return false;
        }
        int root = (int)Math.sqrt(num);
        return root * root == num;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        
        PerfectSquare obj = new PerfectSquare();

        if(obj.isPerfectSquare(num)){
            System.out.println("true");
        }else{
            System.out.println("false");
        }
        sc.close();
    }
}
