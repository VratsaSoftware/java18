package demotask;

public class Dog extends Animal {


    public Dog(int age) {
        super(age);
    }

    @Override
    public void move() {
        System.out.println("Run");
    }
}
