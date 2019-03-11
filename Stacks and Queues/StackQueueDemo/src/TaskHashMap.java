import java.util.HashMap;

public class TaskHashMap {

    public static void main(String[] args) {
        HashMap<String, String> dictionary = new HashMap<>();

        addToDictionary(dictionary);
    }

    private static void addToDictionary(HashMap<String, String> dictionary) {
        dictionary.put("dog", "куче");
        dictionary.put("cat", "котка");
        dictionary.put("snake", "змия");
        dictionary.put("mouse", "мишка");

        printDictionaryValues(dictionary);
    }

    private static void printDictionaryValues(HashMap<String, String> dictionary) {
        System.out.println(dictionary.get("dog"));
        System.out.println(dictionary.get("cat"));
        System.out.println(dictionary.get("snake"));
        System.out.println(dictionary.get("mouse"));
    }

}
