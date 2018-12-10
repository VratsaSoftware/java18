import java.util.Scanner;

public class MultipleNumbersTask {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number");
        int n = input.nextInt();

        for (int i = 0; i <= n; i++) {
            if ((i % 3 == 0) || (i % 5 == 0)) {
                System.out.println(i);
            }
        }
    }
}
