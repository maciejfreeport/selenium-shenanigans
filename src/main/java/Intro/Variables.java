package Intro;

public class Variables {

    public static void main(String[] args) {

        byte myByte = 127;

        float myFloat = 2.1234566789f;

        System.out.println(myFloat);

        String str1 = "Hello";

        String str2 = "I love Java";

        System.out.println(str1.replace('e', 't'));

        String output = str2.substring(7,11);
        System.out.println(output);

        Car bmw = new Car();

        bmw.setModel("test");

        System.out.println(bmw.getModel());

        Car honda = new Car();

        honda.setModel("honda");

        System.out.println(honda.getModel());

    }
}