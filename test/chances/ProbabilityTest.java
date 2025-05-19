package chances;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ProbabilityTest {
    @Test
    void complimentTest() throws InvalidProbability {
        Probability coinsProbability = Probability.createProbability(0.5);
        assertEquals(Probability.createProbability(0.5), coinsProbability.complement());
    }

    @Test
    void sumProbability() throws InvalidProbability {
        Probability p1 = Probability.createProbability(0.5);
        Probability p2 = Probability.createProbability(0.5);
        assertEquals(Probability.createProbability(0.25), p1.and(p2));
    }

    @Test
    void invalidProbability() throws InvalidProbability {
        assertThrows(InvalidProbability.class, () -> Probability.createProbability(1.2));
        assertThrows(InvalidProbability.class, () -> Probability.createProbability(-0.3));
    }

    @Test
    void atLeastProbability() throws InvalidProbability {
        Probability p1 = Probability.createProbability(0.5);
        Probability p2 = Probability.createProbability(0.5);
        assertEquals(Probability.createProbability(0.75), p1.or(p2));
    }
}