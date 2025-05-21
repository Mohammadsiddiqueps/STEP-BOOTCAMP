package measurements.length;

public enum LengthUnits {
    INCHES(1),
    FEET(12),
    CM(1 / 2.5);

    public final double factor;

    LengthUnits(double factor) {
        this.factor = factor;
    }
}
