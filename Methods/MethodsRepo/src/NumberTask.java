public class NumberTask {

    public static void main(String[] args) {
        System.out.println(isOdd(4));
    }

    public static boolean isOdd(int number) {
        boolean isOdd = (number % 2 == 0) ? false : true;
        return isOdd;
    }
}
