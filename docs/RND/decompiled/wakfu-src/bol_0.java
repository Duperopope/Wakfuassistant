/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from boL
 */
public final class bol_0
extends Enum<bol_0> {
    public static final /* enum */ bol_0 iSd = new bol_0("ContentContainer1");
    public static final /* enum */ bol_0 iSe = new bol_0("ContentContainer1");
    public static final /* enum */ bol_0 iSf = new bol_0("ContentContainer3");
    public static final /* enum */ bol_0 iSg = new bol_0("ContentContainer1");
    public static final /* enum */ bol_0 iSh = new bol_0("ContentContainer4");
    public static final /* enum */ bol_0 iSi = new bol_0("ContentContainer2");
    private final String iSj;
    private static final /* synthetic */ bol_0[] iSk;

    public static bol_0[] values() {
        return (bol_0[])iSk.clone();
    }

    public static bol_0 valueOf(String string) {
        return Enum.valueOf(bol_0.class, string);
    }

    private bol_0(String string2) {
        this.iSj = string2;
    }

    public String dBE() {
        return this.iSj;
    }

    private static /* synthetic */ bol_0[] dBF() {
        return new bol_0[]{iSd, iSe, iSf, iSg, iSh, iSi};
    }

    static {
        iSk = bol_0.dBF();
    }
}

