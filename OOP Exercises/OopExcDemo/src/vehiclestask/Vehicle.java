package vehiclestask;

public class Vehicle {

    private int ageOfProduction;
    private String brand;
    private String model;
    private int drivenKm;

    public Vehicle(int ageOfProduction, String brand, String model, int drivenKm) {
        this.ageOfProduction = ageOfProduction;
        this.brand = brand;
        this.model = model;
        this.drivenKm = drivenKm;
    }

    public int getAgeOfProduction() {
        return ageOfProduction;
    }

    public void setAgeOfProduction(int ageOfProduction) {
        this.ageOfProduction = ageOfProduction;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getDrivenKm() {
        return drivenKm;
    }

    public void setDrivenKm(int drivenKm) {
        this.drivenKm = drivenKm;
    }
}
