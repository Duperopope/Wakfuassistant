/*
 * Decompiled with CFR 0.152.
 */
import java.util.BitSet;

public class eNE
extends eNB
implements end_0 {
    private final int qZm;
    private final float qZn;

    public eNE(int n, int n2, aoh_1 aoh_12, int[] nArray, int[] nArray2, int[] nArray3, int[] nArray4, int[] nArray5, int[] nArray6, int[] nArray7, long l, anx_1 anx_12, boolean bl, int n3, float f2, float[] fArray, float f3, float f4, boolean bl2, boolean bl3, boolean bl4, boolean bl5, int n4, int n5, ang_2 ang_22, short s, float f5, byte by, boolean bl6, boolean bl7, boolean bl8, boolean bl9, aoh_1 aoh_13, boolean bl10, boolean bl11, boolean bl12) {
        super(n, n2, aoh_12, nArray, nArray2, nArray3, nArray4, nArray5, nArray6, nArray7, l, anx_12, bl, fArray, f3, f4, bl2, bl3, bl4, bl5, n4, n5, ang_22, s, f5, by, bl6, bl7, false, bl8, bl9, aoh_13, bl10, bl11, bl12);
        this.qZm = n3;
        this.qZn = f2;
    }

    private eNE(int n, int n2, aoh_1 aoh_12, BitSet bitSet, BitSet bitSet2, BitSet bitSet3, BitSet bitSet4, BitSet bitSet5, BitSet bitSet6, BitSet bitSet7, long l, anx_1 anx_12, boolean bl, int n3, float f2, float[] fArray, float f3, float f4, boolean bl2, boolean bl3, boolean bl4, boolean bl5, int n4, int n5, ang_2 ang_22, short s, float f5, boolean bl6, boolean bl7, boolean bl8, boolean bl9, aoh_1 aoh_13, boolean bl10, boolean bl11, boolean bl12) {
        super(n, n2, aoh_12, bitSet, bitSet2, bitSet3, bitSet4, bitSet5, bitSet6, bitSet7, l, anx_12, bl, fArray, f3, f4, bl2, bl3, bl4, bl5, n4, n5, ang_22, s, s, bl6, false, bl7, bl8, bl9, aoh_13, bl10, bl11, bl12);
        this.qZm = n3;
        this.qZn = f2;
    }

    @Override
    public byte aZG() {
        return 1;
    }

    @Override
    public int ek(short s) {
        return this.qZm + (int)Math.floor(this.qZn * (float)s);
    }

    public eNE fBx() {
        float[] fArray = this.fAm();
        float[] fArray2 = new float[fArray.length];
        System.arraycopy(fArray, 0, fArray2, 0, fArray.length);
        eNE eNE2 = new eNE(this.aZH(), this.avZ(), this.aZS(), this.aZJ(), this.aZK(), this.aZL(), this.aZM(), this.aZN(), this.aZO(), this.aZR(), this.aZU(), this.aZI(), this.aZT(), this.qZm, this.qZn, fArray2, this.fAy(), this.fBv(), this.aZz(), this.aZC(), this.aZB(), this.aZD(), this.fAv(), this.fAw(), this.fAx(), this.aZV(), this.cxm(), this.aZE(), this.fAt(), this.fAo(), this.cxw(), this.fAB(), this.fAp(), this.fAq(), this.fAr());
        eNE2.bfT = this.bfT;
        return eNE2;
    }

    @Override
    public /* synthetic */ eNB fBs() {
        return this.fBx();
    }

    @Override
    public /* synthetic */ enk_0 fAs() {
        return this.fBx();
    }

    @Override
    public /* synthetic */ Object clone() {
        return this.fBx();
    }
}

