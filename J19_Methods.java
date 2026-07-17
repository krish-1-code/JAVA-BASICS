public class Methods {

    //Task: User enter the marks of n students;
    // Design a method of Average marks; and Highest mark;

    public static void main(String[] args){

        System.out.printf("Average marks is %.2f",avgMarks(110, 12));
    }

    public static double avgMarks(int total, int noStudents){

        double avg = (double) total / noStudents;

        return avg;
       
    }
    
}
