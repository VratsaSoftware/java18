public class HasSix {

    public static void main(String[] args) {
        int[] numbers = {6, 9, 6, 7, 3, 5};

        if (numbers[0] == 6 || numbers[numbers.length - 1] == 6) {
            System.out.println(true);
        } else {
            System.out.println(false);

        }

    }
}
