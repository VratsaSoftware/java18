public class TestClass {

    public static void main(String[] args) {
//        demo
        Cat cat = new Cat();
        cat.setAge((byte) 6);
        cat.setColor("white");
        System.out.println("Cat: " + cat.getAge() + " " + cat.getColor());
        System.out.println("-------------------------------------------");

//        first task
        Dog dogSharo = new Dog("pug", (byte) 8, "Sharo");
        System.out.println(dogSharo.getKind() + "\n" + dogSharo.getAge()
                + "\n" + dogSharo.getName());

        dogSharo.run();
        System.out.println(dogSharo.sayBau());
        System.out.println("-------------------------------------------");

//        second task
        MyArray array = new MyArray(new int[]{3, 7, 19, 3});
        array.getMax(array.getArray());
        array.sortArray(array.getArray());
        System.out.println("-------------------------------------------");

//        third task
        Animal animal = new Animal();
        animal.setAge(5);
        animal.setName("Gosho");

        System.out.println("Animal: " + animal.getName() + " " + animal.getAge());
        animal.move();

        Dog myDog = new Dog("brown", "pug");
        myDog.setAge(4);
        myDog.setName("Sharo");
        System.out.println("Dog: " + myDog.getName());
        System.out.println("Dog: " + myDog.getKind() + " " + myDog.getColor());
        System.out.println("Dog " + myDog.sayBau());
        System.out.println("Dog " + myDog.move());

        Dolphin dolphin = new Dolphin();
        dolphin.setSound("Ukv");
        dolphin.setAge(50);
        dolphin.setName("Djoni");

        System.out.println("Dolphin: " + dolphin.getSound());
        System.out.println("Dolphin: " + dolphin.getName());
        System.out.println("Dolphin: " + dolphin.getAge());
        System.out.println("Dolphin: " + dolphin.move());
        dolphin.swim();

        Dog dog = new Dog();
        dog.setColor("black");
        System.out.println(dog.getKind() + " " + dog.getColor());

    }
}
