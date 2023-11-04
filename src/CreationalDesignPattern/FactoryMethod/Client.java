package CreationalDesignPattern.FactoryMethod;

public class Client {
    public static void main(String[] args) {
        MilkshakeFactory milkshakeFactory = new MilkshakeFactory();

        VanillaMilkshake vanilla = (VanillaMilkshake) milkshakeFactory.prepare(AvailableMilkshakes.VANILLA_MILKSHAKE);
        OreoMilkshake oreo = (OreoMilkshake) milkshakeFactory.prepare(AvailableMilkshakes.OREO_MILKSHAKE);
        ButterscotchMilkshake butterscotch = (ButterscotchMilkshake) milkshakeFactory.prepare(AvailableMilkshakes.BUTTERSCOTCH_MILKSHAKE);

        /*
        Pros

            Factory design pattern provides great extensibility that lets us add new classes without changing the application.
            Factory design pattern leverages loose coupling and eliminates hard binding the application-specific login in the code.
            The factory method returns the Product interface. So, it can work for any concrete product implementation.

        Cons

            Creation of all the concrete product instances are tightly coupled with the factory class that involves code modification when a new concrete product is introduced.Ω

         */
    }
}
