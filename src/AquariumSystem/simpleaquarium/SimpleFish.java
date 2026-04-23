package AquariumSystem.simpleaquarium;

import AquariumSystem.interfaces.Fish;

public class SimpleFish implements Fish {
    @Override
    public String toString() {
        return name;
    }

    String name;

    public SimpleFish(String name){
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void registerHealthCheck(String note) {

    }
}
