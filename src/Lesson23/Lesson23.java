package Lesson23;

public class Lesson23 {
    public static void main (String []args){
        /*String x = "hello";
        //String y = new String("Hello");
        x = x.toUpperCase();
        System.out.println(x);*/

        /*String string1 = "Hello";
        String string2 = ", my";
        String string3 = " friend";
        String stringAll = string1 + string2 + string3;
        System.out.println(stringAll);*/

        StringBuilder sb = new StringBuilder("Hello");
        System.out.println(sb.toString());
        //sb.append(", my");
        //sb.append(" friend");
        sb.append(", my").append(" friend");
        System.out.println(sb.toString());
    }
}
