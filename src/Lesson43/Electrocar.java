package Lesson43;

public class Electrocar {
    private int id;
    //private static int test;

    // non-static nested class
    private class Motor {
        public void startMotor() {
            System.out.println("Motor " + id + " is starting.");
        }
    }

    // static nested class
    public static class Battery {
        public void charge() {
            System.out.println("Battery is charging."/* + test*/);
        }
    }

    public Electrocar(int id) {
        this.id = id;
    }

    public void start() {
        Motor motor = new Motor();
        motor.startMotor();

        // inner nested class

        final int x = 1; // only constant (final)

        class SomeClass {
            public void someMethod() {
                System.out.println(x);
                System.out.println(id);
            }
        }

        SomeClass someObject = new SomeClass();

        System.out.println("Electrocar " + id + " is starting.");
    }

    private void test(Object object) {

    }
}
