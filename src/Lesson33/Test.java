package Lesson33;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String []args){
        /// Java 5 ///
        List animals = new ArrayList();
        Animal ourAnimal = new Animal();
        animals.add("cat"); // index 0
        animals.add("dog"); // index 1
        animals.add("frog"); // index 2
        animals.add(ourAnimal);

        String animal = (String) animals.get(3);
        System.out.println(animal);

        /// With appearing of generics ///
        List<String> animals2 = new ArrayList<String>();
        animals2.add("cat"); // index 0
        animals2.add("dog"); // index 1
        animals2.add("frog"); // index 2

        String animal2 = animals2.get(1);

        /// Java 7 ///
        List<String> animals3 = new ArrayList<>();
        animals3.add("cat"); // index 0
        animals3.add("dog"); // index 1
        animals3.add("frog"); // index 2
    }
}

class Animal {

}