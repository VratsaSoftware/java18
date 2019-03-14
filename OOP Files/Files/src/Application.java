import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        List<String> unsortedNames = readFile("my_demo_file.txt");
        List<String> sortedNames = sortNames(unsortedNames);
        writeNamesToFile(sortedNames, "my_demo_file2.txt");
    }

    private static List<String> sortNames(List<String> unsortedNames) {
        Collections.sort(unsortedNames);
        return unsortedNames;
    }

    private static void writeNamesToFile(List<String> names, String fileName) {
        PrintStream printStream = null;
        try {
            printStream = new PrintStream(fileName);
            for (String name : names) {
                printStream.println(name);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } finally {
            if (printStream != null) {
                printStream.close();
            }
        }
    }

    private static List<String> readFile(String fileName) {
        File file = new File(fileName);
        List<String> names = new ArrayList<>();
        Scanner scanner = null;
        try {
            scanner = new Scanner(file, "UTF-8");
            while (scanner.hasNextLine()) {
                names.add(scanner.nextLine());
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            System.out.println("File not found!");
        } finally {
            if (scanner != null) {
                scanner.close();
            }
        }
        return names;
    }
}
