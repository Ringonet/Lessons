package Lesson47;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.Arrays;

public class ReadObject {
    public static void main(String[] args) {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("people.bin"))) {
            //FileInputStream fis = new FileInputStream("people.bin");
           // ObjectInputStream ois = new ObjectInputStream(fis);

            // The first method
            /*int personCount = ois.readInt();
            Person[] people = new Person[personCount];

            for (int i =0; i < personCount; i++) {
                people[i] = (Person) ois.readObject();
            }*/

            // The second method
            Person[] people = (Person[]) ois.readObject();

            System.out.println(Arrays.toString(people));
            
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
