import java.util.Arrays;

public class ArraysDemo {
    public static void main(String[] args) {
        int[][] matrix = {
                {4, 6, 2, 5},
                {7, 9, 4, 8},
                {6, 9, 3, 7}
        };

        double sum = 0;

        for (int i = 0; i < matrix[1].length; i++) {
            sum += matrix[1][i];
        }

        System.out.println(sum / matrix[2].length);

        int[] array = new int[matrix.length * matrix[0].length];

        int index = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                array[index] = matrix[i][j];
                index++;
            }
        }

        sortArray(array);

        System.out.println(Arrays.toString(array));
    }

    private static void sortArray(int[] array) {
        int temp = 0;

        for (int i = 0; i < array.length; i++) {
            for (int j = 1; j < array.length - i; j++) {
                if (array[j - 1] > array[j]) {
                    temp = array[j - 1];
                    array[j - 1] = array[j];
                    array[j] = temp;
                }
            }
        }
    }
}
