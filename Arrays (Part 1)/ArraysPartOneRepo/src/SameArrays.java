import java.util.Scanner;

public class SameArrays {

    public static void main(String[] args) {
        int flag = 0;
        int[] firstArray = new int[3];
        int[] secondArray = new int[3];
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < firstArray.length; i++) {
            System.out.println("Please, enter a number for first array:");
            firstArray[i] = input.nextInt();
        }
        for (int i = 0; i < secondArray.length; i++) {
            System.out.println("Please, enter a number for second array:");
            secondArray[i] = input.nextInt();
        }
        if (firstArray.length == secondArray.length) {
            for (int i = 0; i < secondArray.length; i++) {
                if (firstArray[i] != secondArray[i]) {
                    flag = 1;
                    break;
                }
            }
            if (flag == 1) {
                System.out.println("The arrays are different");
            } else {
                System.out.println("The array are same");
            }
        }

    }
}
