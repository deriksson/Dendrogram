package se.abc.dendrogram.report;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public final class Util {

    private Util() {}

    public static List<Integer> digits(final int number,
            final List<Integer> digits, final int base) {
        final int digit = number % base;
        digits.add(0, digit);

        if (number == digit)
            return digits;
        else
            return digits((int) number / base, digits, base);
    }

    public static int toInt(final List<Integer> digits, final int base) {
        int pos = 1;
        int retVal = 0;
        for (ListIterator<Integer> it = digits.listIterator(digits.size()); it
                .hasPrevious();) {
            retVal += it.previous() * pos;
            pos = pos * base;
        }
        return retVal;
    }

    public static Integer prettyYear(Integer first, Integer second,
            final int base) {
        if (first == null) {
            return second;
        }
        else {
            final int diff = differingDigits(first, second, base);
            if (second > 1000)
                if (diff > 100 && diff < 1000)
                    return second;
                else
                    return diff;
            else
                return diff;
        }
    }

    public static int differingDigits(final int lhs, final int rhs,
            final int base) {
        final List<Integer> lhsDigits = digits(lhs, new ArrayList<Integer>(),
                base);
        final List<Integer> rhsDigits = digits(rhs, new ArrayList<Integer>(),
                base);
        if (lhsDigits.size() != rhsDigits.size())
            return rhs;

        int index = 0;
        for (Iterator<Integer> rhsIt = rhsDigits.iterator(), lhsIt = lhsDigits
                .iterator(); rhsIt.hasNext(); index++)
            if (rhsIt.next() != lhsIt.next())
                return toInt(rhsDigits.subList(index, rhsDigits.size()), base);

        return rhs;
    }
}
