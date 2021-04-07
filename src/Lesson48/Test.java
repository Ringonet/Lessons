package Lesson48;

public class Test {
    private static final int dog = 0;
    private static final int cat = 1;
    private static final int frog = 2;

    public static void main(String[] args) {
        int animal = dog;

        switch (animal) {
            case dog:
                System.out.println("It's a dog");
                break;
            case frog:
                System.out.println("It's a frog");
                break;
            default:
                System.out.println("It's not an animal");
        }

    }
}
