package Lesson10;

import java.util.Scanner;

public class Switch2 {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Add your age");
        String age = sc.nextLine();
        switch(age){
            case "ноль" :
                System.out.println("You were born");
                break;
            case "семь" :
                System.out.println("You went to school");
                break;
            case "восемнадцать" :
                System.out.println("You were graduated school");
                break;
            default :
                System.out.println("None of  the conditions fit");
        }
    }
}