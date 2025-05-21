package measurements.length;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LengthTest {
    @Test
    void feetToInchesTest() {
        Length lengthInFeet = new Length(1, LengthUnits.FEET);
        assertEquals(new Length(12, LengthUnits.INCHES), lengthInFeet.convertToInches());
    }

    @Test
    void CmToInches() {
        Length lengthInCM = new Length(5, LengthUnits.CM);
        assertEquals(new Length(2, LengthUnits.INCHES), lengthInCM.convertToInches());
    }

    @Test
    void addTwoInches() {
        Length length1 = new Length(2, LengthUnits.INCHES);
        Length length2 = new Length(2, LengthUnits.INCHES);
        assertEquals(new Length(4, LengthUnits.INCHES), length1.add(length2));
    }

    @Test
    void addTwoDifferentUnits() {
        Length length1 = new Length(2.5, LengthUnits.CM);
        Length length2 = new Length(2, LengthUnits.INCHES);
        assertEquals(new Length(3, LengthUnits.INCHES), length1.add(length2));
    }
}