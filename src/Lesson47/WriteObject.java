package Lesson47;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class WriteObject {
    public static void main(String[] args) {
        Person[] people = {new Person(1, "Alexander"), new Person(2, "Vladimir"), new Person(3, "Anna")};

        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("People.bin"))) {
            //FileOutputStream fos = new FileOutputStream("People.bin");
            //ObjectOutputStream oos = new ObjectOutputStream(fos);

            // The first method
            /*oos.writeInt(people.length);

            for(Person person : people) {
                oos.writeObject(person);
            }*/

            // The second method
            oos.writeObject(people);

            //oos.close();

            System.out.println("Data has been written!");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}