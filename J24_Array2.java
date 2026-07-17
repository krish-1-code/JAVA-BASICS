import java.util.Arrays;

public class Array2 {

    //Let's discuss some basic modifiers/ Methods to be used in arrays;

    public static void main(String[] args){

        int[] array1 = {1,2,3,4,5};
        int[] array2 = {5,4,3,2,1};

        //Length of array;

        int array1length = array1.length;
        
        System.out.println(array1length);


        Arrays.sort(array2);

      

        boolean isEqual = Arrays.equals(array1, array2);

        System.out.println(Arrays.binarySearch(array1, 3) + "\n");


        for(int x : array2){
            System.out.println(x);
        }
        System.out.println("Are array 1 and 2 equal :" + isEqual);
        System.out.println();
        
        
        System.out.println(Arrays.toString(array2));
    }
}
