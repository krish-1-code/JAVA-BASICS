import java.util.Scanner;

public class IFstatements {
    
// Task find the greatest number among 3 numbers using logical operators;

    // if(){} else if(){} else{}

        public static void main(String[] args){

            Scanner scanner = new Scanner(System.in);

            System.out.println("Enter first num: ");
            int a = scanner.nextInt();

            System.out.println("Enter second num: ");
            int b = scanner.nextInt();

            System.out.println("Enter third num: ");
            int c = scanner.nextInt();

            if(a>b & b>c){
                System.out.println( a + " is greater");
            }
            else if(b>a & b>c){
                System.out.println(b + " is greater");
            }
            else {
                System.out.println(c + " is greater");
            }

            scanner.close();
        }

    }
