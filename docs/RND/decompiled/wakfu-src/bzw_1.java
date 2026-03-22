/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from bZw
 */
public final class bzw_1
extends Enum<bzw_1> {
    public static final /* enum */ bzw_1 lDj = new bzw_1(0);
    public static final /* enum */ bzw_1 lDk = new bzw_1(1);
    public static final /* enum */ bzw_1 lDl = new bzw_1(2);
    private final byte lDm;
    private static final /* synthetic */ bzw_1[] lDn;

    public static bzw_1[] values() {
        return (bzw_1[])lDn.clone();
    }

    public static bzw_1 valueOf(String string) {
        return Enum.valueOf(bzw_1.class, string);
    }

    private bzw_1(byte by) {
        this.lDm = by;
    }

    public String byf() {
        try {
            return String.format(auc_0.cVq().bS("windForceIconsPath"), this.ordinal());
        }
        catch (fu_0 fu_02) {
            return null;
        }
    }

    public byte aJr() {
        return this.lDm;
    }

    private static /* synthetic */ bzw_1[] epZ() {
        return new bzw_1[]{lDj, lDk, lDl};
    }

    static {
        lDn = bzw_1.epZ();
    }
}

