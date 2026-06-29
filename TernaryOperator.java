public class TernaryOperator {
    
    public static void main(String[] args) {


        //Syntax : variable = (condition) ? iftrue : iffalse;

        //Write a ternary operator to find odd or even number;

        int num = 7;
        String OE = (7%2 == 0) ? "Even" : "Odd" ;

        System.out.println(OE);

        int age = 19;

        String elligible = (age >= 21) ? "You can drink" : "You can't drink";
        System.out.println(elligible);
    }
}
