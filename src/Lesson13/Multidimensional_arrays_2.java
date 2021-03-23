package Lesson13;

public class Multidimensional_arrays_2 {
    public static void main(String []args){
        int[][] matrix = {{1,2,3},
                          {4,5,6},
                          {7,8,9,10,11,12}};

        for(int i = 0; i<matrix.length; i++){  //for loop
            for(int j = 0; j<matrix[i].length;j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println(); //Empty line

        for (int[] int1 : matrix) {   //enhanced for loop
            for (int int2 : int1) {
                System.out.print(int2 + " ");
            }
            System.out.println();
        }
    }
}
