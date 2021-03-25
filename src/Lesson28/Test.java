package Lesson28;

import Lesson28.Package1.Person;

public class Test {
    public static void main(String[] args) {
        Person person1 = new Person();
        person1.name = "Artem";          //public modifier     -  allowed here
        person1.name = "Natasha";       //protected modifier  -  not allowed here
        //person1.name = "Vova";          //default modifier    -  not allowed here
        //person1.name = "Tanya";         //private modifier    -  not allowed here

        person1.technicalMethod();
        person1.technicalMethod2();
        person1.technicalMethod3();
        person1.technicalMethod4();
    }
}
