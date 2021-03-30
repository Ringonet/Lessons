package Lesson36;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class ReadingFromFile {
    public static void main(String[] args) throws FileNotFoundException {
        //String separator = File.separator;
        //String path = "\\Users\\Artem\\IdeaProjects\\test2.txt";
        //String path = separator + "Users" + separator + "Artem" + separator + "IdeaProjects" + separator + "test.txt";

        //File file = new File(path);
        File file = new File("test2");

        //Scanner scanner = new Scanner(System.in);
        Scanner scanner = new Scanner(file);
        String line = scanner.nextLine();
        String[] numbersString = line.split(" ");
        int[] numbers = new int[5];
        int counter = 0;
        /*while(scanner.hasNextLine()){
            System.out.println(scanner.nextLine());
        }*/

        for(String number :numbersString) {
            numbers[counter++] = Integer.parseInt(number);
        }

        System.out.println(Arrays.toString(numbers));
        //System.out.println(numbers);

        scanner.close();
    }
}
