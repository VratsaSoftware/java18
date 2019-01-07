import java.util.Arrays;

public class SplitText {

    public static void main(String[] args) {
        String text = "Java is cool";
        System.out.println(Arrays.toString(splittedText(text)));
    }

    private static String[] splittedText(String text) {
        return text.split(" ");
    }
}
