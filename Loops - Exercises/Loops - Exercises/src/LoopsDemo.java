import java.util.Scanner;

public class LoopsDemo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
//        int b;
//        int a;
//
//        do {
//            System.out.println("Моля въведете първото число: ");
//            a = input.nextInt();
//            System.out.println("Моля въведете второто число или 0 за изход: ");
//            b = input.nextInt();
//
//            System.out.println(getSum(a, b));
//        } while (b != 0);


        System.out.println("Моля въведете вашите години:");
        byte age = input.nextByte();
        byte number = 1;
        double totalPrice = 0;

        if (age >= 18) {
            while (number != 0) {
                System.out.println("Моля изберете напитка: \n1 - Уиски 2.40лв." +
                        "\n2 - Водка 1.50лв.\n3 - Бренди 3лв.\n4 - Ракия 2лв.\n0 - Сметката моля!");
                number = input.nextByte();
                totalPrice += buyDrink(number);
                if (number != 0) {
                    System.out.println("Сметката ви до момента е: " + totalPrice + "лв.");
                }
            }
            System.out.println("Крайната сметка е: " + totalPrice + "лв." );
        } else {
            System.out.println("Непълнолетен си, не можеш да пиеш!");
        }

        System.out.println("Довиждане, заповядайте отново, ако успеете да се приберете жив!");
    }

    private static double buyDrink(byte number) {

        switch (number) {
            case 1:
                System.out.println("Заповядайте твоето уиски");
                return 2.40;
            case 2:
                System.out.println("Заповядайте твоята водка");
                return 1.50;
            case 3:
                System.out.println("Заповядайте твоето бренди");
                return 3;
            case 4:
                System.out.println("Заповядайте твоята ракия");
                return 2;
            default:
                System.out.println("Моля изберете от изброените напитки!");
                return 0;
        }
    }


    public static int getSum(int a, int b) {
        return a + b;
    }

    public static void printRange(int number) {
        for (int i = 33; i < number; i++) {
            if (i % 11 == 0 && i % 3 == 0) {
                System.out.println(i);
            }
        }
    }
}
