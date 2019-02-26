package vehiclestask;

public class MotorByke extends Vehicle implements IMove{

    private byte numOfW;

    public MotorByke(int ageOfProduction, String brand, String model, int drivenKm, byte numOfW) {
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
        System.out.println("Motor move");
    }
}
