package Intro;

public class Test {

        public static void main(String[] args) {

            StaticTest test = new StaticTest("whatever");

            System.out.println("model is " + test.getModel());
            System.out.println(test.getInstanceNum());

            StaticTest test2 = new StaticTest("w/e");

//            System.out.println(test.getInstanceNum());
            System.out.println("model is + " + test2.getModel());
            System.out.println(test2.getInstanceNum());


            System.out.println("tatatart");
            System.out.println(StaticTest.getInstanceNum());

        }
}
