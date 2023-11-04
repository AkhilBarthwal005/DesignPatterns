package CreationalDesignPattern.FactoryMethod;

public class VanillaMilkshake implements Milkshake {
    String name;

    VanillaMilkshake(){
        this.name = String.valueOf(AvailableMilkshakes.VANILLA_MILKSHAKE);
    }
}
