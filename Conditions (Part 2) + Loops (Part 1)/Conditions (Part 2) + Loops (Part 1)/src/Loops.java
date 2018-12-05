import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        int number = input.nextInt();

//        printRange(1, 100000);

//        loopTest();

//        printSum(8812331);


        Scanner input = new Scanner(System.in);

//        printMultiplication(input.nextInt());

//        selectNumbers(input);

//        printSumInRange(0);

//        printEvenNumbers(30);

//        multiplication(0);

        printSumInRange(2, 10);
    }

    public static void multiplication(int end) {
        int mult = 1;
        int i = 1;

        while (i <= end) {
            mult *= i;
            i++;

            System.out.println(mult);
        }

        if (end == 0) {
            System.out.println("0");
        } else {
            System.out.println(mult);
        }
    }

    public static void printEvenNumbers(int end) {
        int counter = 1;

        while (counter <= end) {

            if (counter % 2 != 0) {
                counter++;
                continue;
            }

            System.out.println(counter);
            counter++;
        }
    }

    public static void printSumInRange(int number) {
        int counter = 1;
        long sum = 0;

        do {
            sum += counter;
            counter++;
        } while (counter <= number);

        System.out.println("Sum is: " + sum);
    }

    private static void selectNumbers(Scanner input) {
        int number = 0;

        do {
            System.out.println("Select number!");
            number = input.nextInt();
        } while (number != 0);
    }

    public static void printMultiplication(int number) {
        int product = 1;

        while (number != 0) {
            int lastDigit = number % 10;
            System.out.println(lastDigit);

            product *= lastDigit;
            System.out.println(product);

            number = number / 10;
            System.out.println(number);
        }

        System.out.println("Product is: " + product);
    }

    public static void printSum(int number) {
        int sum = 0;

        while (number != 0) {
            int lastDigit = number % 10;
            sum += lastDigit;
            number = number / 10;
        }

        System.out.println("Sum is: " + sum);
    }

    public static void loopTest() {

        Scanner input = new Scanner(System.in);
        int number = 1;

        while (number != 0) {
            System.out.println("Select Next Number!");
            number = input.nextInt();
        }

        System.out.println("Goodbye");
    }

    public static void printSumInRange(int start, int end) {
        long sum = 0;

        while (start <= end) {
            sum += start;
            start++;
        }

        System.out.println(sum);
    }


    public static void printRange(int start, int end) {

        while (start <= end) {
            System.out.println(start);
        }

        System.out.println("OUT");
    }

}
