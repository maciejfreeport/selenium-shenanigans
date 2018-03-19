package Intro;

import java.util.Scanner;

public class ReverseCharacters {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a string that will be reversed for you, son\n");
        String testString = input.nextLine();

        while(testString.length() < 1 || testString == null) {
            System.out.println("what u doing son, u ain't entered nothing, try again\n");
            testString = input.nextLine();
            testString.length();
        }
        input.close();

        String output = ReverseCharacters(testString);

        System.out.println(output);

    }

    private static String ReverseCharacters(String text) {

        char[] array = text.toCharArray();
        String result = "";

            for (int i = text.length() - 1; i >= 0; i--) {
                result = result + array[i];
            }

        return result;
    }
}
