/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from adR
 */
public final class adr_0
extends Enum<adr_0> {
    public static final /* enum */ adr_0 cld = new adr_0(-1.0f, true, 0.0f);
    public static final /* enum */ adr_0 cle = new adr_0(400.0f, false, 0.0f);
    public static final /* enum */ adr_0 clf = new adr_0(1760.0f, false, 0.0f);
    public static final /* enum */ adr_0 clg = new adr_0(600.0f, false, 700.0f);
    public static final /* enum */ adr_0 clh = new adr_0(adq_0.clb, false, 0.0f);
    public static final /* enum */ adr_0 cli = new adr_0(1300.0f, false, 0.0f);
    public static final /* enum */ adr_0 clj = new adr_0(adq_0.ckW, false, 0.0f);
    private final float clk;
    private final boolean cll;
    private final float clm;
    private static final /* synthetic */ adr_0[] cln;

    public static adr_0[] values() {
        return (adr_0[])cln.clone();
    }

    public static adr_0 valueOf(String string) {
        return Enum.valueOf(adr_0.class, string);
    }

    private adr_0(float f2, boolean bl, float f3) {
        this.clk = f2;
        this.cll = bl;
        this.clm = f3;
    }

    public float aSa() {
        return this.clk;
    }

    public boolean bvq() {
        return this.cll;
    }

    public float bvr() {
        return this.clm;
    }

    private static /* synthetic */ adr_0[] bvs() {
        return new adr_0[]{cld, cle, clf, clg, clh, cli, clj};
    }

    static {
        cln = adr_0.bvs();
    }
}

