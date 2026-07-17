/*
Notes:

math class is a static class;

1. Rounding the numbers;

Math.ceil(x);     Math.floor(x)      Math.round(x)


2. Power and Sqrt;

Math.pow(2,3)    Math.sqrt(x);


3. Basic Arithmetic:

Math.abs(-x)    Math.max(a,b)    Math.min(a,b);


4. Built in Constrant

Math.random()     Math.PI     Math.E

*/


//Based on the notes let's try to find hypotenuse of a triangle

import java.util.Scanner;

public class MathClass {
    
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        
        System.out.println("Enter the perpendicular of the triangle: ");
        int p = scanner.nextInt();

        System.out.println("Enter the Base of the triangle: ");
        int b = scanner.nextInt();

        double h = Math.sqrt(Math.pow(p,2) + Math.pow(b,2));

        System.out.println(Math.round(h) + " Units");

        scanner.close();

    }
}
