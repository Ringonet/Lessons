package Lesson37;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/*public class Exceptions1 {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("asdf");

        Scanner scanner = new Scanner(file);
    }
}*/

public class Exceptions1 {
    public static void main(String[] args) {
        try {
            readFile();
        } catch (FileNotFoundException e) {
            System.out.println("Exception handling in the main method");
        }
        /*File file = new File("test");

        try {
            Scanner scanner = new Scanner(file);
        } catch (FileNotFoundException e) {
            //e.printStackTrace();
            System.out.println("File not found");
        }
        System.out.println("After the try catch block");*/
    }

    public static void readFile() throws FileNotFoundException {
        File file = new File("Test21");
        Scanner scanner = new Scanner(file);

    }
}
