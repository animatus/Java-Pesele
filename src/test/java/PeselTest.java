

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class PeselTest extends Pesel {

    @Test
    public void testIsValidLenght() {
        assertTrue(isValidLength("12345678912"));
        assertFalse(isValidLength("123456789"));
    }


    @Test
    public void testIsValidCheckSum() {
        assertFalse(IsCheckSumValid("12345678912"));
        assertTrue(IsCheckSumValid("44051401458"));
    }

}
