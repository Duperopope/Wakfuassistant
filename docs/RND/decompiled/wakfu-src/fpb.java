/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.map.hash.TByteObjectHashMap
 */
import gnu.trove.map.hash.TByteObjectHashMap;

public final class fpb
extends Enum<fpb> {
    public static final /* enum */ fpb sNn = new fpb(-1, 0);
    public static final /* enum */ fpb sNo = new fpb(1, -2);
    public static final /* enum */ fpb sNp = new fpb(2, 1);
    public static final /* enum */ fpb sNq = new fpb(3, 2);
    private static final TByteObjectHashMap<fpb> sNr;
    private final byte sNs;
    private final int sNt;
    private static final /* synthetic */ fpb[] sNu;

    public static fpb[] values() {
        return (fpb[])sNu.clone();
    }

    public static fpb valueOf(String string) {
        return Enum.valueOf(fpb.class, string);
    }

    private fpb(byte by, int n2) {
        this.sNs = by;
        this.sNt = n2;
    }

    public byte aJr() {
        return this.sNs;
    }

    public int ggd() {
        return this.sNt;
    }

    public static fpb gj(int n, int n2) {
        if (n2 == 0) {
            return sNn;
        }
        if (n == 0) {
            return sNo;
        }
        if (n == n2) {
            return sNq;
        }
        return sNp;
    }

    public static fpb hi(byte by) {
        return (fpb)((Object)sNr.get(by));
    }

    private static /* synthetic */ fpb[] gge() {
        return new fpb[]{sNn, sNo, sNp, sNq};
    }

    static {
        sNu = fpb.gge();
        sNr = new TByteObjectHashMap();
        for (fpb fpb2 : fpb.values()) {
            sNr.put(fpb2.sNs, (Object)fpb2);
        }
    }
}

