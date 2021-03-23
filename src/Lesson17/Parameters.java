package Lesson17;

public class Parameters {
    public static void main(String []args){
        Person person1 = new Person();
        person1.setName("Artem",33);
        person1.speak();
        Person person2 = new Person();
        String s1 = "Vova";
        person2.setName(s1,39);
        person2.speak();
    }
}

class Person {
    String name;
    int age;

    void setName(String userName, int userAge){
        name = userName;
        age = userAge;
    }

    int calculateYearsToRetirement() {
        int years = 65 - age;
        return years;
    }

    void speak(){
        //for (int i = 0; i < 3; i++) {
            System.out.println("My name is " + name + ", " + "I am " + age + " years old");
        //}
    }
    void sayHello(){
        System.out.println("Hello!");
    }
}