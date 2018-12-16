public class МultipliedIndex {

    public static void main(String[] args) {
        int[] numbers = new int[20];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = i * 5;
        }

        for (int i : numbers) {
            System.out.println(i);
        }

    }
}
