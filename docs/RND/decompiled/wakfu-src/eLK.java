/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.iterator.TShortLongIterator
 *  gnu.trove.map.hash.TShortLongHashMap
 */
import gnu.trove.iterator.TShortLongIterator;
import gnu.trove.map.hash.TShortLongHashMap;

public class eLK {
    public static final int qHA = 50;
    public static final int qHB = 5;
    public static final int qHC = 10;
    public static final int qHD = 5;
    public static final int qHE = 2;
    public static final int qHF = 20;
    public static final int qHG = 30;
    public static final int qHH = 3;
    public static final int qHI = 2;
    public static final int qHJ = 20;
    public static final int qHK = 1;
    public static final int qHL = 200;
    private static final TShortLongHashMap qHM = new TShortLongHashMap();

    private static void bCY() {
        for (short s = 1; s <= 200; s = (short)(s + 1)) {
            qHM.put(s, eLK.Rr(s));
        }
    }

    public static long Ro(int n) {
        return (long)Math.floor(10.0 * Math.pow(2.0, (float)n / 20.0f));
    }

    public static long Rp(int n) {
        long l = 0L;
        for (int i = n - n % 50; i <= n; i += 5) {
            if (i % 50 == 0) {
                l += eLK.Ro(i) * 5L * 2L;
                continue;
            }
            l += eLK.Ro(i) * 5L;
        }
        return l;
    }

    public static float Rq(int n) {
        long l = 0L;
        long l2 = 0L;
        int n2 = (int)Math.floor(1 + n % 50 / 5);
        for (int i = n - n % 50; i <= n; i += 5) {
            l2 += eLK.Rp(i);
        }
        l = (long)((float)l2 / (float)n2 * 60.0f / 30.0f);
        return l;
    }

    public static long Rr(int n) {
        return (long)((double)(eLK.Rq(n) * 3.0f) * Math.pow(2.0, (float)n / 20.0f));
    }

    public static short qp(long l) {
        short s = 0;
        TShortLongIterator tShortLongIterator = qHM.iterator();
        while (tShortLongIterator.hasNext()) {
            tShortLongIterator.advance();
            s = tShortLongIterator.key();
            if (l >= tShortLongIterator.value()) continue;
            break;
        }
        return s;
    }

    public static void main(String[] stringArray) {
        int n;
        Object object = "";
        for (n = 1; n <= 200; ++n) {
            if (n % 5 != 0) continue;
            object = (String)object + " ||| Recipe level " + n + " xp=" + eLK.Rp(n);
            if (n % 10 != 0) continue;
            object = (String)object + "\n";
        }
        for (n = 1; n <= 200; ++n) {
            object = (String)object + " ||| Craft level " + n + " xp=" + eLK.Rr(n);
            if (n % 5 != 0) continue;
            object = (String)object + "\n";
        }
        System.out.println((String)object);
    }

    static {
        eLK.bCY();
    }
}

