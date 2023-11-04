package CreationalDesignPattern.FactoryMethod;

public class ButterscotchMilkshake implements Milkshake{
    String name;

    ButterscotchMilkshake(){
        this.name = String.valueOf(AvailableMilkshakes.BUTTERSCOTCH_MILKSHAKE);
    }
}
