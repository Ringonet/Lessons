package Lesson05;

public class ForLoop {
    public static void main(String[] args){
        for(int i = 10; i >= 0;i = i-=5){    // i++ == i = i+1  (true)
            System.out.println("Hello " + i);
        }
    }
}
