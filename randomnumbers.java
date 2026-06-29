import java.util.Random;

public class randomnumbers {

    public static void main(String[] args){

        Random random = new Random();

        int x = random.nextInt(1,7);

        double y = random.nextDouble(0.1,0.9);

        boolean z = random.nextBoolean();

        System.out.println(x);
        
        System.out.println(y);

         System.out.println(z);

    }
    
}
