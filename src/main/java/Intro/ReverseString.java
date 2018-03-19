package Intro;

public class ReverseString {

    private static String reverse(String text) {

        String result = "";

        if(text.length() == 0 || text == null) {
            System.out.println("this is empty, son");
        }

        if (text.length() <= 1) {
            result = text;
        } else {

            String[] textArray = text.split("\\s+", 0);

            for (int i = 0; i < textArray.length; i++) {
                result = textArray[i] + " " + result;
            }
        }
        return result.trim();
    }


    public static void main(String[] args) {

        String testString = "this is a test string";

        System.out.println(reverse(testString));
    }
}
