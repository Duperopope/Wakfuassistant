/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from cCe
 */
public final class cce_0
extends Enum<cce_0> {
    public static final /* enum */ cce_0 mzf = new cce_0(0, "Ev\u00e8nement m\u00e9t\u00e9o", new cCf());
    public static final /* enum */ cce_0 mzg = new cce_0(1, "Id de famille", new cCg());
    public static final /* enum */ cce_0 mzh = new cce_0(2, "Ev\u00e8nement g\u00e9ographique", new cCh());
    public static final /* enum */ cce_0 mzi = new cce_0(3, "Marqueur Audio", new cCi());
    public static final /* enum */ cce_0 mzj = new cce_0(4, "Temps", new cCj());
    private final cCl mzk;
    private final byte mzl;
    private final String mzm;
    private static final /* synthetic */ cce_0[] mzn;

    public static cce_0[] values() {
        return (cce_0[])mzn.clone();
    }

    public static cce_0 valueOf(String string) {
        return Enum.valueOf(cce_0.class, string);
    }

    private cce_0(byte by, String string2, cCl cCl2) {
        this.mzk = cCl2;
        this.mzm = string2;
        this.mzl = by;
    }

    public static cce_0 dV(byte by) {
        for (cce_0 cce_02 : cce_0.values()) {
            if (cce_02.aJr() != by) continue;
            return cce_02;
        }
        return null;
    }

    public byte aJr() {
        return this.mzl;
    }

    public String getDescription() {
        return this.mzm;
    }

    public cCk eJq() {
        return this.mzk.eJq();
    }

    public String toString() {
        return this.mzm;
    }

    private static /* synthetic */ cce_0[] eJr() {
        return new cce_0[]{mzf, mzg, mzh, mzi, mzj};
    }

    static {
        mzn = cce_0.eJr();
    }
}

