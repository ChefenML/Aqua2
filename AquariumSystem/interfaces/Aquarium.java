package AquariumSystem.interfaces;

import AquariumSystem.model.WaterQuality;
import AquariumSystem.model.WaterQuality2;

import java.time.LocalDateTime;

public interface Aquarium {

    void feedFish();

    void registerWaterChange(String note, WaterQuality quality);

    LocalDateTime getLastWaterChange();

    
}
