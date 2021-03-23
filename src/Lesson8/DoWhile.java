package Lesson8;

import java.util.Scanner;

public class  DoWhile {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int x;
        System.out.println("Введите число 5.");
        do {
            x = sc.nextInt();

            if(x != 5){
                System.out.println("Вы ввели число " + x + ", а нужно ввести число 5.");
            }
            else System.out.println("Поздравляю, вы ввели число 5!");

        }while(x != 5);

    }
}
