/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.list.array.TIntArrayList
 */
import gnu.trove.list.array.TIntArrayList;
import java.util.Map;

public class bKQ
extends bKT {
    private final TIntArrayList kqQ = new TIntArrayList();
    private short kqR;

    public bKQ(int n, short s, short s2, short s3, fqa_0 fqa_02, boolean bl, short s4, Map<Long, int[]> map, int n2, boolean bl2) {
        super(n, s, s2, s3, fqa_02, bl, s4, map, n2, bl2);
    }

    public void E(int[] nArray) {
        this.kqQ.add(nArray);
    }

    public short ebW() {
        return this.kqR;
    }

    public void ca(short s) {
        this.kqR = s;
    }

    public int[] cuE() {
        return this.kqQ.toArray();
    }
}

