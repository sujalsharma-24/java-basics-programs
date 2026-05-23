public class PrintDigit {
    public static void main(String[] args) {
        int num = 3456767;
        int cpy = num;
        int count = 0;
        //digit count 
        while(cpy != 0){
            count++;
            cpy = cpy / 10;
        }
        //System.out.println(count);
        while(num != 0){
        int pow = (int)Math.pow(10,count-1);
        System.out.println(num / pow);
        num = num % pow;
        count-- ;
        }
    }
}
