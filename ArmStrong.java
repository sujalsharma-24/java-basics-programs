public class ArmStrong {
    public static void main(String[] args) {
        int num = 153;
        int cpy = num;
        int count = 0;
        int sum = 0;
        //count digits
        while(cpy != 0){
            count++;
            cpy = cpy / 10;
        }
        System.out.println(count);
        //armstrong check 
        cpy = num;
        while(cpy != 0){
            int digits = cpy % 10;
            sum = sum + (int)Math.pow(digits,count);
            cpy=cpy / 10;
        }
        System.out.println(num==sum? "ArmStrong number" : "Not ArmStrong");
    }
}
