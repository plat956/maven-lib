package by.latushko.clib.util;

public class StringUtils {
    private static final String NEGATIVE_SIGN = "-";

    public boolean isPositiveNumber(String str) {
        return org.apache.commons.lang3.StringUtils.isNumeric(str);
    }
}
