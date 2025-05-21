package measurements.volume;

public enum VolumeUnits {
    GALLON(3.78),
    LITRES(1);

    final double factor;

    VolumeUnits(double factor) {
        this.factor = factor;
    }
}
