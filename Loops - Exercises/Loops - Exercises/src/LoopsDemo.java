import java.util.Scanner;

public class LoopsDemo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

//        int a;
//        int b;
//
//        do {
//            System.out.println("Моля въведете първото число: ");
//            a = input.nextInt();
//
//            System.out.println("Моля въведете второто число: ");
//            b = input.nextInt();
//
//            System.out.println(a + b);
//        } while (b != 0);


//
//        System.out.println("Моля въведете вашите години:");
//        byte age = input.nextByte();
//        byte number = 1;
//        double totalPrice = 0;
//
//        if (age >= 18) {
//            while (number != 0) {
//                System.out.println("Моля изберете напитка: \n1 - Уиски 2.40лв." +
//                        "\n2 - Водка 1.50лв.\n3 - Бренди 3лв.\n4 - Ракия 2лв.\n0 - Сметката моля!");
//                number = input.nextByte();
//                totalPrice += buyDrink(number);
//                if (number != 0) {
//                    System.out.println("Сметката ви до момента е: " + totalPrice + "лв.");
//                }
//            }
//            System.out.println("Крайната сметка е: " + totalPrice + "лв." );
//        } else {
//            System.out.println("Непълнолетен си, не можеш да пиеш!");
//        }
//
//        System.out.println("Довиждане, заповядайте отново, ако успеете да се приберете жив!");


        System.out.println("Моля въведете вашите години: ");
        int age = input.nextInt();
        if (age >= 18) {

            byte drinkType = 1;
            double totalPrice = 0;

            while (drinkType != 0){
                printMenu();
                drinkType = input.nextByte();
                totalPrice += buyDrink(drinkType);
                if (drinkType != 0) {
                    System.out.println("Сметката ви до момента е: " + totalPrice);
                }
            }

            System.out.println("Крайната ви сметка е " + totalPrice
                    + " Плащай и си отивай право вкъщи, пияндурник!");
        } else {
            System.out.println("Непълнолетен си, довиждане!");
        }

    }

    private static void printMenu() {
        System.out.println("Моля изберете опция от менюто:\n1 - Уиски 2.40лв.\n2 - Водка 1.50лв." +
                "\n3 - Бира 1лв.\n4 - Ракия 3лв.\n0 - Сметката моля!");
    }

    private static double buyDrink(byte number) {
        double whiskeyPrice = 2.4;
        double vodkaPrice = 1.5;
        double beerPrice = 1;
        double rakiyaPrice = 3;

        switch (number) {
            case 1:
                System.out.println("Заповядай твоето уиски");
                return whiskeyPrice;
            case 2:
                System.out.println("Заповядай твоята водка");
                return vodkaPrice;
            case 3:
                System.out.println("Заповядай твоята бира");
                return beerPrice;
            case 4:
                System.out.println("Заповядай твоята ракия");
                return rakiyaPrice;
            case 0:
                System.out.println("Довиждане, заповядайте отново!");
                return 0;
            default:
                System.out.println("Моля изберете от изброените напитки!");
                return 0;
        }
    }

    public static void printRange(int number) {
        for (int i = 11; i < number; i++) {
            if (i % 11 == 0  && i % 3 == 0) {
                System.out.println(i);
            }
        }
    }
}
