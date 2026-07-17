import java.util.Scanner;
public class Array1 {

    public static void main(String[] args){


        Scanner scanner = new Scanner(System.in);

        System.out.println("How many students are there: ");
        int num = scanner.nextInt();

        int[] grades = new int[num];

        for(int i = 0; i < num ; i++){

            System.out.println("Enter the grade "+ (i+1));
            grades[i] = scanner.nextInt();           
        }

       
        double average;
        int total = 0;

        for(int x : grades){

             total += x;
        }

        average = total / num;

        System.out.println("The average of the class is "+average);
        scanner.close();


    }
    
}
