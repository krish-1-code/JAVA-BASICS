public class Variables {
    
    public static void main(String[] args) {

        // Variables are of 2 main types:

        // Primitive Datatype : int, double, bool, char - value is stored directly in memory (Stack);
        // Reference Datatype: string, array, object - value is stored in heap, but the memory address to that heap is in Stack;
    
    // To create a variable first you have to declare it then assign it;

        int age = 15;

        System.out.println("I am " + age +" years old");

        double temp = 99.97;

        System.out.println(temp);
        
        boolean is_student = true;
        
        System.out.println(is_student);

    
        String email = "krish@gmail.com";

        System.out.println("My email is " + email);
    }
}
