/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.map.hash.TByteObjectHashMap
 */
import gnu.trove.map.hash.TByteObjectHashMap;

public final class frk
extends Enum<frk> {
    public static final /* enum */ frk sXG = new frk(1, 0.05f, 0.05f, 0.7f);
    private static final TByteObjectHashMap<frk> sXH;
    public final byte sXI;
    public final float sXJ;
    public final float sXK;
    public final float sXL;
    private static final /* synthetic */ frk[] sXM;

    public static frk[] values() {
        return (frk[])sXM.clone();
    }

    public static frk valueOf(String string) {
        return Enum.valueOf(frk.class, string);
    }

    private frk(int n2, float f2, float f3, float f4) {
        this.sXI = (byte)n2;
        this.sXJ = f2;
        this.sXK = f3;
        this.sXL = f4;
    }

    public static frk hA(byte by) {
        return (frk)((Object)sXH.get(by));
    }

    private static /* synthetic */ frk[] gjX() {
        return new frk[]{sXG};
    }

    static {
        sXM = frk.gjX();
        sXH = new TByteObjectHashMap();
        for (frk frk2 : frk.values()) {
            sXH.put(frk2.sXI, (Object)frk2);
        }
    }
}

