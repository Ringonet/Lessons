package Lesson9;

public class Break {
    public static void main(String []args){
        int i = 0;
        while(true){
            if (i==15){
                break;
            }
            System.out.println(i);
            i++;
        }
        System.out.println("We are out of the loop");
    }
}


