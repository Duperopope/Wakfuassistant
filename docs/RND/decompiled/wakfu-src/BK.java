/*
 * Decompiled with CFR 0.152.
 */
public final class BK
extends Enum<BK> {
    public static final /* enum */ BK avs = new BK();
    public static final /* enum */ BK avt = new BK();
    private static final /* synthetic */ BK[] avu;

    public static BK[] values() {
        return (BK[])avu.clone();
    }

    public static BK valueOf(String string) {
        return Enum.valueOf(BK.class, string);
    }

    private static /* synthetic */ BK[] aHX() {
        return new BK[]{avs, avt};
    }

    static {
        avu = BK.aHX();
    }
}

