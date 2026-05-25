public class BreakVsContinue {
    public static void main(String[] args) {
        for(int i = 1; i <= 3; i++){
            for(int j = 1; j <= 3; j++){
                if(i == j){
                    //return; //exit from the current function 
                    continue; //exit from current iteration
                    //break; //exit from current loop 
                }
                System.out.println(i +" "+j);
            }
        }
    }
}
