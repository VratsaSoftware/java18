package humantask;

public class TestClass {

    public static void main(String[] args) {
        Worker worker = new Worker(345, 15);
        worker.setFirstName("Pesho");
        worker.setSecondName("Ivanov");

        System.out.println(worker.getFirstName() + " " + worker.getSecondName());
        System.out.println(worker.getWagePerHour(worker.getWage(), worker.getWorkedHours()));
    }
}
