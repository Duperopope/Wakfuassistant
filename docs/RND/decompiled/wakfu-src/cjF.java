/*
 * Decompiled with CFR 0.152.
 */
public class cjF
extends nv_0 {
    private final int lWP;
    private final int lWQ;
    private final String lWR;

    public cjF(int n, int n2, String string) {
        this.lWP = n;
        this.lWQ = n2;
        this.lWR = string;
    }

    @Override
    public byte[] aVX() {
        azg_1 azg_12 = new azg_1(8 + this.lWR.getBytes().length + 1);
        azg_12.vC(this.lWP);
        azg_12.vC(this.lWQ);
        azg_12.gW(this.lWR);
        return this.a((byte)3, azg_12.bTe());
    }

    @Override
    public int d() {
        return 12421;
    }
}

