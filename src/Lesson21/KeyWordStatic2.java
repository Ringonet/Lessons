package Lesson21;

public class KeyWordStatic2 {
    public static void main(String []args){
        Human2 h1 = new Human2 ("Artem",33);
        Human2 h2 = new Human2 ("Vova",39);
        Human2 h3 = new Human2 ("Masha", 18);
        Human2.printAllInformation();
    }
}

class Human2 {

    private static int numberInOrder;
    private String name;
    private int age;
    private static int countPeople;

    public Human2(String name, int age){
        //numberInOrder;
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

    public int getCountPeople() {
        return countPeople;
    }

    public static void printAllInformation(){
       {numberInOrder++;
           System.out.println(numberInOrder);
       }
    }

}