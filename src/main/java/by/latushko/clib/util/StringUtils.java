package by.latushko.clib.util;

public class StringUtils {
    private static final String NEGATIVE_SIGN = "-";

    public boolean isPositiveNumber(String str) {
        boolean isNumeric = org.apache.commons.lang3.StringUtils.isNumeric(str);
        return isNumeric && !str.startsWith(NEGATIVE_SIGN);
    }
}
