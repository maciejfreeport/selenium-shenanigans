package Intro;

public class Arrays {

    public static void main(String[] args) {

        int[] myArray1 = new int[3];

        myArray1[0] = 5;
        myArray1[1] = 10213;
        myArray1[2] = 3;

        int[] myArray2 = new int[5];

        int[] myArray3 = {3, 5, 6};

        System.arraycopy(myArray1, 0, myArray2, 1, 3);


        for(int i = 0; i < myArray2.length; i++) {

            System.out.println("myArray2 index" + i + " is " + myArray2[i]);
        }

        for(int index: myArray3) {
            System.out.println("Array3 index " + index);
        }


    }

}
