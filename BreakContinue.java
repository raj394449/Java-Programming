public class BreakContinue {

    void breakStatement(){
        for(int i = 1; i <= 5; i++){
            if(i == 3){
                break;
            }
            System.out.println(i);
        }
    }

    void continueStatement(){
        for(int i = 1; i <= 5; i++){
            if(i == 3){
                continue;
            }
            System.out.println(i);
        }
    }
    public static void main(String args[]){
        BreakContinue obj = new BreakContinue();
        System.out.println("Break Statement : ");
        obj.breakStatement();
        System.out.println("Continue Statement : ");
        obj.continueStatement();
    }
}
