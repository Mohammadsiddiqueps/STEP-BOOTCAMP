package measurements.volume;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class VolumeTest {
    @Test
    void compareTest() {
        Volume volume1 = new Volume(1, VolumeUnits.LITRES);
        Volume volume2 = new Volume(1, VolumeUnits.LITRES);
        assertEquals(volume1, volume2);

        Volume volume3 = new Volume(7.56, VolumeUnits.LITRES);
        Volume volume4 = new Volume(2, VolumeUnits.GALLON);
        assertEquals(volume3, volume4);
    }

    @Test
    void convertToLitreTest() {
        Volume volumeInLitre = new Volume(1, VolumeUnits.LITRES);
        Volume volumeInGallon = new Volume(1, VolumeUnits.GALLON);
        assertEquals(new Volume(1, VolumeUnits.LITRES), volumeInLitre.convertToLitre());
        assertEquals(new Volume( 3.78, VolumeUnits.LITRES), volumeInGallon.convertToLitre());
    }

    @Test
    void addVolumeTest() {
        Volume volume1InLitres = new Volume(3, VolumeUnits.LITRES);
        Volume volume2InLitres = new Volume(5, VolumeUnits.LITRES);
        assertEquals(new Volume(8, VolumeUnits.LITRES),volume1InLitres.add(volume2InLitres));
    }
}