public class ConvertDegreesTask {


    public static void main(String[] args) {
        System.out.println("degreesInCelsius: " + degreesInCelsius(30));
        System.out.println("degreesInFahrenheit: " + degreesInFahrenheit(100));
    }

    public static double degreesInCelsius(int tempF) {

        return (tempF - 32) / 1.8;
    }

    public static double degreesInFahrenheit(int tempC) {

        return tempC * 1.8 + 32;
    }
}
