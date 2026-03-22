/*
 * Decompiled with CFR 0.152.
 */
public final class ftX
extends Enum<ftX> {
    public static final /* enum */ ftX tgZ = new ftX(0, "normal");
    public static final /* enum */ ftX tha = new ftX(1, "hidden");
    private final int thb;
    private final String thc;
    private static final /* synthetic */ ftX[] thd;

    public static ftX[] values() {
        return (ftX[])thd.clone();
    }

    public static ftX valueOf(String string) {
        return Enum.valueOf(ftX.class, string);
    }

    private ftX(int n2, String string2) {
        this.thb = n2;
        this.thc = string2;
    }

    public int d() {
        return this.thb;
    }

    public String getLabel() {
        return this.thc;
    }

    public static ftX aau(int n) {
        for (ftX ftX2 : ftX.values()) {
            if (n != ftX2.thb) continue;
            return ftX2;
        }
        return null;
    }

    private static /* synthetic */ ftX[] gmZ() {
        return new ftX[]{tgZ, tha};
    }

    static {
        thd = ftX.gmZ();
    }
}

