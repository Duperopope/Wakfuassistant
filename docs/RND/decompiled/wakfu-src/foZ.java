/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.map.hash.TByteObjectHashMap
 */
import gnu.trove.map.hash.TByteObjectHashMap;

public final class foZ
extends Enum<foZ> {
    public static final /* enum */ foZ sNi = new foZ(1, 5055);
    public static final /* enum */ foZ sNj = new foZ(3, 5071);
    private static final TByteObjectHashMap<foZ> sNk;
    private byte bff;
    private int sNl;
    private static final /* synthetic */ foZ[] sNm;

    public static foZ[] values() {
        return (foZ[])sNm.clone();
    }

    public static foZ valueOf(String string) {
        return Enum.valueOf(foZ.class, string);
    }

    private foZ(byte by, int n2) {
        this.bff = by;
        this.sNl = n2;
    }

    public byte aZv() {
        return this.bff;
    }

    public int ggb() {
        return this.sNl;
    }

    public static foZ hh(byte by) {
        return (foZ)((Object)sNk.get(by));
    }

    private static /* synthetic */ foZ[] ggc() {
        return new foZ[]{sNi, sNj};
    }

    static {
        sNm = foZ.ggc();
        sNk = new TByteObjectHashMap();
        for (foZ foZ2 : foZ.values()) {
            sNk.put(foZ2.aZv(), (Object)foZ2);
        }
    }
}

