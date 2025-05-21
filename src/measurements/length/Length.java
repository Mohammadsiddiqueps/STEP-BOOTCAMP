package measurements.length;

import measurements.volume.Volume;
import measurements.volume.VolumeUnits;

import java.util.Objects;

public class Length {

    private final double value;
    private final LengthUnits unit;

    public Length(double value, LengthUnits lengthUnit) {
        this.value = value;
        this.unit = lengthUnit;
    }

    @Override
    public boolean equals(Object length2) {
        if (!(length2 instanceof Length)) return false;
        Length length1InInches = this.convertToInches();
        Length length2InInches = ((Length) length2).convertToInches();

        return Double.compare(length1InInches.value, length2InInches.value) == 0 && length1InInches.unit == length2InInches.unit;
    }

    @Override
    public int hashCode() {
        return Objects.hash(value, unit);
    }

    public Length convertToInches() {
        return new Length(value * unit.factor, LengthUnits.INCHES);
    }

    public Length add(Length length) {
        Length length1InInches = this.convertToInches();
        Length length2InInches = length.convertToInches();

        return new Length(length1InInches.value + length2InInches.value, LengthUnits.INCHES);
    }
}
