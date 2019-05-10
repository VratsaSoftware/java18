import model.*;

public class Application {
    public static void main(String[] args) {
        Box<Dog> dogBox = new Box<>();

        dogBox.set(new Dog("Pesho"));
        System.out.println(dogBox.get().getName());

        Box<Cat> catBox = new Box<>();
        catBox.set(new Cat());

        catBox.get().makeSound();

        Pair<String, Dog> dogPair = new OrderedPair<>();
        dogPair.setKey("Pesho");
        dogPair.setValue(new Dog("Malyk pesho"));

        System.out.println(dogPair.getValue().getName());

        Thread thread = new Thread(() -> System.out.println("Run"));

        thread.start();

//
//        MyList<Dog> dogMyList = new MyList<>();
//        dogMyList.add(new Dog("Marko"));
//        dogMyList.add(new Dog("Snejina"));
//        dogMyList.add(new Dog("Milko"));
//        dogMyList.add(new Dog("Pantera"));
//        dogMyList.add(new Dog("Chicho Charli"));
//        dogMyList.add(new Dog("Archi"));
//
//        dogMyList.print();
//
//        MyList<Cat> catMyList = new MyList<>();
//        catMyList.add(new Cat());
//
//        System.out.println(catMyList.isEmpty());
//        System.out.println(catMyList.size());
//        catMyList.get(0).makeSound();
//
//        MyList<Box<Dog>> boxMyList = new MyList<>();
//        Box<Dog> dogBox1 = new Box<>();
//        dogBox1.set(new Dog("Dogo"));
//        boxMyList.add(dogBox);
//        boxMyList.add(dogBox1);
    }
}
