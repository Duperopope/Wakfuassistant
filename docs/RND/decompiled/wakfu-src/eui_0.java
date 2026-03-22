/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from eUI
 */
public final class eui_0
extends Enum<eui_0> {
    public static final /* enum */ eui_0 rxS = new eui_0(false, false);
    public static final /* enum */ eui_0 rxT = new eui_0(true, true);
    public static final /* enum */ eui_0 rxU = new eui_0(true, false);
    private final boolean rxV;
    private final boolean rxW;
    private static final /* synthetic */ eui_0[] rxX;

    public static eui_0[] values() {
        return (eui_0[])rxX.clone();
    }

    public static eui_0 valueOf(String string) {
        return Enum.valueOf(eui_0.class, string);
    }

    private eui_0(boolean bl, boolean bl2) {
        this.rxV = bl;
        this.rxW = bl2;
    }

    public boolean fLf() {
        return this.rxV;
    }

    public boolean fMy() {
        return this.rxW;
    }

    private static /* synthetic */ eui_0[] fMz() {
        return new eui_0[]{rxS, rxT, rxU};
    }

    static {
        rxX = eui_0.fMz();
    }
}

