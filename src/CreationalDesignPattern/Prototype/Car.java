package CreationalDesignPattern.Prototype;

public class Car extends Vehicle {

    public Car(){

    }

    public Car(Car car) {
        super(car);
    }

    @Override
    public Vehicle clone() {
        return new Car(this);
    }

    @Override
    public String toString() {
        return "Car{" +
                "seats=" + seats +
                ", tyres=" + tyres +
                ", color='" + color + '\'' +
                ", fuel='" + fuel + '\'' +
                '}';
    }
}
