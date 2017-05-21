package com.dianping.sparrow.common.util;

import java.util.ArrayList;

/**
 * Created by andy on 17/4/26.
 */
public class StringUtils {

    public static final String EMPTY = "";

    public static boolean isEmpty(String string) {
        return string == null || string.length() == 0;
    }

    public static boolean isNotEmpty(String string) {
        return !isEmpty(string);
    }

    public static boolean contains(String string, String searchString) {
        if (string == null || searchString == null) {
            return false;
        }
        return string.indexOf(searchString) >= 0;
    }

    public static boolean containsIgnoreCase(String string, String searchString) {
        if (string == null || searchString == null) {
            return false;
        }
        return contains(string.toUpperCase(), searchString.toUpperCase());
    }

    public static boolean equals(String string1, String string2) {
        return string1 == null ? string2 == null : string1.equals(string2);
    }

    public static boolean equalsIgnoreCase(String string1, String string2) {
        return string1 == null ? string2 == null : string1.equalsIgnoreCase(string2);
    }


    public static String[] split(String string, String separator) {
        //string.split()
        return null;
    }

    public static String[] split(String string, char splitChar) {
        int end = string.length();
        ArrayList result = new ArrayList();
        int start = 0;

        int i;
        for (i = 0; i < end; ++i) {
            if (string.charAt(i) == splitChar) {
                if (start == i) {
                    result.add("");
                } else {
                    result.add(string.substring(start, i));
                }

                start = i + 1;
            }
        }

        if (start == 0) {
            result.add(string);
        } else if (start != end) {
            result.add(string.substring(start, end));
        } else {
            for (i = result.size() - 1; i >= 0 && ((String) result.get(i)).length() == 0; --i) {
                result.remove(i);
            }
        }

        return (String[]) result.toArray(new String[result.size()]);
    }

    public static String join(Object[] array) {
        return join(array, null);
    }

    public static String join(Object[] array, String separator) {
        if (array == null) {
            return null;
        }
        return join(array, separator, 0, array.length);
    }

    public static String join(Object[] array, String separator, int startIndex, int endIndex) {
        if (array == null) {
            return null;
        }

        if (separator == null) {
            separator = EMPTY;
        }

        int bufSize = endIndex - startIndex;
        if (bufSize <= 0) {
            return EMPTY;
        }

        bufSize *= ((array[startIndex] == null ? 16 : array[startIndex].toString().length()) + separator.length());

        StringBuilder builder = new StringBuilder(bufSize);

        for (int i = startIndex; i < endIndex; i++) {
            if (i > startIndex) {
                builder.append(separator);
            }
            if (array[i] != null) {
                builder.append(array[i]);
            }
        }

        return builder.toString();

    }

}
