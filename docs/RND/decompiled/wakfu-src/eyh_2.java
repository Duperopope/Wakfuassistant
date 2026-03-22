/*
 * Decompiled with CFR 0.152.
 */
import java.util.EnumSet;
import java.util.Iterator;

/*
 * Renamed from eYH
 */
public final class eyh_2
extends Enum<eyh_2> {
    public static final /* enum */ eyh_2 rKE = new eyh_2(1);
    public static final /* enum */ eyh_2 rKF = new eyh_2(2, true);
    public static final /* enum */ eyh_2 rKG = new eyh_2(3, true);
    public static final /* enum */ eyh_2 rKH = new eyh_2(4, true);
    public static final /* enum */ eyh_2 rKI = new eyh_2(5);
    public static final /* enum */ eyh_2 rKJ = new eyh_2(6);
    public static final /* enum */ eyh_2 rKK = new eyh_2(7);
    public static final /* enum */ eyh_2 rKL = new eyh_2(8);
    public static final /* enum */ eyh_2 rKM = new eyh_2(9);
    public static final /* enum */ eyh_2 rKN = new eyh_2(10);
    public static final /* enum */ eyh_2 rKO = new eyh_2(11);
    public static final /* enum */ eyh_2 rKP = new eyh_2(12);
    public static final /* enum */ eyh_2 rKQ = new eyh_2(13);
    public static final /* enum */ eyh_2 rKR = new eyh_2(14);
    public static final /* enum */ eyh_2 rKS = new eyh_2(15);
    public static final /* enum */ eyh_2 rKT = new eyh_2(16);
    public static final /* enum */ eyh_2 rKU = new eyh_2(17);
    public static final /* enum */ eyh_2 rKV = new eyh_2(18);
    public static final /* enum */ eyh_2 rKW = new eyh_2(19);
    public static final /* enum */ eyh_2 rKX = new eyh_2(20);
    public static final /* enum */ eyh_2 rKY = new eyh_2(21);
    public static final /* enum */ eyh_2 rKZ = new eyh_2(22);
    public static final /* enum */ eyh_2 rLa = new eyh_2(23);
    public static final /* enum */ eyh_2 rLb = new eyh_2(24);
    public static final /* enum */ eyh_2 rLc = new eyh_2(25);
    public static final /* enum */ eyh_2 rLd = new eyh_2(26);
    public static final /* enum */ eyh_2 rLe = new eyh_2(27);
    public static final long rLf;
    public static final long rLg;
    public final byte rLh;
    public final boolean rLi;
    private static final /* synthetic */ eyh_2[] rLj;

    public static eyh_2[] values() {
        return (eyh_2[])rLj.clone();
    }

    public static eyh_2 valueOf(String string) {
        return Enum.valueOf(eyh_2.class, string);
    }

    private eyh_2(int n2) {
        this(n2, false);
    }

    private eyh_2(int n2, boolean bl) {
        this.rLh = (byte)n2;
        this.rLi = bl;
    }

    public boolean X(short s, short s2) {
        if (!this.rLi || s == 0) {
            return true;
        }
        return s < s2;
    }

    public static long aN(Iterable<eyh_2> iterable) {
        long l = 0L;
        Iterator<eyh_2> iterator = iterable.iterator();
        while (iterator.hasNext()) {
            int n = 1 << iterator.next().rLh;
            l |= (long)n;
        }
        return l;
    }

    public static EnumSet<eyh_2> rJ(long l) {
        EnumSet<eyh_2> enumSet = EnumSet.noneOf(eyh_2.class);
        for (eyh_2 eyh_22 : eyh_2.values()) {
            int n = 1 << eyh_22.rLh;
            if ((l & (long)n) != (long)n) continue;
            enumSet.add(eyh_22);
        }
        return enumSet;
    }

    private static /* synthetic */ eyh_2[] fQi() {
        return new eyh_2[]{rKE, rKF, rKG, rKH, rKI, rKJ, rKK, rKL, rKM, rKN, rKO, rKP, rKQ, rKR, rKS, rKT, rKU, rKV, rKW, rKX, rKY, rKZ, rLa, rLb, rLc, rLd, rLe};
    }

    static {
        rLj = eyh_2.fQi();
        rLf = eyh_2.aN(EnumSet.allOf(eyh_2.class));
        rLg = eyh_2.aN(EnumSet.noneOf(eyh_2.class));
    }
}

