/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from Ww
 */
public abstract class ww_0 {
    public static final int bNV = 32;
    public static final byte bNW = -1;
    public static final byte bNX = 7;
    public int bap;
    public int baq;
    public short ban;

    public abstract boolean aJ(int var1, int var2);

    public boolean aK(int n, int n2) {
        return n >= this.bap && n < this.bap + this.bmm() && n2 >= this.baq && n2 < this.baq + this.bmn();
    }

    protected int bmm() {
        return 18;
    }

    protected int bmn() {
        return 18;
    }

    public abstract int a(int var1, int var2, wt_0[] var3, int var4);

    public abstract short aL(int var1, int var2);

    public abstract int a(int var1, int var2, wu_0[] var3, int var4);

    public void a(apl_1 apl_12) {
        this.bap = apl_12.aIz() * 18;
        this.baq = apl_12.aIz() * 18;
        this.ban = apl_12.aIz();
    }

    protected final boolean a(int n, int n2, wt_0[] wt_0Array) {
        assert (wt_0Array != null);
        assert (wt_0Array.length >= 1) : "cellPathData array must have a size at least equal to one";
        assert (wt_0Array[0] != null) : "cellpathData array seems not to be initialized";
        assert (this.aK(n, n2)) : "The cell (" + n + ", " + n2 + ") doesn't belong to the map. Make sure that isInMap(x, y) is true before calling getPathData";
        return true;
    }

    protected final boolean a(int n, int n2, wu_0[] wu_0Array) {
        assert (wu_0Array != null);
        assert (wu_0Array.length >= 1) : "cellVisibilityData array must have a size at least equal to one";
        assert (wu_0Array[0] != null) : "cellVisibilityData array seems not to be initialized";
        assert (this.aK(n, n2)) : "The cell (" + n + ", " + n2 + ") doesn't belong to the map. Make sure that isInMap(x, y) is true before calling getVisibilityData";
        return true;
    }
}

