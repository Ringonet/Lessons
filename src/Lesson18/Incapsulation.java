package Lesson18;

public class Incapsulation {
    public static void main(String []args){
        Person person1 = new Person();
        person1.setName("");
        person1.setAge(0);
        System.out.println("Output the value to the main method: " + person1.getName());
        System.out.println("Output the value to the main method: " + person1.getAge());
        person1.speak();

    }
}

class Person {
    private String name;
    private int age;

    public void setName(String userName){
        if(userName.isEmpty()){
         System.out.println("You enter an empty name");
        } else{
        name = userName;
        }
    }
    public String getName(){
        return name;
    }
    public void setAge(int userAge){
        if(userAge <= 0){
            System.out.println("You entered a negative number or a zero");
        } else{
        age = userAge;}
    }
    public int getAge(){
        return age;
    }

    void speak(){
        //for (int i = 0; i < 3; i++) {
            if(name.isEmpty()){
            } else{
                System.out.println("My name is " + name + ", " + "I am " + age + " years old");
            }
        //}
    }
    void sayHello(){
        System.out.println("Hello!");
    }
}