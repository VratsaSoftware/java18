public class Dog implements IBarkable, Comparable<Dog> {
    private boolean isBarking;
    private int age;
    private String name;
    private static long dogId;
    private long thisDogId;

    public Dog(int age, String name) {
        this.age = age;
        this.name = name;
        dogId++;
        thisDogId = dogId;
    }

    public static long getDogId() {
        return dogId;
    }

    @Override
    public String toString() {
        return name;
    }

    @Override
    public void bark() {
        System.out.println("Bau");
        isBarking = true;
    }

    @Override
    public boolean isSleeping() {
        if (isBarking) {
            return false;
        }
        return true;
    }

    @Override
    public int compareTo(Dog dog2) {
        if (this.age > dog2.age) {
            return 1;
        } else if (this.age < dog2.age) {
            return -1;
        } else {
            return 0;
        }
    }

    public long getThisDogId() {
        return thisDogId;
    }
}
