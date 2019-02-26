import java.util.List;

public class Application {
    public static void main(String[] args) {
        NotesList myNotes = new NotesList();

        System.out.println(myNotes.size());

        for (int i = 0; i < 30; i++) {
            myNotes.add("note " + i);
        }

        System.out.println(myNotes.size());
        System.out.println(myNotes.get(myNotes.size() - 1));


        for (int i = 30; i < 60; i++) {
            myNotes.add("note " + i);
        }
        myNotes.print();
        System.out.println();
        System.out.println(myNotes.size());
        System.out.println(myNotes.remove(30));
        System.out.println(myNotes.size());
        myNotes.print();
        System.out.println();
        System.out.println(myNotes.remove("note 58"));
        System.out.println(myNotes.size());

        System.out.println(myNotes.isEmpty());
        myNotes.print();
        myNotes.clear();
        System.out.println(myNotes.size());
        System.out.println(myNotes.isEmpty());
    }
}
