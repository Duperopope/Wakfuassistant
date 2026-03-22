/*
 * Decompiled with CFR 0.152.
 */
public final class fkO
extends Enum<fkO> {
    public static final /* enum */ fkO sCH = new fkO(0);
    public static final /* enum */ fkO sCI = new fkO(1);
    public static final /* enum */ fkO sCJ = new fkO(2);
    public static final /* enum */ fkO sCK = new fkO(3);
    private final byte sCL;
    private static final /* synthetic */ fkO[] sCM;

    public static fkO[] values() {
        return (fkO[])sCM.clone();
    }

    public static fkO valueOf(String string) {
        return Enum.valueOf(fkO.class, string);
    }

    private fkO(byte by) {
        this.sCL = by;
    }

    public byte aJr() {
        return this.sCL;
    }

    public static fkO gV(byte by) {
        for (fkO fkO2 : fkO.values()) {
            if (by != fkO2.sCL) continue;
            return fkO2;
        }
        return null;
    }

    private static /* synthetic */ fkO[] gcE() {
        return new fkO[]{sCH, sCI, sCJ, sCK};
    }

    static {
        sCM = fkO.gcE();
    }
}

