import java.util.Scanner;

public class NestedLoop {

    //Nested Loop just means a loop inside a loop; One example of nested loop is bubble sorting;

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int[] numList = new int[10];

        for(int i = 0; i < 10; i++){

            System.out.print("Enter the "+ (i+1) + " Value : ");
            numList[i] = scanner.nextInt();
        }

        System.out.println();
        System.out.print("The value entered by the user are: ");
        for(int num : numList){
            
            System.out.print(num + "\t");
            
        }

        int temp = 0;

        for(int i = 0; i < 10; i++) {
            for(int j = 0; j < 9 - i; j++){

                if(numList[j] > numList[j+1]){

                    temp = numList[j+1];
                    numList[j+1] = numList[j];
                    numList[j] = temp;
                }

            }
        }

        System.out.println("\n Sorted list: ");

        for(int num : numList){
           
            System.out.print(num + "\t");
            
        }




        scanner.close();
    }
    
}
