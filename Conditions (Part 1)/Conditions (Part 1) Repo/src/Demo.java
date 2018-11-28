import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
//        System.out.println("Моля въведете число:");
//        int number = input.nextInt();
//
//        int first = number / 1000;
//        int second = number %1000 / 100;
//        int third = number % 100 / 10;
//        int fourth = number % 10;
//
//        System.out.println("" + first + second + third + fourth + " -> ");
//
//        if (first == fourth && second == third) {
//            System.out.println("true");
//        } else {
//            System.out.println("false");
//        }

        System.out.println("Моля въведете валута - USD, EUR или GBP: ");
        String currency = input.next();
        System.out.println("Моля въведете сума: ");
        double value = input.nextInt();

        if (currency.equals("USD")) {
            System.out.println(value * 1.7408 + " BGN");
        } else if (currency.equals("EUR")) {
            System.out.println(value * 1.9557 + " BGN");
        } else if (currency.equals("GBP")) {
            System.out.println(value * 2.6415 + " BGN");
        } else {
            System.out.println("Моля изберете една от трите валути!");
        }

    }
}
