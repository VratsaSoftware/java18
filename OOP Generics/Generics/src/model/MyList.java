package model;

import java.util.Arrays;

public class MyList<T> {
    private static int LIST_SIZE = 50;
    private T[] list;
    private int itemsCounter;

    public MyList() {
        list = (T[]) new Object[LIST_SIZE];
        itemsCounter = 0;
    }

    public void add(T note) {
        if (list.length - 1 == itemsCounter) {
            resizeDouble();
        }
        list[itemsCounter++] = note;
    }

    public T remove(int index) {
        int counter = 0;
        T removedItem = null;
        if (index < itemsCounter) {
            removedItem = list[index];
            list[index] = null;
            T[] newList = (T[]) new Object[LIST_SIZE];
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

    public boolean remove(T note) {
        int counter = 0;
        boolean isRemoved = false;
        T[] newList = (T[]) new Object[LIST_SIZE];
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

    public T get(int index) {
        return list[index];
    }

    public T get(String note) {
        for (int i = 0; i < itemsCounter; i++) {
            if (list[i].equals(note)) {
                return list[i];
            }
        }
        return null;
    }

    public void clear() {
        list = (T[]) new Object[50];
        itemsCounter = 0;
    }

    public boolean isEmpty() {
        return itemsCounter == 0;
    }

    private void resizeDouble() {
        LIST_SIZE *= 2;
        T[] doubledList = (T[]) new Object[LIST_SIZE];
        for (int i = 0; i < list.length; i++) {
            doubledList[i] = list[i];
        }
        list = doubledList;
    }
}
