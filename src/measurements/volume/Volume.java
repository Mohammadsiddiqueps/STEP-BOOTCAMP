package measurements.volume;
import measurements.Measurement;

import java.util.Objects;

public class Volume  {
    private final double value;
    private final VolumeUnits unit;

    @Override
    public boolean equals(Object volume2) {
        if (!(volume2 instanceof Volume)) return false;
        Volume volume1InLitre = this.convertToLitre();
        Volume volume2InLitre = ((Volume) volume2).convertToLitre();

        return Double.compare(volume1InLitre.value, volume2InLitre.value) == 0 && volume1InLitre.unit == volume2InLitre.unit;
    }

    @Override
    public int hashCode() {
        return Objects.hash(value, unit);
    }

    public Volume(double value, VolumeUnits unit) {
        this.value = value;
        this.unit = unit;
    }

    public Volume convertToLitre() {
        return new Volume(value * unit.factor, VolumeUnits.LITRES);
    }

    public Volume add(Volume volume) {
        return new Volume(value + volume.value, VolumeUnits.LITRES);
    }
}
