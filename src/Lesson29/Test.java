package Lesson29;

public class Test {
    public static void main(String []args){
        Animal animal = new Animal();
        Dog dog = new Dog();
        Cat cat = new Cat();
        //Animal animal = new Dog();

        //animal.bark();   // not allowed
        dog.bark();
        animal.eat();
        dog.eat();

        test(animal);
        test(dog);
        test(cat);

    }

    public static void test(Animal animal){
        animal.eat();
    }
}