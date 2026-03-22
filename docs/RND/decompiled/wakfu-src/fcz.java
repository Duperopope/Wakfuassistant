/*
 * Decompiled with CFR 0.152.
 */
public abstract sealed class fcz
extends Enum<fcz>
permits fcA, fcB, fcC, fcD, fcE, fcF, fcG, fcH {
    public static final /* enum */ fcz rTU = new fcA();
    public static final /* enum */ fcz rTV = new fcB();
    public static final /* enum */ fcz rTW = new fcC();
    public static final /* enum */ fcz rTX = new fcD();
    public static final /* enum */ fcz rTY = new fcE();
    public static final /* enum */ fcz rTZ = new fcF();
    public static final /* enum */ fcz rUa = new fcG();
    public static final /* enum */ fcz rUb = new fcH();
    private static final /* synthetic */ fcz[] rUc;

    public static fcz[] values() {
        return (fcz[])rUc.clone();
    }

    public static fcz valueOf(String string) {
        return Enum.valueOf(fcz.class, string);
    }

    public abstract eww a(fcy var1);

    protected static eww b(fcy fcy2) {
        for (fcz fcz2 : fcz.values()) {
            eww eww2;
            if (fcz2 == rTU || (eww2 = fcz2.a(fcy2)) == eww.oHf) continue;
            return eww2;
        }
        return eww.oHf;
    }

    private static /* synthetic */ fcz[] fSL() {
        return new fcz[]{rTU, rTV, rTW, rTX, rTY, rTZ, rUa, rUb};
    }

    static {
        rUc = fcz.fSL();
    }
}

