package AquariumSystem.simpleaquarium;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;


class SimpleFishGetNameTest {

    @Test
    void getName() {
    SimpleFish fish = new SimpleFish("knud");
    String expected = "knud";
    assertEquals(expected,fish.getName());
    }
}
