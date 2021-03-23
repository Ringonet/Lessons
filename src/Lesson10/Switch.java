package Lesson10;

import java.util.Scanner;

public class Switch {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Add your age");
        int age = sc.nextInt();
        switch(age){
            case 0 :
                System.out.println("You were born");
                break;
            case 7 :
                System.out.println("You went to school");
                break;
            case 18 :
                System.out.println("You were graduated school");
                break;
            default :
                System.out.println("None of  the conditions fit");
        }
    }
}
