public class ReplaceText {

    public static void main(String[] args) {
        String text = "I study Java. Java is nice";
        replacedText(text);
    }

    private static void replacedText(String text) {
        System.out.println(text.replace("Java", "PHP"));
    }
}
