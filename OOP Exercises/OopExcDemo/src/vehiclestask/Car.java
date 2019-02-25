package vehiclestask;

public class Car extends Vehicle implements IMove{

    private byte numOfW;

    public Car(int ageOfProduction, String brand, String model, int drivenKm, byte numOfW) {
        super(ageOfProduction, brand, model, drivenKm);
        this.numOfW = numOfW;
    }

    public byte getNumOfW() {
        return numOfW;
    }

    public void setNumOfW(byte numOfW) {
        this.numOfW = numOfW;
    }

    @Override
    public void move() {
        System.out.println("Car move");
    }
}
