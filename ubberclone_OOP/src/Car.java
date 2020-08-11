public class Car implements Vehicle {

    //instance variables
    //declaring instance variables so that they can be used in the constructors and the method
    String numberPlate;
    String color;
    String model;
    String type;
    double base_rate;

    //constructor
    //creating constrcutions to initialize the state of the object 
    Car(String numberPlate, String color, String model, String type) {
        this.numberPlate = numberPlate;
        this.color = color;
        this.model = model;
        this.type = type;
        if(type.equals("XL")) {
            this.base_rate = 15.00;
        } else {
            this.base_rate = 10.00;
        }
    }

    //methods
    //This is the method to get the instance variable and returning the values
    public String getNumberPlate() {
        return this.numberPlate;
    }

    public double getBaseRate() {
        return this.base_rate;
    }

    public String getColor() {
        return this.color;
    }
    public String getModel() {
        return this.model;
    }

    public String getVehicleType() {
        return this.type;
    }

    public String toString() {
        return this.model + " car of " + this.color + " color, with number plate: " + this.numberPlate;
    }
}