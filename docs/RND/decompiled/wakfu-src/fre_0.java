/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from frE
 */
public final class fre_0
extends Enum<fre_0>
implements aoq_1 {
    public static final /* enum */ fre_0 sYZ = new fre_0(1);
    public static final /* enum */ fre_0 sZa = new fre_0(2);
    public static final /* enum */ fre_0 sZb = new fre_0(3);
    public static final /* enum */ fre_0 sZc = new fre_0(4);
    public static final /* enum */ fre_0 sZd = new fre_0(5);
    public static final /* enum */ fre_0 sZe = new fre_0(6);
    private final byte sZf;
    private static final /* synthetic */ fre_0[] sZg;

    public static fre_0[] values() {
        return (fre_0[])sZg.clone();
    }

    public static fre_0 valueOf(String string) {
        return Enum.valueOf(fre_0.class, string);
    }

    private fre_0(byte by) {
        this.sZf = by;
    }

    public byte aJr() {
        return this.sZf;
    }

    public static fre_0 hD(byte by) {
        fre_0[] fre_0Array = fre_0.values();
        for (int i = 0; i < fre_0Array.length; ++i) {
            fre_0 fre_02 = fre_0Array[i];
            if (fre_02.sZf != by) continue;
            return fre_02;
        }
        return null;
    }

    public String toString() {
        return this.name() + " (" + this.sZf + ")";
    }

    @Override
    public String aXA() {
        return String.valueOf(this.sZf);
    }

    @Override
    public String aXB() {
        return this.name();
    }

    @Override
    public String aXC() {
        return null;
    }

    private static /* synthetic */ fre_0[] gkm() {
        return new fre_0[]{sYZ, sZa, sZb, sZc, sZd, sZe};
    }

    static {
        sZg = fre_0.gkm();
    }
}

