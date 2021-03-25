package Lesson28.Package1;

public class Test2 {
    public static void main(String []args){
        Person person1 = new Person();
        person1.name = "Artem";          //public modifier     -  allowed here
        person1.name2 = "Natasha";       //protected modifier  -  allowed here
        person1.name3 = "Vova";          //default modifier    -  allowed here
        person1.name4 = "Tanya";         //private modifier    -  not allowed here

    }
}
