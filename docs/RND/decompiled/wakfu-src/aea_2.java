/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from aEa
 */
public class aea_2 {
    private static final String[] dEQ = new String[]{"I", "V", "X", "L", "C", "D", "M"};
    private static final String[] dER = new String[]{"", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX"};
    private static final String[] dES = new String[]{"", "X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC"};
    private static final String[] dET = new String[]{"", "C", "CC", "CCC", "CD", "D", "DC", "DCC", "DCCC", "CM"};
    private static final String[] dEU = new String[]{"", "M", "MM", "MMM", "", "", "", "", "", ""};

    static boolean hn(String string) {
        for (int i = 0; i < string.length(); ++i) {
            boolean bl = false;
            for (int j = 0; j < dEQ.length; ++j) {
                if (!string.substring(i, i + 1).equals(dEQ[j])) continue;
                bl = true;
            }
            if (bl) continue;
            return false;
        }
        return true;
    }

    static boolean xi(int n) {
        return n > 0 && n <= 39999;
    }

    static int j(char c2) {
        switch (c2) {
            case 'I': {
                return 1;
            }
            case 'V': {
                return 5;
            }
            case 'X': {
                return 10;
            }
            case 'L': {
                return 50;
            }
            case 'C': {
                return 100;
            }
            case 'D': {
                return 500;
            }
            case 'M': {
                return 1000;
            }
        }
        return 0;
    }

    public static String xj(int n) {
        if (aea_2.xi(n)) {
            if (n >= 0 && n <= 9) {
                return dER[n];
            }
            if (n >= 10 && n <= 99) {
                return dES[n / 10] + dER[n % 10];
            }
            if (n >= 100 && n <= 999) {
                return dET[n / 100] + dES[n / 10 % 10] + dER[n % 10];
            }
            if (n >= 1000 && n <= 3999) {
                return dEU[n / 1000] + dET[n / 100 % 10] + dES[n / 10 % 10] + dER[n % 10];
            }
        }
        return "";
    }

    public static int ho(String string) {
        int n = 0;
        int n2 = 0;
        if (aea_2.hn(string)) {
            for (int i = 0; i < string.length(); ++i) {
                int n3 = aea_2.j(string.toCharArray()[i]);
                n2 = n3 > n ? (n2 += n3 - (n << 1)) : (n2 += n3);
                n = n3;
            }
        } else {
            return -1;
        }
        return n2;
    }
}

