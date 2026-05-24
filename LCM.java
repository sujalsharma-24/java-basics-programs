public class LCM {
    public static void main(String[] args) {
        int a = 12;
        int b = 16;
        int aCopy = a;
        int bCopy = b;
        //Euclidean substraction method
        while(a!=b){
            if(a>b){
                a = a - b;
            }else{
                b = b - a;
            }
        }
        int lcm = (aCopy * bCopy) / a;
        System.out.println(lcm);
    }
}
