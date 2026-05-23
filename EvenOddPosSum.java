public class EvenOddPosSum {
    public static void main(String[] args) {
        int num = 8765;
        int position = 0;
        int oddSum = 0;
        int evenSum = 0 ;
        while(num!= 0){
        int lastdigit = num % 10;
        position++;
        if(position % 2 == 0){
            evenSum = evenSum + lastdigit;
        }else{
            oddSum = oddSum + lastdigit;
        }
        num = num / 10;
       }
       System.out.println("even pos sum is " + evenSum);
       System.out.println("odd pos sum is " + oddSum);
    }
}
