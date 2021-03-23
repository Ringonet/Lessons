package Lesson11;

public class Arrays {
    public static void main(String []args){
        //int number = 10; //primitive data type    [10]
        //char ch = 'a'; //primitive data type
        //String s = "Hello";
        //String s1 = new String("Hello");
        int[] numbers = new int[5]; //numbers -> [massive]  reference data type
        //System.out.println(numbers[0]); // indexes 0 1 2 3 4
        //System.out.println(numbers[4]);
        for(int i = 0; i<numbers.length; i++){
            numbers[i] = i*10;
            //System.out.println(i);
            System.out.println(i + " is " + numbers[i]);
        }
        /*for(int i = 0; i < numbers.length; i++){
            System.out.println(numbers[i]);
        }*/
        System.out.println();
        /*int[] numbers1 = {135,7,280,1024,1,-17,56};
        for(int i = 0; i<numbers1.length; i++){
            System.out.println(numbers1[i]);*/
        int[] numbers1 = {135,7,280,1024,1,-17,56};
        for (int value : numbers1) {
            System.out.println(value);
        }
    }
}
