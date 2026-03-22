/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from eTj
 */
public class etj_0
extends QS {
    private final long rmT;
    private final short rmU;
    private final abi_1 rmV;
    private byte bin = (byte)-1;

    public etj_0(long l, int n, int n2, short s, qm_0 qm_02, long l2, qu_0 qu_02, short s2, abi_1 abi_12) {
        super(l, n, n2, s, qm_02, qu_02);
        this.rmT = l2;
        this.rmU = s2;
        this.rmV = abi_12;
    }

    public long Xi() {
        return this.rmT;
    }

    public short cmL() {
        return this.rmU;
    }

    public abi_1 bcB() {
        return this.rmV;
    }

    public void N(byte by) {
        this.bin = by;
    }

    public byte bcQ() {
        return this.bin;
    }
}

