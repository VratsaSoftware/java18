package vehiclestask;

public class TestClass {

    public static void main(String[] args) {
        Car car = new Car(2015, "Tesla", "Roaster", 50000, (byte) 4);
        System.out.println(car.getBrand());
        System.out.println(car.getModel());
        System.out.println(car.getDrivenKm());
        car.move();

        MotorByke motorByke = new MotorByke(2013, "Honda", "CVR", 45000, (byte) 2);
        System.out.println(motorByke.getBrand());
        System.out.println(motorByke.getModel());
        System.out.println(motorByke.getDrivenKm());
        motorByke.move();

    }
}
