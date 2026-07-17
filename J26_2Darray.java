public class J26_2Darray {
    
    public static void main(String[] args){

        // Let's design a 3X3 matrix;

        int[][] matrix = {
                        {1,2,3},
                        {4,5,6},
                        {7,8,9}};
    

    //Accessing the elements of a 2D array via array indexing;

    //Get the element from row 1 and column 2;

        System.out.println(matrix[0][1]);

        //Let's iterate over a 2D array:

        for(int i = 0; i < matrix.length; i++){

            for(int j=0; j < matrix[i].length; j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        }
}
