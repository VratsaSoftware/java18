import java.util.Arrays;

public class MyArray {

    private int[] array;

    public MyArray(int[] array) {
        this.array = array;
    }

    public int[] getArray() {
        return array;
    }

    public void setArray(int[] array) {
        this.array = array;
    }

    public void getMax(int[] array) {
        Arrays.sort(array);
        System.out.println(array[array.length - 1]);
    }

    public void sortArray(int[] array) {
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));
    }
}
