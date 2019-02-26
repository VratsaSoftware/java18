import java.util.Arrays;

public class NotesList {
    public static int LIST_SIZE = 50;
    private String[] list;
    private int itemsCounter;

    public NotesList() {
        list = new String[LIST_SIZE];
        itemsCounter = 0;
    }

    public void add(String note) {
        if (list.length - 1 == itemsCounter) {
            resizeDouble();
        }
        list[itemsCounter++] = note;
    }

    public String remove(int index) {
        int counter = 0;
        String removedItem = null;
        if (index < itemsCounter) {
            removedItem = list[index];
            list[index] = null;
            String[] newList = new String[LIST_SIZE];
            for (int i = 0; i < itemsCounter; i++) {
                if (list[i] != null) {
                    newList[counter++] = list[i];
                }
            }

            itemsCounter--;
            list = newList;
        }
        return removedItem;
    }

    public void print() {
        System.out.println(Arrays.toString(list));
    }

    public boolean remove(String note) {
        int counter = 0;
        boolean isRemoved = false;
        String[] newList = new String[LIST_SIZE];
        for (int i = 0; i < itemsCounter; i++) {
            if (list[i].equals(note)) {
                isRemoved = true;
            } else {
                newList[counter++] = list[i];
            }
        }
        if (isRemoved) {
            itemsCounter--;
            list = newList;
        }
        return isRemoved;
    }

    public int size() {
        return itemsCounter;
    }

    public String get(int index) {
        return list[index];
    }

    public String get(String note) {
        for (int i = 0; i < itemsCounter; i++) {
            if (list[i].equals(note)) {
                return list[i];
            }
        }
        return null;
    }

    public void clear() {
        list = new String[50];
        itemsCounter = 0;
    }

    public boolean isEmpty() {
        return itemsCounter == 0;
    }

    private void resizeDouble() {
        LIST_SIZE *= 2;
        String[] doubledList = new String[LIST_SIZE];
        for (int i = 0; i < list.length; i++) {
            doubledList[i] = list[i];
        }
        list = doubledList;
    }
}
