package Lesson07;

import java.util.Scanner;

public class Input {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите любое число");
        int s = sc.nextInt();
        System.out.println("Вы ввели: " + s);
    }
}
