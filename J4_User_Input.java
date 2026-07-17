import java.util.Scanner;

public class User_Input {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        // To take string as a input:
        System.out.println("Enter your name: ");
        String name = scanner.nextLine(); // Scanner.next - just for one word     Scanner.nextline - for the entire sentence; 

        //To take Integer as input;

        System.out.println("Enter your age: ");
        int age = scanner.nextInt();

        // To take double as input;

        System.out.println("ENter your GPA");
        double gpa = scanner.nextDouble();

        // To take boolean as a input;

        System.out.println("Are you a student: ");
        boolean is_student = scanner.nextBoolean();

        System.out.println("Hello, " + name );
        System.out.println("You are " +age + " years old");
        System.out.println("You have a " + gpa + " gpa");

        if(is_student){

            System.out.println("You are a student");
        }
        else{
            System.out.println("You are not a student");
        }
        scanner.close();
    }
}
