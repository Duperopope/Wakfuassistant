/*
 * Decompiled with CFR 0.152.
 */
import java.util.Comparator;

class BI
implements Comparator<CharSequence> {
    static final BI avr = new BI();

    private BI() {
    }

    private static int a(CharSequence charSequence, CharSequence charSequence2) {
        int n = 0;
        int n2 = 0;
        int n3 = 0;
        while (true) {
            char c2 = BI.a(charSequence, n2);
            char c3 = BI.a(charSequence2, n3);
            if (!Character.isDigit(c2) && !Character.isDigit(c3)) {
                return n;
            }
            if (!Character.isDigit(c2)) {
                return -1;
            }
            if (!Character.isDigit(c3)) {
                return 1;
            }
            if (c2 < c3) {
                if (n == 0) {
                    n = -1;
                }
            } else if (c2 > c3) {
                if (n == 0) {
                    n = 1;
                }
            } else if (c2 == '\u0000') {
                return n;
            }
            ++n2;
            ++n3;
        }
    }

    public int b(CharSequence charSequence, CharSequence charSequence2) {
        String string = charSequence.toString();
        String string2 = charSequence2.toString();
        int n = 0;
        int n2 = 0;
        while (true) {
            int n3;
            int n4 = 0;
            int n5 = 0;
            char c2 = BI.a((CharSequence)string, n);
            char c3 = BI.a((CharSequence)string2, n2);
            while (Character.isSpaceChar(c2) || c2 == '0') {
                n5 = c2 == '0' ? ++n5 : 0;
                c2 = BI.a((CharSequence)string, ++n);
            }
            while (Character.isSpaceChar(c3) || c3 == '0') {
                n4 = c3 == '0' ? ++n4 : 0;
                c3 = BI.a((CharSequence)string2, ++n2);
            }
            if (Character.isDigit(c2) && Character.isDigit(c3) && (n3 = BI.a((CharSequence)string.substring(n), string2.substring(n2))) != 0) {
                return n3;
            }
            if (c2 == '\u0000' && c3 == '\u0000') {
                return n5 - n4;
            }
            if (c2 < c3) {
                return -1;
            }
            if (c2 > c3) {
                return 1;
            }
            ++n;
            ++n2;
        }
    }

    private static char a(CharSequence charSequence, int n) {
        return n >= charSequence.length() ? (char)'\u0000' : charSequence.charAt(n);
    }

    @Override
    public /* synthetic */ int compare(Object object, Object object2) {
        return this.b((CharSequence)object, (CharSequence)object2);
    }
}

