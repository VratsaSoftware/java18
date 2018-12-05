public class ConcatenateNameTask {

    public static void main(String[] args) {
        String firstName = "Lilly";
        String lastName = "Mihaylova";
        System.out.println(concatenateName(firstName, lastName));
    }

    public static String concatenateName(String firstName, String lastName) {
        return firstName + " " + lastName;
    }
}
