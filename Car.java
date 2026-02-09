/*
Name: Nanak Barring
Date: 2/7/26
Program: Car class for Testing Objects lab
*/

public class Car {

    // data variables (fields)
    private String model;
    private int year;
    private boolean electric;

    // no-arg (default) constructor
    public Car() {
        model = "Unknown";
        year = 0;
        electric = false;
    }

    // parameterized constructor
    public Car(String model, int year, boolean electric) {
        this.model = model;
        this.year = year;
        this.electric = electric;
    }

    // getters
    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public boolean getElectric() {
        return electric;
    }

    // setters
    public void setModel(String model) {
        this.model = model;
    }

    public void setYear(int year) {
        if (year >= 0) {
            this.year = year;
        }
    }

    public void setElectric(boolean electric) {
        this.electric = electric;
    }

    // toString
    @Override
    public String toString() {
        return "Car{model='" + model + "', year=" + year + ", electric=" + electric + "}";
    }
}
