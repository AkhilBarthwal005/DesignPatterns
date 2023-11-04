package CreationalDesignPattern.FactoryMethod;

public class OreoMilkshake implements Milkshake{
    String name;

    OreoMilkshake(){
        this.name = String.valueOf(AvailableMilkshakes.OREO_MILKSHAKE);
    }
}
