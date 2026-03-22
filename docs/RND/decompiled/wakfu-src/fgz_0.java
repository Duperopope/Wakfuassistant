/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.iterator.TShortIterator
 *  gnu.trove.set.hash.TShortHashSet
 */
import gnu.trove.iterator.TShortIterator;
import gnu.trove.set.hash.TShortHashSet;

/*
 * Renamed from fgz
 */
public final class fgz_0
extends Enum<fgz_0> {
    public static final /* enum */ fgz_0 sjF = new fgz_0(new short[0]);
    public static final /* enum */ fgz_0 sjG = new fgz_0(106);
    public static final /* enum */ fgz_0 sjH = new fgz_0(226, 761, 758);
    public static final /* enum */ fgz_0 sjI = new fgz_0(109, 611, 582);
    public static final /* enum */ fgz_0 sjJ = new fgz_0(385);
    public static final /* enum */ fgz_0 sjK = new fgz_0(735);
    public static final /* enum */ fgz_0 sjL = new fgz_0(733);
    private final TShortHashSet sjM = new TShortHashSet();
    private static final /* synthetic */ fgz_0[] sjN;

    public static fgz_0[] values() {
        return (fgz_0[])sjN.clone();
    }

    public static fgz_0 valueOf(String string) {
        return Enum.valueOf(fgz_0.class, string);
    }

    private fgz_0(short ... sArray) {
        this.sjM.addAll(sArray);
    }

    public boolean isValid(fhy_0 fhy_02) {
        if (this == sjF) {
            return true;
        }
        if (this.sjM.contains(fhy_02.aIi())) {
            return true;
        }
        fhy_0 fhy_03 = fhy_02.fZm();
        return fhy_03 != null && this.isValid(fhy_03);
    }

    public TShortIterator fXe() {
        return this.sjM.iterator();
    }

    private static /* synthetic */ fgz_0[] fXf() {
        return new fgz_0[]{sjF, sjG, sjH, sjI, sjJ, sjK, sjL};
    }

    static {
        sjN = fgz_0.fXf();
    }
}

