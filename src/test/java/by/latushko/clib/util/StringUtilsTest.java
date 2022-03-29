package by.latushko.clib.util;

import by.latushko.clib.util.StringUtils;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class StringUtilsTest {

    private StringUtils utils = new StringUtils();

    @Test
    public void isPositiveNumberTrue() {
        boolean actual = utils.isPositiveNumber("90");
        assertTrue(actual);
    }

    @Test
    public void isPositiveNumberFalse() {
        boolean actual = utils.isPositiveNumber("-764");
        assertFalse(actual);
    }
}