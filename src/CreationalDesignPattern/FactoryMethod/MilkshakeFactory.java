package CreationalDesignPattern.FactoryMethod;

import java.util.HashMap;
import java.util.Map;

public class MilkshakeFactory {
    Map<AvailableMilkshakes,Milkshake> menu;

    MilkshakeFactory(){
        menu = new HashMap<>();
        buildMenu();
    }

    public Milkshake prepare(AvailableMilkshakes milkshakeName){
        if(milkshakeName == null){
            System.out.println("Please Provide the milkshake name");
        }

        System.out.println(milkshakeName + " is Ready Ahh...");
        return menu.get(milkshakeName);

    }

    private void buildMenu(){
        menu.put(AvailableMilkshakes.VANILLA_MILKSHAKE,new VanillaMilkshake());
        menu.put(AvailableMilkshakes.OREO_MILKSHAKE, new OreoMilkshake());
        menu.put(AvailableMilkshakes.BUTTERSCOTCH_MILKSHAKE, new ButterscotchMilkshake());
    }
}
