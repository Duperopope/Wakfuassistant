/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import org.apache.log4j.Logger;

/*
 * Renamed from VE
 */
public final class ve_0 {
    protected static final Logger bJp = Logger.getLogger(ve_0.class);

    public static int pV(int n) {
        if (n <= 0) {
            bJp.error((Object)("DiceRoll.roll appel\u00e9 avec une valeur de d\u00e9 de " + n + "\n" + adu_1.a(new RuntimeException("StackTrace de DiceRoll"))));
            return 1;
        }
        return GD.aNP().nextInt(n) + 1;
    }

    public static long fx(long l) {
        if (l <= 0L) {
            bJp.error((Object)("DiceRoll.roll appel\u00e9 avec une valeur de d\u00e9 de " + l + "\n" + adu_1.a(new RuntimeException("StackTrace de DiceRoll"))));
            return 1L;
        }
        return GD.aNP().nextLong(l) + 1L;
    }

    public static int d(int n, int n2, int n3) {
        if (n2 <= 0) {
            bJp.error((Object)("DiceRoll.roll appel\u00e9 avec une valeur de d\u00e9 de " + n2 + "\n" + adu_1.a(new RuntimeException("StackTrace de DiceRoll"))));
            return 1;
        }
        int n4 = n3 + n;
        if (n2 > 0 && n > 0) {
            for (int i = n; i > 0; --i) {
                n4 += GD.aNP().nextInt(n2);
            }
        }
        return n4;
    }

    public static int ao(int n, int n2) {
        assert (n > 0);
        assert (n2 >= n);
        int n3 = n;
        if (n > 0 && n2 > 0 && n2 - n > 0) {
            n3 = n + GD.aNP().nextInt(n2 - n + 1);
        }
        return n3;
    }
}

