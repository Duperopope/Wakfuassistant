/*
 * Decompiled with CFR 0.152.
 */
final class bhu
extends Enum<bhu> {
    public static final /* enum */ bhu igv = new bhu(0);
    public static final /* enum */ bhu igw = new bhu(1);
    public static final /* enum */ bhu igx = new bhu(2);
    private final byte igy;
    private static final /* synthetic */ bhu[] igz;

    public static bhu[] values() {
        return (bhu[])igz.clone();
    }

    public static bhu valueOf(String string) {
        return Enum.valueOf(bhu.class, string);
    }

    private bhu(byte by) {
        this.igy = by;
    }

    public boolean a(bhu bhu2) {
        return this.igy > bhu2.igy;
    }

    private static /* synthetic */ bhu[] doy() {
        return new bhu[]{igv, igw, igx};
    }

    static {
        igz = bhu.doy();
    }
}

