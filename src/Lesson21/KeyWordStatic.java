package Lesson21;

public class KeyWordStatic {
    public static void main(String []args){
        Human h1 = new Human ("Artem",33);
        Human h2 = new Human ("Vova",39);
        Human h3 = new Human ("Masha", 18);
        /*Human.description = "Hello";
        Human.getDescription();
        h1.getAllFields();
        h2.getAllFields();
        Human.description = "Bad";
        h1.getAllFields();
        h2.getAllFields();*/
        h1.printNumberOfPeople();
        h2.printNumberOfPeople();
        h3.printNumberOfPeople();

        System.out.println(Math.pow(2,4));
        System.out.println(Math.PI);
    }
}

class Human {

    private String name;
    private int age;

    private static int countPeople;

    public static String description;

    public Human(String name, int age){
        //System.out.println("Hi from the third constructor");
        this.name = name;
        this.age = age;
        countPeople++;
    }

    public void setName(String name){
        this.name = name;
    }
    public void setAge(int age){
        this.age = age;
    }

    public static int getCountPeople() {
        return countPeople;
    }

    public void printNumberOfPeople(){
        System.out.println(countPeople);
    }

    /*public static void getDescription(){
        System.out.println(description);
    }*/

    /*public void getAllFields(){
        System.out.println(name + ", " + age + ", " + description);
    }

    public static void printAllFields(){
        System.out.println(name);
    }*/
}