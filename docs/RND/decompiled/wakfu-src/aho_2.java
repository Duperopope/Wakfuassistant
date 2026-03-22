/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import org.apache.log4j.Logger;

/*
 * Renamed from aHO
 */
public abstract class aho_2 {
    private static final Logger dSo = Logger.getLogger(aho_2.class);
    private final int dSp;
    private final int dSq;

    protected aho_2(int n, int n2) {
        assert (n > 0 && n2 > 0);
        this.dSp = n;
        this.dSq = n2;
    }

    public int getHeight() {
        return this.dSq;
    }

    public int getWidth() {
        return this.dSp;
    }

    public abstract int bkR();

    public abstract byte bkS();

    public final int d(ahl_2 ahl_22) {
        return this.au(ahl_22.cek(), ahl_22.cel());
    }

    public abstract int au(int var1, int var2);

    public final ahl_2 yt(int n) {
        return new ahl_2(this.qa(n), this.qb(n));
    }

    public abstract int qa(int var1);

    public abstract int qb(int var1);

    public final ahl_2 e(ahl_2 ahl_22) {
        return this.av(ahl_22.cek(), ahl_22.cel());
    }

    public ahl_2 av(int n, int n2) {
        int n3 = this.aw(n, n2);
        int n4 = this.ax(n, n2);
        return new ahl_2(n3, n4);
    }

    public abstract int aw(int var1, int var2);

    public abstract int ax(int var1, int var2);

    public final ahl_2 f(ahl_2 ahl_22) {
        return this.ay(ahl_22.cek(), ahl_22.cel());
    }

    public abstract ahl_2 ay(int var1, int var2);

    public abstract int az(int var1, int var2);

    public abstract int aA(int var1, int var2);

    public final ahl_2 O(int n, int n2, int n3) {
        return new ahl_2(this.P(n, n2, n3), this.Q(n, n2, n3));
    }

    public final int P(int n, int n2, int n3) {
        return this.az(n, n2) + this.qa(n3);
    }

    public int Q(int n, int n2, int n3) {
        return this.aA(n, n2) + this.qb(n3);
    }

    public static long R(int n, int n2, int n3) {
        int n4 = 0x100000;
        int n5 = 0x100000;
        assert (Math.abs(n2) <= 0x100000 || Math.abs(n3) <= 0x100000 || n <= 0x100000 || n >= 0) : "L'id de la map (" + n2 + "," + n3 + ") - monde " + n + " n'est pas bon.";
        long l = n & 0xFFFFF;
        long l2 = Math.abs(n2) & 0xFFFFF;
        if (Integer.signum(n2) == -1) {
            l2 |= 0x100000L;
        }
        long l3 = Math.abs(n3) & 0xFFFFF;
        if (Integer.signum(n3) == -1) {
            l3 |= 0x100000L;
        }
        return l << 42 | l2 << 21 | l3;
    }

    public static int[] hU(long l) {
        int[] nArray = new int[]{aho_2.hV(l), aho_2.hW(l), aho_2.hX(l)};
        return nArray;
    }

    public static int hV(long l) {
        return (int)(l >>> 42 & 0xFFFFFL);
    }

    public static int hW(long l) {
        long l2 = l >>> 21 & 0x1FFFFFL;
        if ((l2 & 0x100000L) == 0x100000L) {
            l2 = -(l2 & 0xFFFFFL);
        }
        return (int)l2;
    }

    public static int hX(long l) {
        long l2 = l & 0x1FFFFFL;
        if ((l2 & 0x100000L) == 0x100000L) {
            l2 = -(l2 & 0xFFFFFL);
        }
        return (int)l2;
    }
}

