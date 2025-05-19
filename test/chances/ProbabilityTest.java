package chances;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProbabilityTest {
    @Test
    void getTailsChances() {
        Probability coinsProbability = new Probability(2);
        assertEquals(0.5,coinsProbability.getChances(1));
    }

    @Test
    void getNotTailsChances() {
        Probability coinsProbability = new Probability(2);
        assertEquals(0.5,coinsProbability.getNotChances(1));
    }
}