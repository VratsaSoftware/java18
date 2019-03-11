import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class TaskQueue {

    public static void main(String[] args) {
        Queue queue = new LinkedList();
        getMessages(queue);
    }

    private static void getMessages(Queue queue) {
        String message = "";
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number of message");
        int messageNum = scanner.nextInt();
        scanner.nextLine();
        for (int i = 0; i < messageNum; i++) {
            System.out.println("Enter message " + (i + 1));
            message = scanner.nextLine();
            recordMessage(message, queue);
        }
        printQueue(queue);
    }

    private static void recordMessage(String message, Queue queue) {
        queue.offer(message);
    }

    private static void printQueue(Queue queue) {
        while (queue.size() > 0) {
            System.out.println(queue.poll());
        }
    }
}
