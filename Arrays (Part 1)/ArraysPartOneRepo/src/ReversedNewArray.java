public class ReversedNewArray {

    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        int[] newArray = new int[numbers.length];

        //first version
        for (int i = 0; i < numbers.length; i++) {
            newArray[i] = numbers[numbers.length - 1 - i];
        }

        //second version
        int j = 0;
        for (int i = numbers.length - 1; i >= 0; i--) {
            newArray[j] = numbers[i];
            j++;
        }

        for (int i : newArray) {
            System.out.println(i);
        }

    }
}
