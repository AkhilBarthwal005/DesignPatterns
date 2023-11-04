package CreationalDesignPattern.Prototype;

public class Bike extends Vehicle{

    Bike(){

    }

    Bike(Bike b){
        super(b);
    }

    @Override
    public Vehicle clone() {
        return new Bike(this);
    }

    @Override
    public String toString() {
        return "Bike{" +
                "seats=" + seats +
                ", tyres=" + tyres +
                ", color='" + color + '\'' +
                ", fuel='" + fuel + '\'' +
                '}';
    }
}
