package AquariumSystem.simpleaquarium;

import AquariumSystem.interfaces.Aquarium;
import AquariumSystem.model.WaterQuality;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class SimpleAquarium implements Aquarium {


    @Override
    public void feedFish() {

    }

    @Override
    public void registerWaterChange(String note, WaterQuality quality) {

    }

    @Override
    public LocalDateTime getLastWaterChange() {
        return null;
    }
}
