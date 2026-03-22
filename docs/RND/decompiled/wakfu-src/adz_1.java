/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from aDZ
 */
public class adz_1 {
    private static final String[] dEK = new String[]{"I", "IV", "V", "IX", "X", "XL", "L", "XC", "C", "CD", "D", "CM", "M"};
    private static final int[] dEL = new int[]{1, 4, 5, 9, 10, 40, 50, 90, 100, 400, 500, 900, 1000};
    public static final int dEM = 1;
    public static final int dEN = 3999;
    private static final int dEO = 16;
    private static final StringBuilder dEP = new StringBuilder(16);

    public static String xh(int n) {
        if (n < 1 || 3999 < n) {
            throw new IllegalArgumentException();
        }
        int n2 = n;
        for (int i = dEL.length - 1; 0 <= i; --i) {
            int n3 = dEL[i];
            while (n2 >= n3) {
                dEP.append(dEK[i]);
                n2 -= n3;
            }
        }
        String string = dEP.toString();
        dEP.delete(0, dEP.length());
        return string;
    }
}

