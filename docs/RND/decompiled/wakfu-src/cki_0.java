/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from cki
 */
public class cki_0
extends nv_0 {
    private final long lXN;
    private final int lXO;
    private final int lXP;
    private final short lXQ;
    private final long lXR;

    public cki_0(long l, int n, int n2, short s, long l2) {
        this.lXN = l;
        this.lXP = n2;
        this.lXO = n;
        this.lXQ = s;
        this.lXR = l2;
    }

    @Override
    public byte[] aVX() {
        azg_1 azg_12 = new azg_1(26);
        azg_12.vC(this.lXP);
        azg_12.gK(this.lXN);
        azg_12.vC(this.lXO);
        azg_12.aG(this.lXQ);
        azg_12.gK(this.lXR);
        return this.a((byte)3, azg_12.bTe());
    }

    @Override
    public int d() {
        return 12130;
    }
}

