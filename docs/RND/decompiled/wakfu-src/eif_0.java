/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from eIf
 */
public final class eif_0
extends Enum<eif_0>
implements aoq_1 {
    public static final /* enum */ eif_0 quT = new eif_0(0);
    public static final /* enum */ eif_0 quU = new eif_0(1);
    private final byte quV;
    private static final /* synthetic */ eif_0[] quW;

    public static eif_0[] values() {
        return (eif_0[])quW.clone();
    }

    public static eif_0 valueOf(String string) {
        return Enum.valueOf(eif_0.class, string);
    }

    public static eif_0 eN(byte by) {
        for (eif_0 eif_02 : eif_0.values()) {
            if (eif_02.quV != by) continue;
            return eif_02;
        }
        return quT;
    }

    private eif_0(byte by) {
        this.quV = by;
    }

    @Override
    public String aXA() {
        return Byte.toString(this.quV);
    }

    @Override
    public String aXB() {
        return this.toString();
    }

    @Override
    public String aXC() {
        return null;
    }

    private static /* synthetic */ eif_0[] fwl() {
        return new eif_0[]{quT, quU};
    }

    static {
        quW = eif_0.fwl();
    }
}

