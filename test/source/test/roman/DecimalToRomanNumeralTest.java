package test.roman;

import dssc.roman.RomanNumeral;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class DecimalToRomanNumeralTest {
    @Test
    void zeroIsEmptyString() {
        check(0, "");
    }

    @Test
    //@Disabled
    void seventyfourIsLXXIV() {
        check(74, "LXXIV");
    }

    @Test
    void oneIIsII() {
        check(2, "II");
    }

    @Test
    void eigthIsVIII() {
        check(8, "VIII");
    }

    @Test
    void fourtyeigthIsXLVIII() {
        check(48, "XLVIII");
    }


    private void check(int decimal, String expected) {
        RomanNumeral romanNumeral = new RomanNumeral(decimal);
        assertEquals(expected, romanNumeral.toString());
    }
}
