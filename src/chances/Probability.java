package chances;

public class Probability {

    private final int totalChances;

    public Probability(int totalChances) {
        this.totalChances = totalChances;
    }

    public float getChances(int chances) {
        return (float) chances / totalChances;
    }

    public double getNotChances(int chances) {
        return (double) (totalChances - chances) / totalChances;
    }
}
