package Lesson24;

public class Lesson24 {
    public static void main(String []args){
        Human human1 = new Human("Artem",33);
        human1.toString(); // toString is a hidden method
        System.out.println(human1);
    }
}

class Human {
    private String name;
    private int age;

    public Human(String name, int age){
        this.name = name;
        this.age = age;
    }

    public String toString(){
        return name+", "+age;
    }

}