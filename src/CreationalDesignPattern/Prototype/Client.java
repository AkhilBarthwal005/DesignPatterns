package CreationalDesignPattern.Prototype;

public class Client {
    public static void main(String[] args) {
        Bike b = new Bike();
        b.color = "red";
        b.fuel = "Petrol";
        b.seats = 2;
        b.tyres = 2;

        Car c =new Car();
        c.color = "green";
        c.fuel = "Petrol";
        c.seats = 5;
        c.tyres = 4;

        System.out.println("Original Bike ->" + b);
        System.out.println("Original Car ->" + c);


        System.out.println("Duplicate Bike ->" + b.clone());
        System.out.println("Duplicate Car ->" + c.clone());
    }
}
