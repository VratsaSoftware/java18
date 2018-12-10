import java.util.Scanner;

public class StarsTask {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter n");
        int n = input.nextInt();

//        First part (Task 3)
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
//        Second past (Task 4)
        for (int i = n - 1; i >= 0; i--) {
            for (int j = i; j > 0; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
