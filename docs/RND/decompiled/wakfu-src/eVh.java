/*
 * Decompiled with CFR 0.152.
 */
public final class eVh
extends Enum<eVh> {
    public static final /* enum */ eVh rzr = new eVh(0);
    public static final /* enum */ eVh rzs = new eVh(1);
    public static final /* enum */ eVh rzt = new eVh(2);
    private final byte rzu;
    private static final /* synthetic */ eVh[] rzv;

    public static eVh[] values() {
        return (eVh[])rzv.clone();
    }

    public static eVh valueOf(String string) {
        return Enum.valueOf(eVh.class, string);
    }

    private eVh(int n2) {
        this.rzu = (byte)n2;
    }

    byte aJr() {
        return this.rzu;
    }

    static eVh fF(byte by) {
        for (eVh eVh2 : eVh.values()) {
            if (eVh2.rzu != by) continue;
            return eVh2;
        }
        throw new IllegalArgumentException("Invalid State Id: " + by);
    }

    private static /* synthetic */ eVh[] fMX() {
        return new eVh[]{rzr, rzs, rzt};
    }

    static {
        rzv = eVh.fMX();
    }
}

