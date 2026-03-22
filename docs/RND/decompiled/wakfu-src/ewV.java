/*
 * Decompiled with CFR 0.152.
 */
public final class ewV
extends Enum<ewV>
implements aoq_1 {
    public static final /* enum */ ewV oSi = new ewV(0, "Par co\u00fbt");
    public static final /* enum */ ewV oSj = new ewV(1, "Selon l'ordre d'AGT");
    private final byte oSk;
    private final String oSl;
    private static final /* synthetic */ ewV[] oSm;

    public static ewV[] values() {
        return (ewV[])oSm.clone();
    }

    public static ewV valueOf(String string) {
        return Enum.valueOf(ewV.class, string);
    }

    private ewV(byte by, String string2) {
        this.oSk = by;
        this.oSl = string2;
    }

    @Override
    public String aXA() {
        return String.valueOf(this.oSk);
    }

    @Override
    public String aXB() {
        return this.oSl;
    }

    @Override
    public String aXC() {
        return null;
    }

    public static ewV ez(byte by) {
        for (ewV ewV2 : ewV.values()) {
            if (ewV2.oSk != by) continue;
            return ewV2;
        }
        return null;
    }

    private static /* synthetic */ ewV[] ffi() {
        return new ewV[]{oSi, oSj};
    }

    static {
        oSm = ewV.ffi();
    }
}

