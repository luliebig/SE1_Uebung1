package org.hbrs.se1.ss24.uebung1.test;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.hbrs.se1.ss24.uebung1.businesslogic.*;

class TestRomanNumberTransformer {

    @Test
    void TestRomanNumbers() {
        Transformer t = new RomanNumberTransformer();

        // positiver Testfall und Grenzwerte
        assertEquals("MCCXXXIV", t.transformNumber(1234));
        assertEquals("I", t.transformNumber(1));
        assertEquals("MMM", t.transformNumber(3000));

        // negative Testfälle
        assertThrows(IllegalArgumentException.class, () -> t.transformNumber(0));
        assertThrows(IllegalArgumentException.class, () -> t.transformNumber(3001));
    }
}
