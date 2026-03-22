/*
 * Decompiled with CFR 0.152.
 */
import java.util.BitSet;

/*
 * Renamed from eNv
 */
public class env_0
extends eNB
implements eNs {
    private final int qYv;
    private final float qYw;
    private boolean qYx;
    private boolean esK;
    private final int qYy;
    private final float qYz;
    private boolean etL;

    public env_0(int n, int n2, aoh_1 aoh_12, int[] nArray, int[] nArray2, int[] nArray3, int[] nArray4, int[] nArray5, int[] nArray6, int[] nArray7, long l, anx_1 anx_12, boolean bl, int n3, float f2, boolean bl2, boolean bl3, int n4, float f3, float[] fArray, float f4, float f5, boolean bl4, boolean bl5, boolean bl6, boolean bl7, int n5, int n6, ang_2 ang_22, short s, float f6, byte by, boolean bl8, boolean bl9, boolean bl10, boolean bl11, aoh_1 aoh_13, boolean bl12, boolean bl13, boolean bl14, boolean bl15) {
        super(n, n2, aoh_12, nArray, nArray2, nArray3, nArray4, nArray5, nArray6, nArray7, l, anx_12, bl, fArray, f4, f5, bl4, bl5, bl6, bl7, n5, n6, ang_22, s, f6, by, bl8, bl9, bl10, false, bl11, aoh_13, bl13, bl14, bl15);
        this.qYv = n3;
        this.qYw = f2;
        this.qYy = n4;
        this.qYz = f3;
        this.qYx = bl3;
        this.esK = bl2;
        this.etL = bl12;
    }

    private env_0(int n, int n2, aoh_1 aoh_12, BitSet bitSet, BitSet bitSet2, BitSet bitSet3, BitSet bitSet4, BitSet bitSet5, BitSet bitSet6, BitSet bitSet7, long l, anx_1 anx_12, boolean bl, int n3, float f2, boolean bl2, boolean bl3, int n4, float f3, float[] fArray, float f4, float f5, boolean bl4, boolean bl5, boolean bl6, boolean bl7, int n5, int n6, ang_2 ang_22, short s, float f6, boolean bl8, boolean bl9, boolean bl10, boolean bl11, aoh_1 aoh_13, boolean bl12, boolean bl13, boolean bl14) {
        super(n, n2, aoh_12, bitSet, bitSet2, bitSet3, bitSet4, bitSet5, bitSet6, bitSet7, l, anx_12, bl, fArray, f4, f5, bl4, bl5, bl6, bl7, n5, n6, ang_22, s, f6, bl8, bl9, false, bl10, bl11, aoh_13, bl12, bl13, bl14);
        this.qYv = n3;
        this.qYw = f2;
        this.qYy = n4;
        this.qYz = f3;
    }

    @Override
    public byte aZG() {
        return 2;
    }

    @Override
    public Ua ei(short s) {
        short s2 = (short)(this.qYv + (int)Math.floor(this.qYw * (float)s));
        return Ua.pB(s2).bo(this.esK).bp(this.qYx).am((short)(s2 + 1));
    }

    @Override
    public Ua ej(short s) {
        short s2 = (short)(this.qYy + (int)Math.floor(this.qYz * (float)s));
        return Ua.pB(s2).bo(this.esK);
    }

    @Override
    public eNB fBs() {
        float[] fArray = this.fAm();
        float[] fArray2 = new float[fArray.length];
        System.arraycopy(fArray, 0, fArray2, 0, fArray.length);
        env_0 env_02 = new env_0(this.aZH(), this.avZ(), this.aZS(), this.aZJ(), this.aZK(), this.aZL(), this.aZM(), this.aZN(), this.aZO(), this.aZR(), this.aZU(), this.aZI(), this.aZT(), this.qYv, this.qYw, this.esK, this.qYx, this.qYy, this.qYz, fArray2, this.fAy(), this.fBv(), this.aZz(), this.aZC(), this.aZB(), this.aZD(), this.fAv(), this.fAw(), this.fAx(), this.aZV(), this.cxm(), this.aZE(), this.fAt(), this.fAo(), this.cxw(), this.fAB(), this.fAp(), this.fAq(), this.fAr());
        env_02.bfT = this.bfT;
        return env_02;
    }

    @Override
    public boolean cwA() {
        return this.etL;
    }

    @Override
    public /* synthetic */ enk_0 fAs() {
        return this.fBs();
    }

    @Override
    public /* synthetic */ Object clone() {
        return this.fBs();
    }
}

