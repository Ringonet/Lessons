package Lesson16;

public class Methods2 {
    public static void main(String []args){
        Person person1 = new Person();
        person1.name = "Artem";
        person1.age = 33;
        //person1.speak();
        //person1.sayHello();
        Person person2 = new Person();
        person2.name = "Vova";
        person2.age = 39;
        //person2.speak();
        //person1.calculateYearsToRetirement();
        //person2.calculateYearsToRetirement();
        int year1 = person1.calculateYearsToRetirement();
        int year2 = person2.calculateYearsToRetirement();
        System.out.println("The first person is " + year1 + " years away from retirement");
        System.out.println("The second person is " + year2 + " years away from retirement");
    }
}

class Person {
    String name;
    int age;

    int calculateYearsToRetirement() {
        int years = 65 - age;
        return years;
    }

    /*void calculateYearsToRetirement(){
        int years = 65-age;
        System.out.println("Years to retirement is " + years);
    }*/

    void speak(){
        for (int i = 0; i < 3; i++) {
            System.out.println("My name is " + name + ", " + "I am " + age + " years old");
        }
    }
    void sayHello(){
        System.out.println("Hello!");
    }
}