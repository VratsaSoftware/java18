public class EvenNumbersTask {

    public static void main(String[] args) {
        int number = 1000;

        for (int i = 0; i <= number; i += 2) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }

//        Second option when "i" updated with two steps
        for (int i = 0; i <= number; i += 2) {
            System.out.println(i);
        }
    }
}
