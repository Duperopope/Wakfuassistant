/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.map.hash.TByteObjectHashMap
 */
import gnu.trove.map.hash.TByteObjectHashMap;

public final class fjx
extends Enum<fjx>
implements aoq_1 {
    public static final /* enum */ fjx syQ = new fjx(0, "Sp\u00e9cialiste des combats de protecteur");
    public static final /* enum */ fjx syR = new fjx(1, "Gestionnaire de protecteur");
    public static final /* enum */ fjx syS = new fjx(2, "Chasseur de hors la loi");
    private static final TByteObjectHashMap<fjx> syT;
    private final byte syU;
    private final String syV;
    private static final /* synthetic */ fjx[] syW;

    public static fjx[] values() {
        return (fjx[])syW.clone();
    }

    public static fjx valueOf(String string) {
        return Enum.valueOf(fjx.class, string);
    }

    private fjx(byte by, String string2) {
        this.syU = by;
        this.syV = string2;
    }

    public byte aJr() {
        return this.syU;
    }

    @Override
    public String aXA() {
        return String.valueOf(this.syU);
    }

    @Override
    public String aXB() {
        return this.syV;
    }

    @Override
    public String aXC() {
        return null;
    }

    public static fjx gQ(byte by) {
        return (fjx)syT.get(by);
    }

    private static /* synthetic */ fjx[] gbU() {
        return new fjx[]{syQ, syR, syS};
    }

    static {
        syW = fjx.gbU();
        syT = new TByteObjectHashMap();
        for (fjx fjx2 : fjx.values()) {
            syT.put(fjx2.aJr(), (Object)fjx2);
        }
    }
}

