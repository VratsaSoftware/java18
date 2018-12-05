import java.util.Scanner;

public class Conditions {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int selectedMonth = input.nextInt();

//        printMonth(selectedMonth);

        String numberAsLetter = numbersToLetters(selectedMonth);

        System.out.println(numberAsLetter);
    }

    public static String numbersToLetters(int num) {
        switch (num) {
            case 0:
                return "Нула";
            case 1:
                return "Едно";
            case 2:
                return "Две";
            case 3:
                return "Три";
            case 4:
                return "Четири";
            case 5:
                return "Пет";
            case 6:
                return "Шест";
            case 7:
                return "Седем";
            case 8:
                return "Осем";
            case 9:
                return "Девет";

            default: return "Моля въведете число от 0 до 9";
        }
    }

    public static void printMonth(int monthNumber) {
        switch (monthNumber) {
            case 1:
                System.out.println("Януари");
                break;
            case 2:
                System.out.println("Февруари");
                break;
            case 3:
                System.out.println("Март");
                break;
            case 4:
                System.out.println("Април");
                break;
            case 5:
                System.out.println("Май");
                break;
            case 6:
                System.out.println("Юни");
                break;
            case 7:
                System.out.println("Юли");
                break;
            case 8:
                System.out.println("Август");
                break;
            case 9:
                System.out.println("Септември");
                break;
            case 10:
                System.out.println("Октомври");
                break;
            case 11:
                System.out.println("Ноември");
                break;
            case 12:
                System.out.println("Декември");
                break;

            default:
                System.out.println("Моля въведете коректен номер на месеца от 1 до 12");
        }
    }

}
