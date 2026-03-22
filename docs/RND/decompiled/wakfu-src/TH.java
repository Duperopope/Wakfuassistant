/*
 * Decompiled with CFR 0.152.
 */
public final class TH
extends Enum<TH> {
    public static final /* enum */ TH btH = new TH(true, true);
    public static final /* enum */ TH btI = new TH(false, true);
    public static final /* enum */ TH btJ = new TH(true, false);
    private final boolean btK;
    private final boolean btL;
    private static final /* synthetic */ TH[] btM;

    public static TH[] values() {
        return (TH[])btM.clone();
    }

    public static TH valueOf(String string) {
        return Enum.valueOf(TH.class, string);
    }

    private TH(boolean bl, boolean bl2) {
        this.btK = bl;
        this.btL = bl2;
    }

    public boolean big() {
        return this.btK;
    }

    public boolean bih() {
        return this.btL;
    }

    private static /* synthetic */ TH[] bii() {
        return new TH[]{btH, btI, btJ};
    }

    static {
        btM = TH.bii();
    }
}

