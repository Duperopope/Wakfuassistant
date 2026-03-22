/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from cyL
 */
public final class cyl_0
extends nv_0 {
    private final String mmK;

    public cyl_0(String string) {
        this.mmK = string;
    }

    @Override
    public byte[] aVX() {
        byte[] byArray = BH.aP(this.mmK);
        azg_1 azg_12 = new azg_1();
        azg_12.vC(byArray.length);
        azg_12.dH(byArray);
        return this.a((byte)2, azg_12.bTe());
    }

    @Override
    public int d() {
        return 23488;
    }
}

