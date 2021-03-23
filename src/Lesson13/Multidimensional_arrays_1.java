package Lesson13;

public class Multidimensional_arrays_1 {
    public static void main(String []args){
        int[] number = {1,2,3};
        System.out.println(number[1]);
        /*
        * 1,2,3,4,5,0,-1,-2
        *
        * 156
        * 376 [1][1]
        * 268
         */
        int[][] matrix = {{1,2,3,4,5},
                          {4},
                          {7,8,9}};
        System.out.println(matrix[2][2]);
        System.out.println(matrix[1][0]);
        System.out.println(matrix[0][4]);

        int[] number1 = new int[5];

        String[][] strings = new String[2][3];
        strings[0][1] = "Hi!";
        System.out.println(strings[0][1]);
    }
}
