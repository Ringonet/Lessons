package Lesson46;

import java.io.*;

public class WriteObject {
    public static void main(String[] args) {
        Person[] people = {new Person(1, "Artem"), new Person(2, "Artem"), new Person(3, "Anna")};

        try {
            FileOutputStream fos = new FileOutputStream("People.bin");
            ObjectOutputStream oos = new ObjectOutputStream(fos);

            // The first method
            /*oos.writeInt(people.length);

            for(Person person : people) {
                oos.writeObject(person);
            }*/

            // The second method
            oos.writeObject(people);

            fos.close();

        System.out.println("Data has been written!");
    } catch (IOException e) {
            e.printStackTrace();
        }
    }
}