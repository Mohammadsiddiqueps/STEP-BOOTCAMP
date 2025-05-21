package measurements;

import measurements.volume.Volume;
import measurements.volume.VolumeUnits;

public class Measurement {

    private final double value;
    private final VolumeUnits unit;

    public Measurement(double value, VolumeUnits unit) {
        this.value = value;
        this.unit = unit;
    }

    public Volume add(Volume volume) {
        return new Volume(value + volume.value, VolumeUnits.LITRES);
    }
}
