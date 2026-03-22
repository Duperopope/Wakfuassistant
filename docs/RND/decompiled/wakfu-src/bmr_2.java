/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from bmr
 */
public final class bmr_2
extends Enum<bmr_2> {
    public static final /* enum */ bmr_2 iBj = new bmr_2(0);
    public static final /* enum */ bmr_2 iBk = new bmr_2(1);
    final byte iBl;
    private static final /* synthetic */ bmr_2[] iBm;

    public static bmr_2[] values() {
        return (bmr_2[])iBm.clone();
    }

    public static bmr_2 valueOf(String string) {
        return Enum.valueOf(bmr_2.class, string);
    }

    private bmr_2(byte by) {
        this.iBl = by;
    }

    public static bmr_2 bs(byte by) {
        for (bmr_2 bmr_22 : bmr_2.values()) {
            if (by != bmr_22.iBl) continue;
            return bmr_22;
        }
        return null;
    }

    private static /* synthetic */ bmr_2[] dwh() {
        return new bmr_2[]{iBj, iBk};
    }

    static {
        iBm = bmr_2.dwh();
    }
}

