public class Temperature {
    private double currentTemp;

    public void setTemp (double t) {
        currentTemp = t;
    }

    public double toF () {
        double fahren = (currentTemp *1.8)+ 32;
        return fahren;
    }

    public double toC () {
        double Celsius = (currentTemp - 32) / 1.8;
        return Celsius;
    }
}