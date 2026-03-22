/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from cik
 */
public class cik_0
extends nv_0 {
    private byte[] lUD;

    @Override
    public byte[] aVX() {
        azg_1 azg_12 = new azg_1();
        azg_12.vC(this.lUD.length);
        azg_12.dH(this.lUD);
        return this.a((byte)8, azg_12.bTe());
    }

    @Override
    public int d() {
        return 465;
    }

    public void ej(byte[] byArray) {
        this.lUD = byArray;
    }
}

