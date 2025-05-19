package chances;

import java.util.Objects;

public class Probability {
    private final double value;

    private Probability(double value) {
        this.value = value;
    }

    public static Probability createProbability(double value) throws InvalidProbability {
        if (value < 0 || value > 1) {
            throw new InvalidProbability();
        }

        return new Probability(value);
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Probability that = (Probability) o;
        return Double.compare(value, that.value) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(value);
    }

    public Probability complement() throws InvalidProbability {
        return createProbability(1 - value);
    }

    public Probability and(Probability p2) throws InvalidProbability {
        return createProbability(this.value * p2.value);
    }

    public Probability or(Probability p2) throws InvalidProbability {
        return createProbability((value + p2.value) - value * p2.value);
    }
}
