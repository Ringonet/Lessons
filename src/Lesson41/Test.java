package Lesson41;

public class Test {
    public static void main(String[] args) {
        //Animal animal = new Animal(); // This is abstract class
        Cat cat = new Cat();
        Dog dog = new Dog();
        cat.makeSound();
        dog.makeSound();
        //cat.eat();
        dog.eat();
    }
}
