/*
 * Decompiled with CFR 0.152.
 */
public final class eIx
extends Enum<eIx>
implements aoq_1 {
    public static final /* enum */ eIx qwB = new eIx(0, "N'est pas impact\u00e9 par le chaos");
    public static final /* enum */ eIx qwC = new eIx(1, "Chaos mineur");
    public static final /* enum */ eIx qwD = new eIx(2, "Chaos basique");
    public static final /* enum */ eIx qwE = new eIx(3, "Chaos majeur");
    private final byte qwF;
    private final String qwG;
    private static final /* synthetic */ eIx[] qwH;

    public static eIx[] values() {
        return (eIx[])qwH.clone();
    }

    public static eIx valueOf(String string) {
        return Enum.valueOf(eIx.class, string);
    }

    private eIx(int n2, String string2) {
        this.qwF = (byte)n2;
        this.qwG = string2;
    }

    @Override
    public String aXA() {
        return String.valueOf(this.qwF);
    }

    @Override
    public String aXB() {
        return this.toString();
    }

    @Override
    public String aXC() {
        return this.qwG;
    }

    public static eIx eQ(byte by) {
        eIx[] eIxArray = eIx.values();
        for (int i = 0; i < eIxArray.length; ++i) {
            eIx eIx2 = eIxArray[i];
            if (eIx2.qwF != by) continue;
            return eIx2;
        }
        return null;
    }

    private static /* synthetic */ eIx[] fwC() {
        return new eIx[]{qwB, qwC, qwD, qwE};
    }

    static {
        qwH = eIx.fwC();
    }
}

