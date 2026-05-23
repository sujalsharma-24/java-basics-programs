public class PrimeNumber {
    public static void main(String[] args) {
        int num = 6;
       // int count = 0;
        for(int i = 2;i < Math.sqrt(num);i++){
            if(num % i == 0){
                System.out.println("not a prime");
                return;
            }
        }
        System.out.println("Prime number");
    }
}
