import java.util.Scanner;

public class WhileLoop {
    // Make sure user enter their name . Empty field isn't accepted;

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your name: ");
        String name = scanner.nextLine();

        while(name.isEmpty()) {

            System.out.println("You can't leave the field blank");
            name = scanner.nextLine();
        }

        System.out.println("Hello, " + name);



        scanner.close();
    }
}
