package Lesson14;

public class ClassesAndObjects {
    public static void main(String []args){
        Person person1 = new Person();
        person1.name = "Artem";
        person1.age = 33;
        System.out.println("My name is " + person1.name + ", " + "I'm " + person1.age);
        Person person2 = new Person();
        person2.name = "Vova";
        person2.age = 39;
        System.out.println("My name is " + person2.name + ", " + "I'm " + person2.age);
    }
}

class Person {
    String name;
    int age;
}