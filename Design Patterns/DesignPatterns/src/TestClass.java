public class TestClass {

    public static void main(String[] args) {
        TestDemo testDemo = new TestDemo();
        TestObject testObject = TestObject.getInstance();
        System.out.println(testObject.getText());

    }
}
