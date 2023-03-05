import java.util.Random;

public class Calculation {

    public static void main(String[] args) {
//3.1
        int length = 15;

        int[] myArray;
        myArray = new int[length];
        Random rd = new Random();

        for (int i = 1; i < length; i++) {
            myArray[i] = rd.nextInt();
            System.out.println(rd.nextInt() + myArray[i]);
        }
//3.2
        int[] secondArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        int[] evenArray = new int[5];
        for (int i = 0; i < secondArray.length; i++) {
            if (secondArray[i] % 2 == 0) {
                System.out.println(" Number: " + secondArray[i]);
            }


        }
    }
}







