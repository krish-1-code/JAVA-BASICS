public class BreakContinue {
    
    //Task: print everything from 1 to 10 except for 5; and run a for loop till 1 to 10 but make it stop at 5;

    public static void main(String[] args){

        for(int i = 1; i <= 10; i++){

            if(i == 5) continue;
            else{
                System.out.print(i + "\t");
            }
           }

        System.out.println();
        
        for(int i = 1; i <= 10; i++){

            if(i == 5) break;
            else{
                System.out.print(i + "\t");
            }
           }
    }
}
