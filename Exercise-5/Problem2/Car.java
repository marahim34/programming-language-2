package Problem2;

import java.time.Year;

public class Car {
    private String make;
    private String model;
    private int year;

    public Car(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public boolean isAntique(){
        int currentYear = Year.now().getValue();
        return (currentYear - year) > 45;
    }

    @Override
    public String toString() {
        return "Car[make=" + make + ", model=" + model + ", year=" + year + "]";
    }
}
