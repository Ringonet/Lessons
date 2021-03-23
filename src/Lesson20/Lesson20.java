package Lesson20;

public class Lesson20 {
    public static void main(String []args){
        Human human1 = new Human("Artem",33);
        Human human2 = new Human();
        //human1.setName("Artem");
        //human1.setAge(33);
    }
}

class Human {
    private String name;
    private int age;

    public Human(){
        this.name = "Ivan";
        this.age = 18;
        System.out.println(name + ", " + age);
    }

    public Human(String name){
        System.out.println("Hi from the second constructor");
        this.name = name;
    }

    public Human(String name, int age){
        System.out.println("Hi from the third constructor");
        this.name = name;
        this.age = age;
    }

    public void setName(String name){
        this.name = name;
    }
    public void setAge(int age){
        this.age = age;
    }
}