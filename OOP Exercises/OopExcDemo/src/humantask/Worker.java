package humantask;

public class Worker extends Human{

    private double wage;
    private int workedHours;

    public Worker(double wage, int workedHours) {
        this.wage = wage;
        this.workedHours = workedHours;
    }

    public double getWage() {
        return wage;
    }

    public void setWage(double wage) {
        this.wage = wage;
    }

    public int getWorkedHours() {
        return workedHours;
    }

    public void setWorkedHours(int workedHours) {
        this.workedHours = workedHours;
    }

    public double getWagePerHour(double wage, int workedHours) {
        return wage / workedHours;
    }
}
