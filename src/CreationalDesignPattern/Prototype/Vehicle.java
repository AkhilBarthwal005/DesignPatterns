package CreationalDesignPattern.Prototype;

public abstract class Vehicle {
    // Class Variables
    protected int seats;
    protected int tyres;
    protected String color;
    protected String fuel;

    public Vehicle() { // Default Constructor

    }

    public Vehicle(Vehicle v) { // Parameterized Constructor
        if (v!= null){ // Checking passed object is null or not
            // Copying values from original object into the prototyped object
            this.seats = v.seats;
            this.tyres = v.tyres;
            this.color = v.color;
            this.fuel = v.fuel;
        }
    }

    public abstract Vehicle clone();
}
