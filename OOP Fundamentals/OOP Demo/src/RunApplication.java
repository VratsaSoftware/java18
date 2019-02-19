import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class RunApplication {
    public static void main(String[] args) {
        Bishop bishop = new Bishop(1, 0);
        System.out.println("before: " + bishop.getCoordinationX() + "  " + bishop.getCoordinationY());

        bishop.move(4, 3);

        System.out.println("Legal: " + bishop.getCoordinationX() + "  " + bishop.getCoordinationY());


        bishop.move(4, 1);

        System.out.println("Illegal: " + bishop.getCoordinationX() + "  " + bishop.getCoordinationY());

        Dog dog1 = new Dog(2, "Bruno");
        Dog dog2 = new Dog(1, "Bruno1");
        Dog dog3 = new Dog(3, "Bruno2");
        Dog dog4 = new Dog(1, "Bruno3");
        Dog dog5 = new Dog(5, "Bruno4");
        Dog dog6 = new Dog(4, "Bruno5");

        List<Dog> dogs = new ArrayList<>();
        dogs.add(dog1);
        dogs.add(dog2);
        dogs.add(dog3);
        dogs.add(dog4);
        dogs.add(dog5);
        dogs.add(dog6);

        System.out.println(dogs);
        Collections.sort(dogs);
        System.out.println(dogs);
        System.out.println(Dog.getDogId());
        System.out.println(dog3.getThisDogId());
    }
}
