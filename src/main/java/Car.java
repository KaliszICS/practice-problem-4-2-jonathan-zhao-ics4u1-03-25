/**
 * @author Jonathan Z
 * @version 17.0.1
 */
public class Car {
    // instance variables
    private String make;
    private String model;
    private int year;
    private double price;

    /**
     * Constructor for the Car class
     * 
     * @param make  // make of the car
     * @param model // model of the car
     * @param year  // year of the car
     * @param price // price of the car
     */

    public Car(String make, String model, int year, double price) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.price = price;
    }

    /**
     * 
     * @return returns the make of the car
     */
    public String getMake() {
        return this.make;
    }

    /**
     * 
     * @return returns the model of the car
     */
    public String getModel() {
        return this.model;
    }

    /**
     * 
     * @return returns the year of the car
     */

    public int getYear() {
        return this.year;
    }

    /**
     * 
     * @return returns the price of the car
     */
    public double getPrice() {
        return this.price;
    }

    /**
     * 
     * @param newMake // sets the new make of the car
     * 
     */
    public void setMake(String newMake) {
        this.make = newMake;
    }

    /**
     * 
     * @param newModel // sets the new model of the car
     * 
     */
    public void setModel(String newModel) {
        this.model = newModel;
    }

    /**
     * 
     * @param newYear sets the new year of the model
     */

    public void setYear(int newYear) {
        this.year = newYear;
    }

    /**
     * 
     * @param newPrice sets the new price of the car
     * 
     */
    public void setPrice(double newPrice) {
        this.price = newPrice;
    }
}
