import java.util.Scanner;

public class Switches {


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a day");
        String day = scanner.nextLine();

        switch(day){

            case "Sunday":
                System.out.println("It's a weekend");
                break;

            case "Monday":
                System.out.println("It's a weekday");
                break;

            case "Tuesday":
                System.out.println("It's a weekday");
                break;

            case "Wednesday":
                System.out.println("It's a weekday");
                break;

            case "Thursday":
                System.out.println("It's a weekday");
                break;

            case "Friday":
                System.out.println("It's a weekday");
                break;


            case "Saturday":
                System.out.println("It's a weekend");
                break;
        }

        scanner.close();

    }
}
