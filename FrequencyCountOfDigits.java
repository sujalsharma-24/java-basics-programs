import java.util.HashMap;
public class FrequencyCountOfDigits {
    public static void main(String[] args) {
        int num = 72247224;
        HashMap<Integer,Integer> map = new HashMap<>(); 
        while(num!=0){
            int digit = num % 10;
            if(map.get(digit) == null){ //get(key)
                map.put(digit,1); //put(key,value)
            }else{

            }
            num = num / 10;
        }
    }
}
