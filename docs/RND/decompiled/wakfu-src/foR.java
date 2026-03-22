/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.map.hash.TByteObjectHashMap
 */
import gnu.trove.map.hash.TByteObjectHashMap;

public final class foR
extends Enum<foR> {
    public static final /* enum */ foR sMI = new foR(1);
    public static final /* enum */ foR sMJ = new foR(2);
    public static final /* enum */ foR sMK = new foR(3);
    public static final /* enum */ foR sML = new foR(4);
    public static final /* enum */ foR sMM = new foR(5);
    public static final /* enum */ foR sMN = new foR(6);
    private static final TByteObjectHashMap<foR> sMO;
    private final byte sMP;
    private static final /* synthetic */ foR[] sMQ;

    public static foR[] values() {
        return (foR[])sMQ.clone();
    }

    public static foR valueOf(String string) {
        return Enum.valueOf(foR.class, string);
    }

    private foR(byte by) {
        this.sMP = by;
    }

    public byte aJr() {
        return this.sMP;
    }

    public static foR hg(byte by) {
        return (foR)((Object)sMO.get(by));
    }

    private static /* synthetic */ foR[] gfV() {
        return new foR[]{sMI, sMJ, sMK, sML, sMM, sMN};
    }

    static {
        sMQ = foR.gfV();
        sMO = new TByteObjectHashMap();
        for (foR foR2 : foR.values()) {
            sMO.put(foR2.aJr(), (Object)foR2);
        }
    }
}

