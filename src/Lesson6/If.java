package Lesson6;

public class If {
    public static void main(String[] args){
        int myInt = 15;
        if(myInt < 10){
            System.out.println("Да, верно");
        }else if (myInt < 20){
            System.out.println("Нет, не верно");
        }else{
            System.out.println("Не подходит ни один из случаев");
        }
    }
}
