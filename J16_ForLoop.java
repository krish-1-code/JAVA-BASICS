public class ForLoop {
    
    public static void main(String[] args) {

        int reps = 10;

        for(int i = 1; i <= reps; i++){

            System.out.println(i);
        }

        int[] numbers = {1,2,3,4,5};

        for(int num : numbers){
            System.out.print(num+"\t"); // This specific for loop is called for each loop;
        }
    }
}
