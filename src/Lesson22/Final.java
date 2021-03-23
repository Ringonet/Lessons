package Lesson22;

public class Final {
    public static void main(String []args){
        //Test.CONSTANT = 10;
        final int X = 10;
        System.out.println(X);
    }

    class Test{
        public static final int CONSTANT = 0;

        /*public Test(int CONSTANT){
            this.CONSTANT = CONSTANT;
        }*/
        /*public void setCONSTANT(int x){
            this.CONSTANT = x;
        }*/
    }
}
