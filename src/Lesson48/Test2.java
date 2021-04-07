package Lesson48;

public class Test2 {
    public static void main(String[] args) {
        Animal animal = Animal.CAT;
        System.out.println(animal.getTranslation());
        System.out.println(animal.toString());

//        switch (animal) {
//            case CAT:
//                System.out.println("It's a cat");
//                break;
//            case DOG:
//                System.out.println("It's a dog");
//                break;
//        }

        Season season = Season.SUMMER;
        System.out.println("Average temperature in " + season.name() + " is " + season.getTemperature());

//        // Object -> Enum -> Season

//        System.out.println(season instanceof Enum);
//        System.out.println(season.getClass());

//        switch (season) {
//            case SUMMER:
//                System.out.println("It's warm outside");
//                break;
//            case WINTER:
//                System.out.println("It's cold outside");
//                break;
//        }
    }
}
