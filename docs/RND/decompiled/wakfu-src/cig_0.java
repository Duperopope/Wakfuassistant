/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from cig
 */
public class cig_0
extends nv_0 {
    private long lUy;
    private String lUz;

    @Override
    public byte[] aVX() {
        azg_1 azg_12 = new azg_1();
        azg_12.gK(this.lUy);
        byte[] byArray = BH.aP(this.lUz);
        azg_12.vC(byArray.length);
        azg_12.dH(byArray);
        return this.a((byte)8, azg_12.bTe());
    }

    public void mX(long l) {
        this.lUy = l;
    }

    @Override
    public int d() {
        return 505;
    }

    public void os(String string) {
        this.lUz = string;
    }
}

