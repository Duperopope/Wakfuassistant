/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.map.hash.TIntObjectHashMap
 *  gnu.trove.map.hash.TLongObjectHashMap
 */
import gnu.trove.map.hash.TIntObjectHashMap;
import gnu.trove.map.hash.TLongObjectHashMap;

public class bgk {
    public static final bgk hZN = new bgk();
    private final TIntObjectHashMap<bfM> hZO = new TIntObjectHashMap();
    private final TLongObjectHashMap<bgc> hZP = new TLongObjectHashMap();
    private final TIntObjectHashMap<bgg> hZQ = new TIntObjectHashMap();

    private bgk() {
    }

    public bgg a(int n, bgh bgh2) {
        bgg bgg2 = (bgg)this.hZQ.get(n);
        if (bgg2 != null) {
            return bgg2;
        }
        bgg bgg3 = new bgg(bgh2);
        this.hZQ.put(bgg3.d(), (Object)bgg3);
        return bgg3;
    }

    public bfM Cx(int n) {
        bfM bfM2 = (bfM)this.hZO.get(n);
        if (bfM2 != null) {
            return bfM2;
        }
        bfM2 = new bgj(n);
        this.hZO.put(n, (Object)bfM2);
        return bfM2;
    }

    public bgc dk(int n, int n2) {
        long l = GC.s(n, n2);
        bgc bgc2 = (bgc)this.hZP.get(l);
        if (bgc2 != null) {
            return bgc2;
        }
        bgc2 = new bgc(n, n2);
        this.hZP.put(l, (Object)bgc2);
        return bgc2;
    }

    public void Cy(int n) {
        this.hZO.remove(n);
    }

    public void Cz(int n) {
        this.hZP.remove((long)n);
    }
}

