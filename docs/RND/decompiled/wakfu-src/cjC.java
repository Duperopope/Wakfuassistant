/*
 * Decompiled with CFR 0.152.
 */
public class cjC
extends nv_0 {
    private final String lWF;
    private final String lWG;
    private final String lWH;
    private final String lWI;
    private final long lWJ;

    public cjC(String string, String string2, String string3, String string4, long l) {
        this.lWF = string;
        this.lWG = string2;
        this.lWH = string3;
        this.lWI = string4;
        this.lWJ = l;
    }

    @Override
    public byte[] aVX() {
        boolean bl = this.lWH != null && !this.lWH.isEmpty();
        int n = this.lWF.getBytes().length + 1 + this.lWG.getBytes().length + 1 + (bl ? this.lWH.getBytes().length + 1 : 0) + 1 + this.lWI.getBytes().length + 8;
        azg_1 azg_12 = new azg_1(n);
        azg_12.gW(this.lWF);
        azg_12.gW(this.lWG);
        azg_12.aF(bl ? (byte)1 : 0);
        if (bl) {
            azg_12.gV(this.lWH);
        }
        azg_12.gW(this.lWI);
        azg_12.gK(this.lWJ);
        return this.a((byte)3, azg_12.bTe());
    }

    @Override
    public int d() {
        return 13369;
    }
}

