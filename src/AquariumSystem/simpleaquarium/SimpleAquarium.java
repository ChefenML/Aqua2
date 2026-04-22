package AquariumSystem.simpleaquarium;

import AquariumSystem.interfaces.Aquarium;

import java.time.LocalDate;

public class SimpleAquarium implements Aquarium {
    LocalDate lastChange;

    public SimpleAquarium(LocalDate lastChange){
        this.lastChange = lastChange;
    }
}
