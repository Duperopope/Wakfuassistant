/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.map.hash.TIntIntHashMap
 *  gnu.trove.map.hash.TIntShortHashMap
 */
import gnu.trove.map.hash.TIntIntHashMap;
import gnu.trove.map.hash.TIntShortHashMap;

public class foS {
    private final TIntIntHashMap sMR = new TIntIntHashMap();
    private final TIntIntHashMap sMS = new TIntIntHashMap();
    private final TIntIntHashMap sMT = new TIntIntHashMap();
    private final TIntShortHashMap sMU = new TIntShortHashMap();
    private final TIntIntHashMap sMV = new TIntIntHashMap();
    private final TIntIntHashMap sMW = new TIntIntHashMap();
    private final TIntIntHashMap sMX = new TIntIntHashMap();
    private final TIntShortHashMap sMY = new TIntShortHashMap();

    public void a(int n, int n2, int n3, int n4, short s) {
        this.sMR.put(n, n2);
        this.sMS.put(n, n3);
        this.sMT.put(n, n4);
        this.sMU.put(n, s);
    }

    public void b(int n, int n2, int n3, int n4, short s) {
        this.sMV.put(n, n2);
        this.sMW.put(n, n3);
        this.sMX.put(n, n4);
        this.sMY.put(n, s);
    }

    public int Yd(int n) {
        return this.sMR.get(n);
    }

    public int Ye(int n) {
        return this.sMS.get(n);
    }

    public int Yf(int n) {
        return this.sMT.get(n);
    }

    public short Yg(int n) {
        return this.sMU.get(n);
    }

    public int Yh(int n) {
        return this.sMV.get(n);
    }

    public int Yi(int n) {
        return this.sMW.get(n);
    }

    public int Yj(int n) {
        return this.sMX.get(n);
    }

    public short Yk(int n) {
        return this.sMY.get(n);
    }

    public int[] gfW() {
        return this.sMR.keys();
    }

    public int[] gfX() {
        return this.sMV.keys();
    }
}

