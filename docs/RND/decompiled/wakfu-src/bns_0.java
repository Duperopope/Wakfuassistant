/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from bnS
 */
public class bns_0
extends eIb {
    private final int[] iKq;
    private final int[] iKr;

    public bns_0(int n, short s, short s2, long l, long[] lArray, int[] nArray, boolean bl, boolean bl2, boolean bl3, String string, short s3, int n2, int[] nArray2, int[] nArray3) {
        super(n, s, s2, l, lArray, nArray, bl, bl2, bl3, string, s3, n2);
        this.iKq = (int[])nArray2.clone();
        this.iKr = (int[])nArray3.clone();
    }

    public int[] cna() {
        return this.iKq;
    }

    public int[] dzD() {
        return this.iKr;
    }
}

