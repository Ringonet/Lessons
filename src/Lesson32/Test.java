package Lesson32;

import java.sql.SQLOutput;

public class Test {
    public static void main(String []args){
/*
        Dog dog = new Dog();
        // Upcasting - Восходящее преобразование
        Animal animal = dog;

        //Downcasting - Нисходящее преобразование
        Dog dog1 = (Dog) animal;
        dog1.bark();
*/
        Animal a = new Animal();
        Dog d = (Dog) a;
        //System.out.println();
        d.bark();
    }
}
