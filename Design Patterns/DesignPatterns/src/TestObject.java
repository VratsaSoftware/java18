public class TestObject {

    private static TestObject instance;
    private String text;

    private TestObject() {
    }

    public static TestObject getInstance() {
        if (instance == null) {
            instance = new TestObject();
        }
        return instance;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
