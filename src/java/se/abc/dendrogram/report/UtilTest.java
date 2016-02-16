package se.abc.dendrogram.report;

import java.util.ArrayList;
import java.util.List;

import junit.framework.TestCase;

public class UtilTest extends TestCase {

    public void testDigits() {
        final List<Integer> digits = Util.digits(123, new ArrayList<Integer>(),
                10);
        assertTrue(digits.size() == 3);
        assertTrue(digits.get(0) == 1);
    }

    public void testToInt() {
        final List<Integer> digits = new ArrayList<Integer>(3);
        digits.add(1);
        digits.add(2);
        digits.add(3);

        final int val = Util.toInt(digits, 10);
        assertTrue(val == 123);
    }

    public void testDifferingDigits() {
        final int diff = Util.differingDigits(123, 133, 10);
        assertTrue(diff == 33);

        assertTrue(Util.differingDigits(121, 123, 10) == 3);
        assertTrue(Util.differingDigits(1211, 1233, 10) == 33);
        assertTrue(Util.differingDigits(1211, 1333, 10) == 333);
    }

    public void testPrettyYear() {
        final int prettyYear = Util.prettyYear(1298, 1333, 10);
        assertTrue(prettyYear == 1333);
        assertTrue(Util.prettyYear(678, 679, 10) == 9);
        assertTrue(Util.prettyYear(1678, 1689, 10) == 89);
        assertTrue(Util.prettyYear(1678, 1712, 10) == 1712);
    }
}
