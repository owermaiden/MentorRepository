import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NumberFormatTest {

    @Test
    void getCompactFormatTest(){
        assertEquals("1.000.000", NumberFormatFeatures.getCompactNumberFormat(1000000));
    }
}